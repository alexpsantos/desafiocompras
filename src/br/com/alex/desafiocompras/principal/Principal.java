package br.com.alex.desafiocompras.principal;

import br.com.alex.desafiocompras.modelo.CartaoDeCredito;
import br.com.alex.desafiocompras.modelo.ListaDeCompras;
import br.com.alex.desafiocompras.modelo.Produto;

import java.util.Scanner;

    public class Principal {
        public static void main(String[] args) {


            System.out.println("Digite o limite do cartão");
            Scanner scanner = new Scanner(System.in);
            CartaoDeCredito cartaoDeCredito = new CartaoDeCredito(scanner.nextDouble());
            scanner.nextLine();

            while(true) {

                Produto produto = new Produto();

                System.out.println("Digite a descrição da compra");
                produto.setNome(scanner.nextLine());

                System.out.println("Digite o valor do produto");
                produto.setValor(scanner.nextDouble());
                scanner.nextLine();

                boolean compraAprovada = cartaoDeCredito.registrarCompra(produto);

                if (!compraAprovada){
                    break;
                }

                System.out.println("Digite 0 para sair ou 1 para continuar");
                int escolha = scanner.nextInt();
                scanner.nextLine();
                if (escolha == 0) {
                    break;
                }
            }
            cartaoDeCredito.getLista().exibirLista();
            System.out.println("Saldo Disponivel " + cartaoDeCredito.getSaldoDisponivel());
        }
    }
