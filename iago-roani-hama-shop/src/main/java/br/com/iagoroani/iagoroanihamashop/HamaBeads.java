package br.com.iagoroani.iagoroanihamashop;

public class HamaBeads extends  Produto{

    //Atributos
    private String nome;
    private Integer quantPecas;
    private String descricao;
    private Double precoCusto = 0.0;
    private Double valorVenda = 0.0;

    //Contructor
    public HamaBeads(Integer codigo, Integer quantidade, String nome, Integer quantPecas, String descricao) {
        super(codigo, quantidade);
        this.nome = nome;
        this.quantPecas = quantPecas;
        this.descricao = descricao;
    }

    //Métodos
    public Double calcularPrecoCusto(){
        Double valorPeca = 0.02;
        return precoCusto = valorPeca * quantPecas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCódigo: " + getCodigo() +
                "\nQuantidade: " + getQuantidade() +
                "\nHamaBeads: " +
                "\nNome: " + nome +
                "\nQuantidade de peças usado: " + quantPecas +
                String.format("\nValor gasto: %.2f", precoCusto) +
                "\nDescrição: " + descricao +
                String.format("\nValor médio para venda: %.2f", valorVenda);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantPecas() {
        return quantPecas;
    }

    public void setQuantPecas(Integer quantPecas) {
        this.quantPecas = quantPecas;
    }

    public Double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(Double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //Métodos Abstrato
    @Override
    public Double valorVenda() {
        return valorVenda = precoCusto * 1.5;
    }

}
