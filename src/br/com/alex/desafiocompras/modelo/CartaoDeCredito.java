package br.com.alex.desafiocompras.modelo;

public class CartaoDeCredito {

    private double limiteDoCartao;
    private ListaDeCompras lista = new ListaDeCompras();
    private double saldoDisponivel;

    public CartaoDeCredito (double limiteDoCartao){
        this.limiteDoCartao = limiteDoCartao;
        this.saldoDisponivel = limiteDoCartao;

    }

    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public void setLimiteDoCartao(double limiteDoCartao) {
        this.limiteDoCartao = limiteDoCartao;
    }

    public ListaDeCompras getLista() {
        return lista;
    }

    public boolean registrarCompra (Produto produto){
        if (produto.getValor() > saldoDisponivel){
            System.out.println("Saldo insuficiente, saldo atual: " + saldoDisponivel);
            return false;
        } else {
            lista.adicionarProduto(produto);
            saldoDisponivel -= produto.getValor();
            System.out.println("Compra realizada!");
            return true;
        }
    }
}
