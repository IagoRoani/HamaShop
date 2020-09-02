package br.com.iagoroani.iagoroanihamashop;

public class CamisaSublimada extends Produto {

    //Atributos
    private String nome;
    private Double precoCusto = 0.0;
    private String descricao;
    private Double valorVenda = 0.0;

    //Constructor
    public CamisaSublimada(Integer codigo, Integer quantidade, String nome, String descricao) {
        super(codigo, quantidade);
        this.nome = nome;
        this.descricao = descricao;
    }

    //Métodos abstrato
    @Override
    public Double valorVenda() {
        return valorVenda = precoCusto * 2.0;
    }

    //Métodos
    public Double calcularPrecoCusto(Double precoCamisa, Double impressao, Double desgasteMaquinas, Double trasporte, Double maoDeObra) {
        precoCusto = precoCamisa + impressao + desgasteMaquinas + trasporte + maoDeObra;
        return precoCusto;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCódigo: " + getCodigo() +
                "\nQuantidade: " + getQuantidade() +
                "\nCamisa Sublimada: " +
                "\nNome: " + nome +
                "\nValor gastos: " + precoCusto +
                "\nDescrição: " + descricao +
                String.format("\nValor medio para venda: %.2f", valorVenda);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
}
