public class Algo166 {
    public static void main(String[] args) {

        //Triangular uma matriz de ordem 10 ( 10 linhas e 10 colunas) usando a estrutura FOR

        int linha, coluna;

        System.out.println("\nTODOS\n");
        for(linha = 1; linha <= 10; linha++){
            for(coluna = 1; coluna <= 10; coluna++){
                System.out.print(linha+" - "+coluna+"\t\t");
            }
            System.out.println("\n");
        }
    }
}
