package data;
public class Conta{
  private Pessoa titular;
  private String numero;
  private String agencia;
  private double saldo;

  public Conta(Pessoa titular, String numero, String agencia){
    this.titular = titular;
    this.numero = numero;
    this.agencia = agencia;
    this.saldo = 0;
  }

  public Conta(Pessoa titular, String numero, String agencia, double valor){
    this.titular = titular;
    this.numero = numero;
    this.agencia = agencia;
    //this.saldo = valor;
    this.depositar(valor);
  }

  public Pessoa getTitular() {
    return this.titular;
  }

  public void setTitular(Pessoa titular) {
    this.titular = titular;
  }

  public String getNumero() {
    return this.numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public String getAgencia() {
    return this.agencia;
  }

  public void setAgencia(String agencia) {
    this.agencia = agencia;
  }

  public boolean sacar(double valor){
    if(valor <= this.saldo && valor > 0){
      this.saldo = this.saldo - valor;
      System.out.println("Conta "+ this.numero+": Saque realizado com sucesso!");
      return true;
    }
    System.out.println("Conta "+ this.numero+": Erro ao realizar o saque!");
    return false;   
  }

  public boolean depositar(double valor){
    if(valor > 0){
      saldo = saldo + valor;
      System.out.println("Conta "+ this.numero+": Deposito realizado com sucesso!");
      return true;
    }
    System.out.println("Conta "+ this.numero+": Erro ao realizar o depositar!");
    return false;
  }

  public boolean transferir(double valor, Conta contaDestino){
    System.out.println("Conta "+ this.numero+": Iniciou a transferencia");
    if(this.sacar(valor)){
      if(contaDestino != null && contaDestino.depositar(valor)){
        System.out.println("Conta "+ this.numero+": Transferencia concluida");
        return true;
      }
      System.out.println("Conta "+ this.numero+": Erro na transferencia");
      return false;
    }
    System.out.println("Conta "+ this.numero+": Erro na transferencia");
    return false;
  }

  void extrato(){
    System.out.println("O saldo da conta nro "+this.numero+" é "+this.saldo);
    System.out.println("----------------------------------");
  }
}
