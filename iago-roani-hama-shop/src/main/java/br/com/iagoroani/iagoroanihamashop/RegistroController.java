package br.com.iagoroani.iagoroanihamashop;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/registro")
public class RegistroController {

    //Atributos
    List<Produto> produtos;

    //Constructor
    public RegistroController() {
        produtos = new ArrayList<>();
    }

    //Métodos Rest
    @GetMapping("/{produto}")
    public List exibeProdutos(@PathVariable String produto) {
        List<Produto> produtosFiltrados = new ArrayList();
        for (Produto item : produtos) {
            if (produto.equals("produtos")) {
                return produtos;
            } else if (produto.equals("camisas")) {
                if (item instanceof CamisaSublimada){
                    produtosFiltrados.add(item);
                }
            } else if (produto.equals("hamabeads")) {
                if (item instanceof HamaBeads){
                    produtosFiltrados.add(item);
                }
            }
        }
        return produtosFiltrados;
    }

    @PostMapping("/cadastrar-hamabeads")
    public void addHamaBeads(@RequestBody HamaBeads hamaBeads){
        hamaBeads.calcularPrecoCusto();
        hamaBeads.valorVenda();
        produtos.add(hamaBeads);
    }

    @PostMapping("/cadastrar-camisa")
    public void addCamisas(@RequestBody CamisaSublimada camisaSublimada){
        Double precoCamisa = 0.0;
        Double impressao = 0.0;
        Double desgasteMaquinas = 0.0;
        Double transporte = 0.0;
        Double maoDeObra = 0.0;
        camisaSublimada.calcularPrecoCusto(precoCamisa, impressao, desgasteMaquinas, transporte, maoDeObra);
        camisaSublimada.valorVenda();
        produtos.add(camisaSublimada);
    }

    @PutMapping("/alterar-hamabeads/{id}")
    public void alterarHamaBeads(@PathVariable int id, @RequestBody HamaBeads hamaBeads){
        produtos.remove(id-1);
        produtos.add(id-1, hamaBeads);
    }

    @PutMapping("/alterar-camisa/{id}")
    public void alterarCachorro(@PathVariable int id, @RequestBody CamisaSublimada camisaSublimada){
        produtos.remove(id-1);
        produtos.add(id-1, camisaSublimada);
    }

    @DeleteMapping("/excluir-produto/{id}")
    public void excluirProduto(@PathVariable int id){
        produtos.remove(id-1);
    }


}
