package br.com.iagoroani.iagoroanihamashop;

public class HamaBeads extends  Produto{

    //Atributos
    private Integer quantPecas;
    private Double precoCusto = 0.0;
    private Double valorVenda = 0.0;

    //Contructor
    public HamaBeads(Integer codigo, Integer quantidade, String nome, Integer quantPecas, String descricao) {
        super(codigo, quantidade, nome, descricao);
        this.quantPecas = quantPecas;
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
                "\nNome: " + getNome() +
                "\nQuantidade de peças usado: " + quantPecas +
                String.format("\nValor gasto: %.2f", precoCusto) +
                "\nDescrição: " + getDescricao() +
                String.format("\nValor médio para venda: %.2f", valorVenda);
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

    public Double getValorVendaUnidade() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    //Métodos Abstrato
    @Override
    public Double valorVenda() {
        return valorVenda = precoCusto + precoCusto * 1.5;
    }

}
