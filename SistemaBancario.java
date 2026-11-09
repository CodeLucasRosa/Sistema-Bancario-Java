// Sistema Bancario | /Quando iniciar o banco, deve solicitar e armazenar o nome da pessoa/ | Permitir que o usuário deposite valores em sua conta | Permtir que ele faça saques, definir um limite de 1.000,00 reais, aplicar uma taxa de 5% sobre o valor do saque | Extrato bancario onde exibi o nome do cliente, o saldo atual e o histórico de todas as movimetações realizadas (depositos e saques) | O sistema deve apresentar um menu de opções em loop, permitindo que o usuário escolha opreação desejada até decidir encerrar o programa.

import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        // Criação do objeto Scanner para leitura.
        Scanner valor = new Scanner(System.in);

        // Solicitação do nome do usuário e boas-vindas.
        System.out.println("Bem-vindo ao Sistema Bancário!");
        System.out.print("Por favor, insira seu nome: ");
        String nome = valor.next();
        System.out.println("");
        System.out.println("Olá " + nome +", Seja bem-vindo(a) ao seu banco!");

        // Menu | 1 - Depositar | 2 - Saques | 3 - Extrato | 4 - Sair
        
        int opcao;
        double saldo = 0;
        double deposito;

        while (true) {
            // Menu de Opções
            System.out.println("------ MENU ------");
            System.out.println("1 - Depositar | 2 - Saques | 3 - Extrato | 4 - Sair");
            System.out.print("Onde desejar ir: ");
            opcao = valor.nextInt();
        }
    }
}
