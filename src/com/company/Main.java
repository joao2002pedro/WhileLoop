package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Cliente> clienteList = new ArrayList<>();

    public static void main(String[] args) {
        int contador = 0;
        HI:
        while (true) {
            contador++;
            System.out.println("Quantas vezes você entrou? " + contador);
            System.out.println("Você deseja continuar ou sair do loop?");
            System.out.println("Se você deseja sair digite 1");
            System.out.println("Se você deseja criar uma entidade cliente digite 2");
            System.out.println("Se você deseja remover algum cliente da lista digite 3");
            System.out.println("Se você deseja buscar um cliente específico digite 4");
            System.out.println("Se você deseja ver a lista de clientes digite 5");
            System.out.println("Se você deseja atualizar a idade de um cliente digite 6");
            Scanner scanner = new Scanner(System.in);
            int opcaoEscolhida = scanner.nextInt();
            if (opcaoEscolhida == 1) {
                System.out.println("Você saiu do loop...");
                break HI;
            }
            if (opcaoEscolhida == 2) {
                Cliente cliente = new Cliente();
                System.out.println("Qual o nome e idade do cliente? ");
                Scanner atributosDoCliente = new Scanner(System.in);
                cliente.nome = atributosDoCliente.nextLine();
                cliente.idade = atributosDoCliente.nextInt();
                System.out.println("Cliente: " + cliente.nome);
                System.out.println("Idade do cliente: " + cliente.idade);
                clienteList.add(cliente);
                if(cliente.idade > 65){
                    cliente.aposentadoria = "R$2000,00";
                }
            }
            if (opcaoEscolhida == 3) {
                for (int i = 0; i <= clienteList.size(); i++) {

                    System.out.println("Qual cliente você deseja remover? ");
                    Scanner nomeExcluir = new Scanner(System.in);
                    String nomeD = nomeExcluir.nextLine();
                    if (nomeD.equals(clienteList.get(i).nome)) {
                        clienteList.remove(i);
                    }
                }
            }
            if (opcaoEscolhida == 4) {
                System.out.println("Qual o nome do cliente? ");
                Scanner nomeEsp = new Scanner(System.in);
                String nomeDig = nomeEsp.nextLine();
                for (Cliente c : clienteList) {
                    if (c.nome.equals(nomeDig)) {
                        System.out.println(c.nome);
                        System.out.println(c.idade);
                    }
                }
            }
            if (opcaoEscolhida == 5) {
                for (Cliente a : clienteList) {
                    System.out.println(a.nome);
                    System.out.println(a.idade);
                    System.out.println(a.aposentadoria);
                    System.out.println("----------");
                }
            }
//            if (opcaoEscolhida == 6) {
//                    System.out.println("Escolha um cliente: ");
//                    Scanner nomeEsc = new Scanner(System.in);
//                    String nomeCliE = nomeEsc.nextLine();
//                    System.out.println("Qual o novo nome: ");
//                    Scanner nomeNov = new Scanner(System.in);
//                    String nomeNovE = nomeNov.nextLine();
//                    for(Cliente n : clienteList){
//                        if
//                    }
//                }

            }
            for (Cliente a : clienteList) {
                System.out.println(a.nome);
                System.out.println(a.idade);
                System.out.println(a.aposentadoria);
                System.out.println("----------");
            }
        }
    }

