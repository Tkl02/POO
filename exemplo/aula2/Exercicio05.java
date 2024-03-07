package exemplo.aula2;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite a primeira cadeia de DNA: ");
            String dna1 = scan.nextLine();

            System.out.println("Digite a segunda cadeia de DNA: ");
            String dna2 = scan.nextLine();

            if(dna1.length() != dna2.length()){
                System.out.println("As cadeias informadas tem tamanhos diferentes!");
                return;
            }

            if(dna1.chars().anyMatch(c-> c != 'C' && c != 'A' && c != 'G' && c != 'T')){
                System.out.println(" A primeira cadeia informada tem caracteres inválidos!");
                return;
            }

            if(dna2.chars().anyMatch(c-> c != 'C' && c != 'A' && c != 'G' && c != 'T')){
                System.out.println(" A segunda cadeia informada tem caracteres inválidos!");
            }

            int distancia = 0;
            for(int i=0; i<dna1.length(); i++){
                if(dna1.charAt(i) != dna2.charAt(i)){
                    distancia++;
                }
            } 

            // int distancia =  IntStream.range(0, dna1.length())
            //         .reduce(0, (total, index) -> (dna1.charAt(index) != dna2.charAt(index)) ? ++total : total);
   

            System.out.println("A distância de Hamming das duas cadeias informadas é de "+distancia);
        }
            
    }
}
