package aula4;

//criando a classe.
public class ContaCorrente{
    private String nomeTitular;
    private String numeroTelefone, cpf, rg, dataNascimento;
    private float saldo;

    //construtor da classe.
    public ContaCorrente(String nomeTitular, String numeroTelefone, String cpf, String rg, String dataNascimento) {
        this.nomeTitular = nomeTitular;
        this.numeroTelefone = numeroTelefone;
        this.saldo = 0;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    // metodo de deposito (so pode ser depositado valores positivo)
    boolean depositar(float valor) {
        if (valor > 0) {
            this.saldo += valor;
            return true;
        }
        return false;
    }
    // metodo de saque (so pode ser sacado valores positivos e valores menores que o saldo);
    boolean sacar(float valor) {
        if (valor > 0 && this.saldo - valor >= 0) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }
    // metodo para transferir valores de uma contra para outra.
    boolean transferir(ContaCorrente outraConta, float valor) {
        if (sacar(valor)) {
            outraConta.depositar(valor);  // Sempre vai dar certo porque "sacar()" ja esta com restrições. 
            return true;
        }
        return false;
    }

    //get metodo de acesso para acessar cada atributo dos objetos criados.----------> usado para atributos privados.
    //set metodo de modificação para modificar cada atributos dos objetos cridos.---> usado para atributos privados.

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
   