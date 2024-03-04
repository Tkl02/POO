import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite os números para verificação com o algoritmo de Luhn: ");
        String numero = scan.nextLine();

        if(numero.length() <= 1) {
            System.out.println("Valor digitado inválido!");
            return;
        }
        
        System.out.println("Entrada original: "+numero);

        //Remover todos espaços
        numero = numero.replaceAll(" ", "");
        System.out.println("Entrada sem espaços: "+numero);

        int ctr = 1;
        int soma = 0;

        while(ctr <= numero.length()){
            int nro = Character.getNumericValue(numero.charAt(numero.length()-ctr));
            
            if(ctr%2 == 0){
                int dobro = nro * 2 ;
                if(dobro > 9) dobro -= 9;
                soma += dobro ;
            } 
            else soma += nro ;
        
            ctr++;
        }

        if(soma % 10 == 0){
            System.out.println("O número é VÁLIDO de acordo com o algoritmo de Luhn");
        }else{
            System.out.println("O número é INVÁLIDO de acordo com o algoritmo de Luhn");
        }



    }
}
