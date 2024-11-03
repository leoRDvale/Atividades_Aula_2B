import java.util.Scanner;

public class Algo184 {
    public static void main(String[] args) {
        //Entrar com 8 numeros e para cada um impirmir o log desse numero na bate 10

        int i;
        float numero;
        Scanner ler = new Scanner(System.in);
        for(i = 1; i<=8; i++){
            System.out.println("Digite um número: ");
            numero = ler.nextFloat();
            if(numero > 0){
                System.out.println("Logaritmo: "+ (Math.log(numero)/Math.log(10)));
            }else{
                System.out.println("Não existe Algoritmo de número negativo");
            }
        }
    }
}
