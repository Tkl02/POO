/*
 * 4. Dado um número, determine se ele é ou não válido de acordo com a fórmula de Luhn. O 
algoritmo Luhn é uma fórmula de soma de verificação simples usada para validar uma 
variedade de números de identificação, como números de cartão de crédito. O objetivo deste 
exercício é determinar se uma String de números é ou não válida.
 
Validando um número
• Strings de comprimento 1 ou menos não são válidas. Espaços são permitidos na entrada, 
mas devem ser removidos antes da verificação. Todos os outros caracteres que não sejam 
dígitos não são permitidos.
Exemplo: Número de cartão de crédito válido
4539 3195 0343 6467
A primeira etapa do algoritmo de Luhn é remover os espaços e dobrar cada segundo dígito, 
começando pela direita. nós estaremos dobrando
4_3_ 3_9_ 0_4_ 6_6_
Se dobrar o número resultar em um número maior que 9, subtraia 9 do produto. Os resultados da 
nossa duplicação:
8569 6195 0383 3437
Em seguida, some todos os dígitos:
8+5+6+9+6+1+9+5+0+3+8+3+3+4+3+7 = 80
Se a soma for divisível por 10, o número é válido. Este número é válido! Caso contrário, o número é 
inválido. 
 */

package aula3;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        int i = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero para a verificacao de lhun: ");
        String lhun = scan.nextLine();
        lhun = lhun.replace(" ", "");

        if (!lhun.matches("\\d+")) {
            System.out.println("Digite um número válido");
        } else {
            long numero = Long.parseLong(lhun);

            if (numero <= 1) {
                System.out.println("Digite um valor maior que 1");
            } else {
                // jogando cada valor numeros para o vetor
                int vetor[] = new int[lhun.length()];
                for (i = 0; i < lhun.length(); i++) {
                    vetor[i] = Character.getNumericValue(lhun.charAt(i));
                }
                // logica para o calculo de cada numero
                int soma = 0;
                for (i = vetor.length - 1; i >= 0; i--) { // Começar do último dígito
                    int digito = vetor[i];
                    if ((vetor.length - i) % 2 == 0) { // Verificar se a posição é par
                        digito *= 2;
                        if (digito > 9) {
                            digito -= 9;
                        }
                    }
                    soma += digito;
                }
                if (soma % 10 == 0) {
                    System.out.println("Número lhun válido.");
                } else {
                    System.out.println("Número lhun inválido.");
                }
            }

        }
        scan.close();
    }
}