package br.com.iagoroani.iagoroanihamashop;

public class CamisaSublimada extends Produto {

    //Atributos
    private Double precoCamisa;
    private Double impressao;
    private Double desgasteMaquinas;
    private Double transporte;
    private Double maoDeObra;
    private Double precoCusto;
    private Double valorVenda;

    //Constructor

    public CamisaSublimada(Integer codigo, Integer quantidade, String nome, String descricao, Double precoCamisa, Double impressao, Double desgasteMaquinas, Double transporte, Double maoDeObra) {
        super(codigo, quantidade, nome, descricao);
        this.precoCamisa = precoCamisa;
        this.impressao = impressao;
        this.desgasteMaquinas = desgasteMaquinas;
        this.transporte = transporte;
        this.maoDeObra = maoDeObra;
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
                "\nNome: " + getNome() +
                "\nValor gastos: " + precoCusto +
                "\nDescrição: " + getDescricao() +
                String.format("\nValor medio para venda: %.2f", valorVenda);
    }

    public Double getPrecoCamisa() {
        return precoCamisa;
    }

    public Double getImpressao() {
        return impressao;
    }

    public Double getDesgasteMaquinas() {
        return desgasteMaquinas;
    }

    public Double getTransporte() {
        return transporte;
    }

    public Double getMaoDeObra() {
        return maoDeObra;
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
}
