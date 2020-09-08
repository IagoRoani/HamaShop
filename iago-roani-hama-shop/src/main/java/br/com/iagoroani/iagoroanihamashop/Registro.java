package br.com.iagoroani.iagoroanihamashop;

import java.util.ArrayList;
import java.util.List;

public class Registro {

    //Atributos
    List<Produto> produtos;

    //Constructor
    public Registro() {
        produtos = new ArrayList<>();
    }

    //Métodos
    public List<Produto> exibirProdutos(){
        return produtos;
    }

    public void exibirHamaBeads(){
        for (Produto produto : produtos){
            if (produto instanceof HamaBeads){
                System.out.println(produto);
            }
        }
    }

    public void exibirCamisas(){
        for (Produto produto : produtos){
            if (produto instanceof CamisaSublimada){
                System.out.println(produto);
            }
        }
    }

    public void addProduto(Produto produto){
        produtos.add(produto);
    }


    public static void main(String[] args) {
        //Criação dos objetos das classes HamaBeads e CamisaSublimada
        HamaBeads chavei1 = new HamaBeads(100000, 2, "Chaveiro Mario Bros", 440, "Chaveio feito com hama beads com o molde do personaem da Nintendo Mario Bros");
        HamaBeads chavei2 = new HamaBeads(200000, 1, "Chaveiro Valorant", 290, "Cahveiro feito com hama beads, tendo como molde a logo do jogo Valorant");
        CamisaSublimada camisa1 = new CamisaSublimada(300000, 1, "Camisa Naruto v1", "Camisa estampada com uma imagem do Naruto Shippuden", 10.00, 2.50, 3.75, 12.00, 20.00);
        CamisaSublimada camisa2 = new CamisaSublimada(400000, 1, "Camisa One Piece v1", "Camisa estampada com uma imagem de one Piece",10.45, 3.55, 4.00, 12.00, 20.00);

        //Criação do objeto da classe Registro
        Registro registro = new Registro();

        System.out.println(chavei1);
        System.out.println(chavei2);
        System.out.println(camisa1);
        System.out.println(camisa2);

        chavei1.calcularPrecoCusto();
        chavei1.valorVenda();
        chavei2.calcularPrecoCusto();
        chavei2.valorVenda();
        camisa1.calcularPrecoCusto(10.00, 3.00, 5.50, 7.56, 20.00);
        camisa1.valorVenda();
        camisa2.calcularPrecoCusto(10.00, 3.00, 5.50, 7.56, 20.00);
        camisa2.valorVenda();

        registro.addProduto(chavei1);
        registro.addProduto(chavei2);
        registro.addProduto(camisa1);
        registro.addProduto(camisa2);

        registro.exibirProdutos();
        registro.exibirCamisas();
        registro.exibirHamaBeads();

    }

}
