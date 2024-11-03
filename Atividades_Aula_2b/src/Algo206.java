import java.util.Scanner;

public class Algo206 {
    public static void main(String[] args) {
        //Crie um algoritmo que leia a quantidade de números que deseja digitar
        //imprima o maior e menor valor digitado
        //NÃO suponha que todos valores sejam positivos

        int i, qntNumeros;
        float numero, numMaior, numMenor;
        Scanner ler = new Scanner(System.in);
        System.out.println("Quantos números você deseja digitar? ");
        qntNumeros = ler.nextInt();
        System.out.println("Digite um número: ");
        numero = ler.nextFloat();
        numMaior = numero;
        numMenor = numero;
        for( i = 1; i < qntNumeros; i++){
            System.out.println("Digite o próximo número: ");
            numero = ler.nextFloat();
            if( numero > numMaior){
                numMaior = numero;
            }else if (numero < numMenor){
                numMenor = numero;

            }
        }
        System.out.println("Maior número: "+numMaior);
        System.out.println("Menor número: "+numMenor);

    }
}
