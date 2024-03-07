package exemplo.aula2;

public class ex1 {

  public static void main(String[] args) {
    String frutas = "Banana; MACA;pera; UvA;abaCaTe";
    System.out.println(frutas);

    String frutasMinusculo = frutas.toLowerCase();
    System.out.println(frutasMinusculo);

    String frutasSemEspaco = frutasMinusculo.replace(" ", "");
    System.out.println(frutasSemEspaco);

    String vetorFrutas[] = frutasSemEspaco.split(";");

    String resultado = "";
    for(int i=0; i<vetorFrutas.length; i++){
      String fruta = vetorFrutas[i];
      resultado += fruta.charAt(0);
      resultado += fruta.charAt(fruta.length()-1);
    }

    System.out.println("Codigo "+resultado.toUpperCase());

    // Scanner scan = new Scanner(System.in);

    // System.out.println("Digite seu nome: ");
    // String nome = scan.next();
    // String sobrenome = scan.next();

    // int idade = scan.nextInt();

    // System.out.println("Bem vindo, "+nome+" "+sobrenome);


    // int vetor[] = new int[10];

    // for(int i=0; i< vetor.length; i++){
    //   int elemento = vetor[i];
    //   System.out.println(elemento);
    // }

    // for(int elemento : vetor){
    //   System.out.println(elemento);
    // }

    // System.out.println("Hello World");

    // int idade = 18;

    // if(idade == 18){
    //   //18
    // }else if(idade == 19){

    // }else if(idade == 20){

    // }else{

    // }

    // for(int i=0; i<10; i++){
    //   if(i == 6) break;
    //   System.out.println("Número "+i);
    // }
  }
}

