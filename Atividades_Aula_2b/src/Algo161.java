import javax.swing.*;

public class Algo161 {
    public static void main(String[] args) {

        /* Crie um algoritmo que o usuário entre com 5 numero e imprima o quadrado de cada um*/

        float numero;
        String s;
        // o laço vai repetir até o usuário digitar 5 números

        for(int i =1; i <= 5; i++){
           s = JOptionPane.showInputDialog("Digite um número: ");
           numero = Float.parseFloat(s);
           JOptionPane.showMessageDialog(null, "O Quadrado do número "+numero+" é "+Math.pow(numero, 2));





        }
    }
}
