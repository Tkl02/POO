package data;
public class Pessoa {//POJO - Plain old Java Objects
  private String nome;
  private String cpf;
  private String rg;

  // public Pessoa(String cpf){
  //   this.cpf = cpf;
  // }

  public Pessoa(String nome, String cpf){//Nome e CPF são obrigatórios!
    this.nome = nome;
    this.cpf = cpf;
  }

  public Pessoa(String nome, String cpf, String rg){//RG Opcional
    this.nome = nome;
    this.cpf = cpf;
    this.rg = rg;
   
  }


  public String getNome() {
    return this.nome;  
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return this.cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  @Override
  protected void finalize() throws Throwable {
    // TODO Auto-generated method stub
    super.finalize();
  }

}
