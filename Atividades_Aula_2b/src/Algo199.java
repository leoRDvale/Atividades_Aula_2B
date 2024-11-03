import java.util.Scanner;

public class Algo199 {
    public static void main(String[] args) {
        //crie um algoritmo que leia os limites inferior e superior de um intervalo e imprima
        //todos os numeros múltiplos de 6. Suponha que os dados difitados sao para um intervalo crescente


        int i, valorInicial, valorFinal;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor inicial de um intervalo: ");
        valorInicial = ler.nextInt();
        System.out.println("Digite o valor final do intervalo: ");
        valorFinal = ler.nextInt();
        if( valorInicial % 6 == 0){
            valorInicial = valorInicial + 6;
        }else{
            valorInicial = valorInicial + (6 - (valorInicial % 6));
            valorFinal --;
        }
        for(i = valorInicial; i <= valorFinal; i = i +6){
            System.out.println(i+" \n");
        }


    }
}
