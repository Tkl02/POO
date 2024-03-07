package exemplo.aula2;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite um valor maior que 0 ou -1 para parar");
            int nro = scan.nextInt();

            if(nro <  0){
                System.out.println("Nenhum número digitado");
                return;
            }

            int maior = nro;
            int menor = nro;
            int soma = nro;
            int qtd = 1;

            while(true){
                System.out.println("Digite um valor maior que 0 ou -1 para parar");
                nro = scan.nextInt();

                if(nro < 0) break;

                if(nro > maior) maior = nro;
                if(nro < menor) menor = nro;
                qtd++;
                soma += nro;
            }

            double media = soma / qtd;

            System.out.println(String.format("Foram digitados %s numeros", qtd));
            System.out.println("O maior número digitado foi "+maior);
            System.out.println("O menor número digitado foi "+menor);
            System.out.println("A soma dos números digitados foi "+soma);
            System.out.println("A média dos números digitados foi "+media);
        }
    }
}
