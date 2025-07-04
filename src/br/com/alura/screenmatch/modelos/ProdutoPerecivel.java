package br.com.alura.screenmatch.modelos;

public class ProdutoPerecivel extends Produto {
    String dataDeValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataDeValidade) {
        super(nome, preco, quantidade);
        this.dataDeValidade = dataDeValidade;
    }
}
