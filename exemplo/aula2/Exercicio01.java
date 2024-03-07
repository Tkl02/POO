package exemplo.aula2;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            ArrayList<String> resistores = new ArrayList<String>();
            resistores.add("preto");
            resistores.add("marrom");
            resistores.add("vermelho");
            resistores.add("laranja");
            resistores.add("amarelo");
            resistores.add("verde");
            resistores.add("azul");
            resistores.add("violeta"); 
            resistores.add("cinza");
            resistores.add("branco");

            System.out.println("Digite as cores separadas por hífen: ");
            String cores = scan.nextLine();
            String[] vetorCores = cores.split("-");

            int cor1 = resistores.indexOf(vetorCores[0].toLowerCase());
            int cor2 = resistores.indexOf(vetorCores[1].toLowerCase());

            System.out.println(String.format("O valor do resistor é %s%s", cor1, cor2));
        }

    }
}
