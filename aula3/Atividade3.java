/*
Você precisa desenvolver um sistema que permita o usuário digitar vários números inteiros, 
positivos ou negativos. Ao final, quando o usuário digita o valor -1, o programa deve calcular e 
exibir:
○ A quantidade de números digitados pelo usuário;
○ O maior número digitado;
○ O menor número digitado;
○ A média dos números digitados;
Para esse exercício você NÃO deve trabalhar com vetores ou ArrayList.
 */

package aula3;

import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantidade = 0;
        int maiorNum = 0;
        int menorNum = 0;
        int soma = 0;
        int numero = 0;
        double media = 0.00;

        System.out.println("Digite um numero (caso seja -1 encerra o programa).");

        while (numero != -1) {
            numero = (scan.nextInt());
            quantidade++;
            soma += numero;

            if (numero > maiorNum) {
                maiorNum = numero;
            }
            if (numero < menorNum) {
                menorNum = numero;
            }
            media = soma / quantidade;
        }

        System.out.println("Quantidade de numeros digitados: " + (quantidade - 1));
        System.out.println("Maior numero digitado: " + maiorNum);
        System.out.println("Menor numero digitado: " + menorNum);
        System.out.println("Media dos numeros: " + media);
        scan.close();

    }
}
