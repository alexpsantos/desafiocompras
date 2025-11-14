package br.com.alex.desafiocompras.modelo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListaDeCompras {

    private List<Produto> listaDeCompras = new ArrayList<>();

    public void adicionarProduto (Produto produto){
        this.listaDeCompras.add(produto);
    }

    private void imprimirLinha() {
        System.out.println("********************");
    }

    public void exibirLista (){
        imprimirLinha();
        System.out.println("Compras realizadas:");
        this.listaDeCompras.sort(Comparator.comparing(Produto::getValor));
        for (Produto produto: this.listaDeCompras){
            System.out.println(produto.getNome() + " - " + produto.getValor());
        }
        imprimirLinha();
    }

}