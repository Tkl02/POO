package aula4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<ContaCorrente> contas = new ArrayList<>(); // gerando o array list
        Scanner scanner = new Scanner(System.in); // gerando o metodo scanner
        Random random = new Random(); // gerando o metodo random para conseguir gerar um "ID" para conta

        int opçao = -1;
        // start do programa

        while (opçao != 0) {
            // criando interface iniciar
            System.out.println("-".repeat(20));
            System.out.println("Selecione a operação desejada:");
            System.out.println("1. Criar conta");
            System.out.println("2. Exibir saldo");
            System.out.println("3. Sacar");
            System.out.println("4. Depositar");
            System.out.println("5. Transferir");
            System.out.println("0. Encerrar");
            System.out.println("-".repeat(20));

            opçao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            // criando conta do usuario
            if (opçao == 1) {
                System.out.println("Informe os dados do titular da conta:");
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Telefone: ");
                String telefone = scanner.nextLine();
                System.out.print("CPF: ");
                String cpf = scanner.nextLine();
                System.out.print("RG: ");
                String rg = scanner.nextLine();
                System.out.print("Data de Nascimento (xx/xx/xxxx): ");
                String dataNascimento = scanner.nextLine();

                Pessoa titular = new Pessoa(nome, telefone, cpf, rg, dataNascimento); // jogando dados do scan dentro da
                                                                                      // classe criando titular
                int id = random.nextInt(999999); // gerando um ID aleatoria para conta (chances de duplicar ID muito
                                                 // baixa)
                ContaCorrente conta = new ContaCorrente(titular, 0, Integer.toString(id));
                contas.add(conta); // adicionando a conta no array

                System.out.println("Conta criada com sucesso. ID da conta: " + id); // monstrando o ID da conta

                // mostrando saldo da conta
            } else if (opçao == 2) {
                System.out.print("Informe o ID da conta: ");
                String idConta = scanner.nextLine();
                for (ContaCorrente conta : contas) {// percorrendo elementos dentro do array
                    if (conta.getId().equals(idConta)) { // fazendo comparaçõs para fazer o get do saldo caso conta
                                                         // exista.
                        System.out.println("Saldo da conta " + idConta + ": " + conta.getSaldo());
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                }

                // sacar saldo da conta
            } else if (opçao == 3) {
                System.out.print("Informe o ID da conta: "); // requisição da conta
                String idConta = scanner.nextLine();
                System.out.print("Informe o valor a ser sacado: "); // requisição do valor
                float valor = scanner.nextFloat();

                // buscando conta para efetuar saque
                for (ContaCorrente conta : contas) {
                    if (conta.getId().equals(idConta)) {
                        if (conta.sacar(valor)) {
                            System.out.println("Saque efetuado com sucesso.");
                        } else {
                            System.out.println("Não foi possível efetuar o saque. Saldo insuficiente.");
                        }
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                }

                // depositar na conta
            } else if (opçao == 4) {
                // requisiçoes de dados
                System.out.print("Informe o ID da conta: ");
                String idConta = scanner.nextLine();
                System.out.print("Informe o valor a ser depositado: ");
                float valor = scanner.nextFloat();

                // busca de conta e aplicação do deposito
                for (ContaCorrente conta : contas) {
                    if (conta.getId().equals(idConta)) {
                        conta.depositar(valor);
                        System.out.println("Depósito efetuado com sucesso.");
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                }

                // transferir
                /*
                 * roteiro: fazer o get do ID de 2 contas e do valor a ser transferido
                 * jogar dados em novas variaveis para fazer a tranferencia
                 * fazer uma validação dos dados
                 * tentar fazer a transferencia.
                 */
            } else if (opçao == 5) {
                // requisição de dados conta1, conta2 e valor transferencia
                System.out.print("Informe o ID da conta de origem: ");
                String idConta1 = scanner.nextLine();
                System.out.print("Informe o ID da conta de destino: ");
                String idConta2 = scanner.nextLine();
                System.out.print("Informe o valor a ser transferido: ");
                float valor = scanner.nextFloat();

                ContaCorrente conta1 = null;// criando uma objeto dependente da classe com valores nulos (inicialização)
                ContaCorrente conta2 = null;

                // fazendo busca das contas e jogando nas variaveis
                for (ContaCorrente conta : contas) {
                    if (conta.getId().equals(idConta1)) {
                        conta1 = conta;
                    }
                    if (conta.getId().equals(idConta2)) {
                        conta2 = conta;
                    }
                }

                if (conta1 != null && conta2 != null) {
                    if (conta1.transferir(conta2, valor)) {
                        System.out.println("Transferência efetuada com sucesso.");// sucesso
                    } else {
                        System.out.println("Não foi possível efetuar a transferência. Saldo insuficiente.");// verificação
                                                                                                            // de saldo
                    }
                } else {
                    System.out.println("Conta de origem ou conta de destino não encontrada.");// verificação de conta
                }

                // else para encerrar todo o programa.
            } else if (opçao == 0) {
                System.out.println("Encerrando o programa...");

                // else da inicialização do programa (varivelopçoes invalidas)
            } else {
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }

        scanner.close();
    }
}

/*
 * lembrete:
 * tenta implementa metodos mais robustos
 * (trocar o IF else pelo Switch case)
 * (construir metodos e joga-los dentro do Switch case)
 */