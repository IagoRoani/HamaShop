package br.com.iagoroani.iagoroanihamashop;

public abstract  class Produto {

    //Atributos
    private Integer codigo;
    private Integer quantidade;
    private String nome;
    private String descricao;

    //Constructor
    public Produto(Integer codigo, Integer quantidade, String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
