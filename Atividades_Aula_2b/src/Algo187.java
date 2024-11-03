import java.util.Scanner;

public class Algo187 {
    public static void main(String[] args) {
        //Crie um algoritmo que calcule e imprima o valor de b elevado a n.
        //o valor de n deve ser maior que 1 e inteiro
        //o valor de b tem que ser maior ou igual a 2 e também um inteiro

        int base, expoente, potencia, i;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor da ** base **, sendo um valor inteiro e maior que 1: ");
        base = ler.nextInt();
        System.out.println("Digite o valor do ** expoente **, sendo um valor inteiro e maior que 1: ");
        expoente = ler.nextInt();
        if(base >= 2 && expoente > 1){
            potencia = 1;
            for( i = 1; i <= expoente; i++){
                potencia = potencia * base;
            }
            System.out.println("Potência: "+potencia);
        }else{
            System.out.println("O valor não satisfaz os pré-requisitos");
        }

    }
}
