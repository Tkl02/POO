package aula3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao = 0;

        System.out.println("qual atividade vc quer abrir? (2)(3)(4) ?");
        opcao = scan.nextInt();

        if (opcao == 2) {
            Atividade2.main(args);
        } else if (opcao == 3) {
            Atividade3.main(args);
        } else if (opcao == 4) {
            Atividade4.main(args);
        }
        scan.close();
    }
}
