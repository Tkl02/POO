package cursoemvideoaula2.atividade3;

public class man {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("bic", 0.5f, true);
        
        c1.status();
        c1.tampar();
        c1.escrever();
        c1.destampar();
        c1.escrever();
    }
}
