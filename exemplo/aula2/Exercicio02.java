import java.util.Scanner;

public class Exercicio02{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double bonus = 0;
        double descontos = 0;

        System.out.println("Digite o valor do salário do usuário: ");
        double salarioBruto = scan.nextDouble();

        System.out.println("Digite a quantidade de faltas do funcionário no mês: ");
        int faltas = scan.nextInt();

        System.out.println("Digite a quantidade de produtos vendidos pelo usuário no mês: ");
        int qtdProdutosVendidos = scan.nextInt();

        if(faltas > 5){
            descontos = salarioBruto * 0.15;
            System.out.println("Devido a quantidade de faltas, o salário será descontado em R$"+descontos);
        } 

        if(qtdProdutosVendidos > 0 && qtdProdutosVendidos <= 20){
            bonus = qtdProdutosVendidos * 10;
            System.out.println("O bônus referente a quantidade de produtos vendidos será de R$"+bonus); 
        }else if(qtdProdutosVendidos > 20){
            bonus = qtdProdutosVendidos * 13;
            System.out.println("O bônus referente a quantidade de produtos vendidos será de R$"+bonus);
        }

        double salarioFinal = salarioBruto + bonus - descontos;

        System.out.println("O salário final o usuário é R$"+salarioFinal);

        
    }
}