public class Algo168 {
    public static void main(String[] args) {

        // Diagonal principal da matriz de ordem 10

        int linha, coluna, tabela;

        System.out.println("Diagonal Principal");
        for(linha = 1; linha <=10; linha ++){
            System.out.println(linha +" - "+linha);
            for(tabela = 1; tabela <= linha; tabela++){
                System.out.print("\t\t");
            }
        }

    }
}
