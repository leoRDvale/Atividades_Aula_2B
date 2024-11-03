import java.util.Scanner;

public class Algo207 {
    public static void main(String[] args) {
        //Criar um algoritmo que calcula o produto de dois números inteiros
        //Supondo que os numeros sejam positivos e que o multiplicando seja menor
        //do que o mutiplicador.

        int num1, num2, i, soma;
        soma = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor do multiplicando: ");
        num1 = ler.nextInt();
        System.out.println("Digite o valor do multiplicador: ");
        num2 = ler.nextInt();
        for(i = 1; i <= num2; i++){
            soma = soma + num1;
        }
        System.out.println("O resultado do Produto é: "+soma);

    }
}
