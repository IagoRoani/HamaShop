package br.com.iagoroani.iagoroanihamashop;

public abstract  class Produto {

    //Atributos
    private Integer codigo;
    private Integer quantidade;

    //Constructor
    public Produto(Integer codigo, Integer quantidade) {
        this.codigo = codigo;
        this.quantidade = quantidade;
    }

    //Métodos Abstratos
    public abstract Double valorVenda();

    //Métodos
    @Override
    public String toString() {
        return "Produto: ";
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
