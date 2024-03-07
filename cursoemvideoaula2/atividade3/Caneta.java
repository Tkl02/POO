package cursoemvideoaula2.atividade3;

public class Caneta {
    private String modelo;
    private Float ponta;
    protected Boolean tampa;

    public Caneta(String modelo, Float ponta, Boolean tampa) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.tampa = true;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Float getPonta() {
        return ponta;
    }

    public void setPonta(Float ponta) {
        this.ponta = ponta;
    }

    boolean status() {
        System.out.println("modelo da caneta: " + this.modelo);
        System.out.println("ponta da caneta: " + this.ponta);
        return true;
    }

    public void tampar(){
        tampa = true;
    }
    public void destampar(){
        tampa = false;
    }

    public void escrever() {
        if (tampa == false) {
            System.out.println("escrevendo ... ");
        } else {
            System.out.println("destampe a caneta.");
        }
    }
}
