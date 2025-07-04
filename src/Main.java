import br.com.alura.screenmatch.modelos.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        IdadePessoa idadePessoa = new IdadePessoa();

        idadePessoa.setNome("Erick Leonardo");
        idadePessoa.setIdade(29);

        String nomePessoa = idadePessoa.getNome();
        int idade = idadePessoa.getIdade();

        System.out.println(nomePessoa + idade);
        idadePessoa.verificarIdade();


        Produto produto = new Produto("Notebook", 5000.0);

        System.out.println("Nome do Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());

        produto.aplicarDesconto(10);
        System.out.println("Novo Preço após Desconto: " + produto.getPreco());

        Aluno aluno1 = new Aluno("Lulu", 7.5, 8.0, 9.2);
        Aluno aluno2 = new Aluno("Karina", 6.8, 7.3, 8.5);

        System.out.println("Aluno 1:");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Nota 1: " + aluno1.getNota1());
        System.out.println("Nota 2: " + aluno1.getNota2());
        System.out.println("Nota 3: " + aluno1.getNota3());
        System.out.println("Média: " + aluno1.calcularMedia());
        System.out.println();

        System.out.println("Aluno 2:");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Nota 1: " + aluno2.getNota1());
        System.out.println("Nota 2: " + aluno2.getNota2());
        System.out.println("Nota 3: " + aluno2.getNota3());
        System.out.println("Média: " + aluno2.calcularMedia());
        */

//        Livro livro1 = new Livro();
//        livro1.setTitulo("Lógica de Programação");
//        livro1.setAutor("Paulo Silveira");
//
//        Livro livro2 = new Livro();
//        livro2.setTitulo("A lógica do jogo");
//        livro2.setAutor("Marcus Becker");
//
//        livro1.exibirDetalhes();
//        livro2.exibirDetalhes();


//
//        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
//        Pessoa pessoa1 = new Pessoa("Erick", 29);
//        Pessoa pessoa2 = new Pessoa("Bandeco", 18);
//        Pessoa pessoa3 = new Pessoa("Adauel", 50);
//
//        listaDePessoas.add(pessoa1);
//        listaDePessoas.add(pessoa2);
//        listaDePessoas.add(pessoa3);
//
//        System.out.println("Tamanho da lista: " + listaDePessoas.size());
//        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0));
//        System.out.println("Lista de pessoas:");
//        for (Pessoa pessoa : listaDePessoas) {
//            System.out.println(pessoa);
//        }


        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        Produto produto1 = new Produto("Sabão", 15.99, 5);
        Produto produto2 = new Produto("Detergente", 10.49, 8);

        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);

        System.out.println("Tamanho da lista de produtos: " + listaDeProdutos.size());
        System.out.println("Lista de Produtos: ");
        for (Produto produto : listaDeProdutos) {
            System.out.println(produto);
        }

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Arroz", 12.99, 10, "2025-12-31");
        System.out.println(produtoPerecivel);

    }
}
