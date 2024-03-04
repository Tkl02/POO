package data;

public class Principal {
  public static void main(String[] args) {

    Pessoa titular = new Pessoa("Marcel", "123.456.789-00");
    Pessoa titular2 = new Pessoa("Marcelo", "123.456.789-11");

    Conta c1 = new Conta(titular, "1234", "123");
    Conta c2 = new Conta(titular2, "4321", "123", 100);

    c1.extrato();
    c2.extrato();
    c1.depositar(1000);
    c1.extrato();
    c2.extrato();

    c1.sacar(2000);

    // Em classes encapsuladas não é permitido acessar o atributo diretamente
    // c1.saldo = c1.saldo - 2000;

    c1.extrato();
    c2.extrato();

    c1.transferir(500, c2);

    c1.extrato();
    c2.extrato();

  }
}
