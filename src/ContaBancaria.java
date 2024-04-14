
import java.util.Scanner;

public class ContaBancaria {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*************************");
        System.out.println("Seja bem-vindo(a), qual ser nome completo?");

        String nomeCliente = scanner.nextLine();

        System.out.println("Seja bem-vindo(a) a sua conta bancária " + nomeCliente + "!");
        System.out.println("Informe o tipo o seu tipo de conta: \n1. Conta corrente \n2. Conta poupança");
        int tipoConta = scanner.nextInt();

        System.out.println("Qual seu saldo inicial?");
        double valorInicial = scanner.nextDouble();

        System.out.println("*************************");

        System.out.println("Dados iniciais do cliente: \nNome: " + nomeCliente + "\nSaldo inicial: " + valorInicial);
        if (tipoConta == 1) {
            System.out.println("Tipo conta: Corrente ");
        } else if (tipoConta == 2) {
            System.out.println("Tipo de conta: Poupança");
        } else {
            System.out.println("Tipo de conta inválida");
        }

        String menu = ("Operações \n 1. Consultar saldos \n 2. Receber valor \n 3. Transferir valor \n 4. Sair");

        int escolhaOperacao = 0;
        while (escolhaOperacao != 4) {
            System.out.println(menu);
            escolhaOperacao = scanner.nextInt();

            if (escolhaOperacao == 1) {
                System.out.println("O seu saldo é de " + valorInicial);
            } else if (escolhaOperacao == 2) {
                System.out.println("Qual valor deseja depositar?");
                double valorDeposito = scanner.nextDouble();
                System.out.println("Seu novo saldo é de: " + (valorInicial + valorDeposito));
            } else if (escolhaOperacao == 3) {
                System.out.println("Qual valor a ser transferido?");
                double valorTransferencia = scanner.nextDouble();
                if (valorTransferencia > valorInicial) {
                    System.out.println("Não há saldo suficiente para realizar a transferência");
                } else {
                    System.out.println("Seu novo saldo é de: " + (valorInicial - valorTransferencia));
                }
            } else if (escolhaOperacao == 4) {
                System.out.println("Operação encerrada");
            }
        }
    }
}