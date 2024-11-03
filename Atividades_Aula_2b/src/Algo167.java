public class Algo167 {
    public static void main(String[] args) {
        //Montar uma matriz de ordem 10 no formato ACIMA DA DIAGONAL PRINCIAL

        int linha, coluna, tabela;

        System.out.println("ACIMA DA DIAGONAL PRINCIPAL\n");
        for(linha = 1; linha <= 9; linha ++){
            for(coluna = linha +1; coluna <= 10; coluna ++){
                System.out.print("\t"+linha+" - "+ coluna);
            }
            System.out.println("\n");
            for(tabela = 1; tabela <= linha; tabela++){
                System.out.print("\t\t");
            }
        }
    }
}
