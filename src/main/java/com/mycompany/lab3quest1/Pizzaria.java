/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab3quest1;

import java.util.Scanner;

/**
 *
 * @author fleme
 */
public class Pizzaria {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha uma opcao:");
            System.out.println("1 - Massa Fina");
            System.out.println("2 - Massa Espessa");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    criarPizza(new MassaFinaPizza());
                    break;
                case 2:
                    criarPizza(new MassaEspessaPizza());
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao Invalida, tente novamente!");
            }

        } while (opcao != 0);
        scanner.close();
    }

    private static void criarPizza(Pizza pizza) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha um ingrediente:");
            System.out.println("1. Ovo");
            System.out.println("2. Queijo");
            System.out.println("3. Tomate");
            System.out.println("4. Azeitona");
            System.out.println("0. Voltar");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    pizza = new Ovo(pizza);
                    break;
                case 2:
                    pizza = new Queijo(pizza);
                    break;
                case 3:
                    pizza = new Tomate(pizza);
                    break;
                case 4:
                    pizza = new Azeitona(pizza);
                    break;
                case 0:
                    System.out.println("Voltando...");
                    break;
                default:
                    System.out.println("Opcao Invalida, tente novamente!");
            }
        } while (opcao != 0);

        System.out.println("Custo total da pizza: " + pizza.custo());
        System.out.println("Descricao da pizza: " + pizza.getDescricao());
    }
}
