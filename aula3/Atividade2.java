/*
 * Você precisa calcular o salário de um funcionário ao final do mês. No entanto, existem alguns 
fatores que podem incrementar ou decrementar o salário deste funcionário. 
• Se o funcionário faltou mais que 5 vezes no mês, ele deve ter o salário descontado em 
15%;
• Para cada produto que o funcionário vendeu, você deve dar um bônus de R$10,00 por 
produto; No entanto se ele vendeu mais que 20 produtos no mês, o bônus é de $13,00 
por produto vendido.
 */

package aula3;

import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
        // criando variaveis
        Scanner scan = new Scanner(System.in);
        double salario = 1300.00;
        double novoSalario = 0;

        // trabalhando com as faltas
        System.out.println("insira a quantidade de faltas: ");
        int faltas = scan.nextInt();
        if (faltas >= 0 && faltas < 5) {
            // não faça nada
        } else if (faltas >= 5 && faltas <= 30) {
            novoSalario = salario * 0.15;
        } else {
            System.out.println("digite o valor certo de faltas!!");
        }
        scan.reset();

        // trabalhando com produtos
        System.out.println("Insira o valor de produtos vendido: ");
        int produto = scan.nextInt();
        if (produto >= 0 && produto < 10) {
            // faça nada
        } else if (produto >= 10 && produto <= 20) {
            novoSalario = novoSalario + (produto * 10.00);
            System.out.println("Salario a ser recebido: " + novoSalario);
        } else if (produto > 20) {
            novoSalario = novoSalario + (produto * 13.00);
            System.out.println("Salario a ser recebido: ");
        } else {
            System.out.println("digite o valor correto de produtos!!");
        }

        System.out.println("Salario do mes: " + (salario + novoSalario));

        scan.close();
    }
}
