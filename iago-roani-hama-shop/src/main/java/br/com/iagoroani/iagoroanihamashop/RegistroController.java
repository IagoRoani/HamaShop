package br.com.iagoroani.iagoroanihamashop;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/registros")
public class RegistroController {

    //Atributos
    List<Produto> produtos;

    //Constructor
    public RegistroController() {
        produtos = new ArrayList<>();
    }

    //Métodos Rest

    @GetMapping
    public ResponseEntity exibeProdutos(){
        if (produtos.size() <= 0){
           return ResponseEntity.status(204).build();
        } else {
            return ResponseEntity.ok(produtos);
        }
    }

    @GetMapping("/{produto}")
    public ResponseEntity exibeProdutosFiltrados(@PathVariable String produto) {
        List<Produto> produtosFiltrados = new ArrayList();
        if (produtos.size() > 0) {
            for (Produto item : produtos) {
                if (produto.equals("camisas")) {
                    if (item instanceof CamisaSublimada) {
                        produtosFiltrados.add(item);
                    }
                } else if (produto.equals("hamabeads")) {
                    if (item instanceof HamaBeads) {
                        produtosFiltrados.add(item);
                    }
                }
            }
            return ResponseEntity.ok(produtosFiltrados);
        } else {
            return ResponseEntity.status(204).build();
        }
    }

    @PostMapping("/cadastrar-hamabeads")
    public ResponseEntity addHamaBeads(@RequestBody HamaBeads hamaBeads){
        hamaBeads.calcularPrecoCusto();
        hamaBeads.valorVenda();
        produtos.add(hamaBeads);
        return ResponseEntity.status(201).build();
    }

    @PostMapping("/cadastrar-camisa")
    public ResponseEntity addCamisas(@RequestBody CamisaSublimada camisaSublimada){
        camisaSublimada.calcularPrecoCusto(camisaSublimada.getPrecoCamisa(), camisaSublimada.getImpressao(),
                camisaSublimada.getDesgasteMaquinas(), camisaSublimada.getTransporte(), camisaSublimada.getMaoDeObra());
        camisaSublimada.valorVenda();
        produtos.add(camisaSublimada);
        return ResponseEntity.status(201).build();
    }

    @PutMapping("/alterar-hamabeads/{id}")
    public ResponseEntity alterarHamaBeads(@PathVariable int id, @RequestBody HamaBeads hamaBeads){
        if (produtos.size() >= id) {
            produtos.remove(id - 1);
            hamaBeads.calcularPrecoCusto();
            hamaBeads.valorVenda();
            produtos.add(id - 1, hamaBeads);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(404).build();
        }
    }

    @PutMapping("/alterar-camisa/{id}")
    public ResponseEntity alterarCachorro(@PathVariable int id, @RequestBody CamisaSublimada camisaSublimada){
        if (produtos.size() >= id) {
            produtos.remove(id - 1);
            camisaSublimada.calcularPrecoCusto(camisaSublimada.getPrecoCamisa(), camisaSublimada.getImpressao(),
                    camisaSublimada.getDesgasteMaquinas(), camisaSublimada.getTransporte(), camisaSublimada.getMaoDeObra());
            camisaSublimada.valorVenda();
            produtos.add(id - 1, camisaSublimada);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(404).build();
        }
    }

    @DeleteMapping("/excluir-produto/{id}")
    public ResponseEntity excluirProduto(@PathVariable int id){
        if (produtos.size() >= id) {
            produtos.remove(id - 1);
            return ResponseEntity.ok().build();
        }
        else {
            return ResponseEntity.status(404).build();
        }
    }


}
