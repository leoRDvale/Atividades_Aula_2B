public class Algo169 {
    public static void main(String[] args) {
        //Diagrama Principal

        int linha, coluna;
        System.out.println("Abaixo da Diagonal Principal\n");

        for(linha = 2; linha <= 10; linha++){
            System.out.println("\n");
            for(coluna = 1; coluna < linha; coluna++){
                System.out.print(linha+" - "+coluna+"\t");
            }
        }
    }
}
