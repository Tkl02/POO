package cursoemvideoaula2.atividade1;

public class Caneta {
    String model;
    String cor;
    float ponta;
    int carga;
    boolean tampa;
    
    void status(){
        System.out.println("model: " + this.model);
        System.out.println("cor: " + this.cor);
        System.out.println("ponta: " + this.ponta);
        System.out.println("carga: " + this.carga);
        System.out.println("tampada: " + this.tampa);
    }

    void rabisca (){
        if(this.tampa == true)
            System.out.println("destampe a caneta!");
        if (this.tampa == false) {
            System.out.println("menssagem escrita com sucesso!!");
        }
        else{
            System.out.println("Erro no programa !!!!!!!!");
        }

    }

    void tampar (){
        this.tampa = true;
    }

    void destampar (){
        this.tampa = false;
    }
}
