package exemplo.aula2;

import java.util.HashMap;
import java.util.Scanner;

public class Exercicio01v3 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            HashMap<String, String> resistores = new HashMap<String, String>();
            resistores.put("preto", "0");
            resistores.put("marrom", "1");
            resistores.put("vermelho", "2");
            resistores.put("laranja", "3");
            resistores.put("amarelo", "4");
            resistores.put("verde", "5");
            resistores.put("azul", "6");
            resistores.put("violeta", "7"); 
            resistores.put("cinza", "8");
            resistores.put("branco", "9");

            System.out.println("Digite as cores separadas por hífen: ");
            String cores = scan.nextLine();
            String[] vetorCores = cores.split("-");

            System.out.println(String.format("O valor do resistor é %s%s", resistores.get(vetorCores[0]), resistores.get(vetorCores[1])));
        }
    }
}
