import java.util.Scanner;

public class Algo186 {
    public static void main(String[] args) {
        //Entrar com quarto números e imprimir o cubo e a raiz cubica de cada numero
        // Math.cbrt(numero) --> raiz cubica
        //Math.pow(numero, potencia)

        int i;
        float numero;
        Scanner ler = new Scanner(System.in);
        for(i = 1; i <=4; i++){
            System.out.println("Digite um número: ");
            numero= ler.nextFloat();
            System.out.println("O resultado de "+numero+" ao cubo, é: "+ Math.pow(numero, 3));
            if(numero < 0){
                System.out.println("Não existe raiz de número negativo");
            }else{
                System.out.println("A raiz cúbida de "+numero+" é: "+ Math.cbrt(numero)); // Math.cbrt --> raiz cubica
            }

        }




    }
}
