package io.renanperin.produtosapi.model;

public class Produto {

    private String id;
    private String nome;
    private String descricao;
    private Double preco;
    private Double codBarras;

    public Double getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(Double codBarras) {
        this.codBarras = codBarras;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String toString() {
        return "Produto{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", codBarras=" + codBarras +
                '}';
    }
}
