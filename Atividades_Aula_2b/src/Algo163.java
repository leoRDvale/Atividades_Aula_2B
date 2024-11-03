public class Algo163 {
    public static void main(String[] args) {

        //Um correr dá 3 voltas ao redor de um lago, e a cada volta ele faá 5 abdominai
        //represente isso utilizando um for aninhado em outro for.

        int voltaLago, abdominais;
        for (voltaLago = 1; voltaLago <= 3; voltaLago++){
            System.out.println("\n"+voltaLago+"º volta no lago\n");
            for(abdominais = 1; abdominais <=5; abdominais++){
                System.out.println(abdominais+"º abdominais");
            }
        }
    }
}
