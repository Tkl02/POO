package aula4;

@SuppressWarnings("unused") // dizendo ao compilador para ignorar a menssage unused

// criando classe
class ContaCorrente {
    private Pessoa titular;
    private float saldo;
    private String id;

    // criando construtor da classe
    public ContaCorrente(Pessoa titular, float saldo, String id) {
        this.titular = titular;
        this.saldo = saldo;
        this.id = id;
    }

    // metodo de depositar
    public boolean depositar(float valor) {
        if (valor > 0) {
            this.saldo += valor;
            return true;
        }
        return false;
    }

    // metodo sacar
    public boolean sacar(float valor) {
        if (valor > 0 && this.saldo - valor >= 0) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    // metodo transferir
    public boolean transferir(ContaCorrente outraConta, float valor) {
        if (sacar(valor)) {
            outraConta.depositar(valor);
            return true;
        }
        return false;
    }

    // geters and setters para trabalhar com atributos privados
    public float getSaldo() {
        return saldo;
    }

    public String getId() {
        return id;
    }
}