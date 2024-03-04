import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01v2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] vetorCores = {"preto", "marrom", "vermelho", "laranja", "amarelo", "verde", "azul", "violeta", "cinza", "branco"};
        
        System.out.println("Digite as cores separadas por hífen: ");
        String stringCores = scan.nextLine();
        String[] cores = stringCores.split("-");

        int cor1 = -1;
        int cor2 = -1;

        for(int i=0; i<vetorCores.length; i++){
            if(vetorCores[i].equals(cores[0].toLowerCase())) cor1 = i;
            if(vetorCores[i].equals(cores[1].toLowerCase())) cor2 = i;
        }

        System.out.println(String.format("O valor do resistor é %s%s", cor1, cor2));
    }
}
