import java.util.Scanner;

public class Algo189 {
    public static void main(String[] args) {
        //Crie um algoritmo que imprima a conversão de Celsius-Fahrenheit para um intervalo
        //definido pelo usuario, como limite superior, inferior e o decremento (3 valores)
        // Fórmula de Conversão C = 5(F - 32)/9

        int i, tempMenor, tempMaior, decremento;
        float celsius;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor maior em Fahrenheit: ");
        tempMaior = ler.nextInt();
        System.out.println("Entre com o valor menor em Fahrenheit: ");
        tempMenor = ler.nextInt();
        System.out.println("Entre com o valor do decremento: ");
        decremento = ler.nextInt();
        for(i = tempMaior; i >= tempMenor; i = i - decremento ){
            celsius = ((float) (5 * (i - 32)) /9);
            System.out.println("A temperatura em graus Celsius é: "+celsius+"ºC");

        }



    }
}
