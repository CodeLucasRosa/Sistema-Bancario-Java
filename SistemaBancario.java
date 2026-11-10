/// Sistema Bancario /// | ///Quando iniciar o banco, deve solicitar e armazenar o nome da pessoa/// | ///Permitir que o usuário deposite valores em sua conta/// | ///Permtir que ele faça saques///, ///definir um limite de 1.000,00 reais///, ///aplicar uma taxa de 5% sobre o valor do saque/// | Extrato bancario onde exibi o nome do cliente, o saldo atual e o histórico de todas as movimetações realizadas (depositos e saques) | O sistema deve apresentar um menu de opções em loop, permitindo que o usuário escolha opreação desejada até decidir encerrar o programa.

import java.util.Scanner;
import java.util.ArrayList;

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
        System.out.println("");

        int opcao;

        double saldo = 0;
        double deposito;
        double saque;
        ArrayList<String> historico = new ArrayList<>();

        double taxa = 0.05;

        while (true) {
            // Menu de Opções
            System.out.println("------ MENU ------");
            System.out.println("");
            System.out.println("Seu saldo é R$ " + saldo);
            System.out.println("");
            System.out.println("1 - Depositar | 2 - Saques | 3 - Extrato | 4 - Sair");
            System.out.print("Onde desejar ir: ");
            
            // Verifica se é digitado numero ou letra
            if (valor.hasNextInt()) {
                opcao = valor.nextInt();
                // Limita a seleção entre 1 a 4
                if (opcao < 1 || opcao > 4) {
                    System.out.println("");
                    System.out.println("Opção Inválida!");
                    System.out.println("");
                }
                // 1 - Depositar
                else if (opcao == 1){
                    System.out.println("");
                    System.out.print("Você deseja depositar: R$ ");
                    if (valor.hasNextDouble()) {
                        deposito = valor.nextDouble();
                        if (deposito < 0.05) {
                            System.out.println("");
                            System.out.println("Você tem que depositar um valor maior que R$ 0,05");
                        }
                        else if (deposito > 1000) {
                            System.out.println("");
                            System.out.println("Você tem um limite de R$ 1.000,00 para deposito");
                        }
                        else {
                            saldo = saldo + deposito;
                            System.out.println("Seu saldo atual é R$ " + saldo);
                        }
                    }
                    else {
                        System.out.println("Apenas números. Não use letras.");
                        valor.next();
                    }
                }
                // 2 - Saque 
                else if (opcao == 2) {
                    System.out.println("");
                    System.out.println("Seu saldo atual é R$ " + saldo);
                    System.out.print("Você deseja sacar: R$ ");
                    if (valor.hasNextDouble()) {
                        saque = valor.nextDouble();
                        double calculotaxa = saque * taxa;
                        double resultadotaxa = saque + calculotaxa;
                        if (saque > 1000) {
                            System.out.println("");
                            System.out.println("Você tem um limite para sacar de R$ 1000,00");
                            System.out.println("");
                        }
                        else if (saque < 0.05) {
                            System.out.println("");
                            System.out.println("Você tem que sacar um valor maior que 0,05");
                            System.out.println("");
                        }
                        else if (resultadotaxa <= saldo) {
                            System.out.println("");
                            System.out.println("Tem uma taxa de 5% sobre o saque.");
                            saldo = saldo - resultadotaxa;
                            System.out.println("Você sacou R$ " + saque);
                            System.out.println("Seu saldo agora é R$ " + saldo);
                            System.out.println("");
                        }
                        else {
                            System.out.println("");
                            System.out.println("Saldo Insuficiente, para pagar a taxa.");
                            System.out.println("");
                        }
                    }
                    else {
                        System.out.println("Apenas números. Não use letras.");
                        valor.next();
                    }
                }
                // 3 - Extrato
                else if (opcao == 3){
                    
                }
            }
            // Mensagem de erro caso no MENU seja colocado texto
            else {
                System.out.println("");
                System.out.println("");
                System.out.println("Erro! Digite apenas números.");
                System.out.println("");
                valor.next();
            }
        }
    }
}
