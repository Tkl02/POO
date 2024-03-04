// Você está trabalhando para um banco e precisa implementar uma conta corrente. Para isso é 
// necessário criar uma classe Conta Corrente que possui as informações básicas de uma conta e do 
// seu titular (defina pelo menos 5 atributos). Esta classe também deve conter três métodos básicos: 
// sacar, depositar e transferir. 
// Em todas operações realizadas na conta, o atributo saldo da conta não pode ser negativo! Sempre 
// valide essa informação.
// Ao final, crie uma classe main para instanciar os objetos Conta e testar a classe criada realizando 
// as operações propostas.

package aula4;

public class Main {
    public static void main(String[] args) {
        // criando conta 1
        ContaCorrente conta1 = new ContaCorrente(
                "Tiago da Silva",
                "64992113745",
                "111.111.111-11",
                "123456",
                "11/09/2000");
        // criando conta 2
        ContaCorrente conta2 = new ContaCorrente(
                "Amanda Costa",
                "64992113745",
                "111.111.111-11",
                "123456",
                "11/09/2000");

        // depositando valores
        conta1.depositar(1300);
        conta2.depositar(1500);
        // teste
        System.out.println("saldo conta1 pos deposito = " + conta1.getSaldo());
        System.out.println("saldo conta2 pos deposito = " + conta2.getSaldo());

        // sacando valor
        conta1.sacar(250);
        conta2.sacar(350);
        // teste
        System.out.println("saldo conta1 = " + conta1.getSaldo());
        System.out.println("saldo conta2 = " + conta2.getSaldo());

        // transferir valor
        conta1.transferir(conta2, 200);
        // resultado pos transferencia
        System.out.println("saldo conta1 = " + conta1.getSaldo());
        System.out.println("saldo conta2 = " + conta2.getSaldo());
    }
}