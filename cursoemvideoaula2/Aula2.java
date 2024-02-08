package cursoemvideoaula2;

public class Aula2 {
    public static void main(String[] args) {
        Caneta cA = new Caneta();
        cA.model = "bic";
        cA.cor = "azul";
        cA.ponta = 0.5f;
        cA.carga = 100;
        cA.tampa = false;

        Caneta cP = new Caneta();
        cP.model = "bic";
        cP.cor = "preta";
        cP.ponta = 1.0f;
        cP.carga = 80;
        cP.tampa = false;

        cP.status();
        cP.destampar();
        cP.rabisca();
        
    }
}
