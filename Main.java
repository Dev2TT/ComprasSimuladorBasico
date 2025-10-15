package br.com.alura.Compras;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;

public class Main {

    public static void main(String[] args){
        ArrayList<Produto> carrinho = new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        boolean validacao = true;

        System.out.println("Seja bem Vindo!!!");
        System.out.println("-=-=-=-=-=-=--=");
        System.out.println("Digite o Nome do cartao: ");
        String aux= sc.nextLine();
        System.out.println("Digite o Limite do Cartao: ");
        double auxValor= sc.nextDouble();
        Cartao cartao = new CartaoCredito(aux, auxValor);

        while(validacao){
            System.out.println("Deseja comprar (1 - sim ou 2-não): ");
            int opcao= sc.nextInt();
            sc.nextLine();
            if(opcao == 1) {
                System.out.println("Nome Produto: ");
                String auxNome = sc.nextLine();
                System.out.println("Digite o valor: ");
                double auxValorDois=sc.nextDouble();
                sc.nextLine();
                Produto produto = new Produto(auxNome,auxValorDois);
                if (cartao.gastar(auxValor)){
                    cartao.gastar(auxValor);
                    carrinho.add(produto);
                }else{
                    System.out.println("Saldo insuficiente");

                }
            }

            System.out.println("Deseja sair (1 - sim ou 2-não): ");
            opcao=sc.nextInt();
            sc.nextLine();
            if (opcao == 1){
                System.out.println("Encerrando o programa!");
                System.out.println("-==-=-=-=-=-=-=-");
                validacao=false;
            }
        }

        carrinho.sort(Comparator.comparing(Produto::getValor));

        for(Produto produto : carrinho){
            System.out.println(produto);
        }
    }


}
