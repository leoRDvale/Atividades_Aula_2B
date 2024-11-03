public class Algo208 {
    public static void main(String[] args) {
        //Crie um algoritmo que imprima os 10 primeiros termos da sequencia de FIBONACCI
        // ---> os dois primeiro termos são 1 e 1, e os demais são gerados a partir da
        //soma dos anteriores. 1 1 2 3 5 8 13 21 34 ...

        int i, anterior, atual, proximo;
        anterior = 0;
        atual = 1;
        for(i = 1; i <= 10; i++){
            System.out.printf("Valor atual: "+atual+ " \n");
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

    }
}
