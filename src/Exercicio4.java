public class Exercicio4 {
    public static void main(String[] args) {
        //Poderia usar uma estrutura mais complexa aqui,
        // mas fiquei sem tempo e preferi apenas trazer a lógica

        double SP = 67836.43;
        double RJ = 36676.66;
        double MG = 29229.88;
        double ES = 27165.53;

        double somaValores = SP + RJ + MG + ES;

        System.out.println("Percentual de representação SP: "+ (String.format("%.2f" ,(100 * SP) / somaValores)) + "%");
        System.out.println("Percentual de representação RJ: "+ (String.format("%.2f" ,(100 * RJ) / somaValores)) + "%");
        System.out.println("Percentual de representação MG: "+ (String.format("%.2f" ,(100 * MG) / somaValores)) + "%");
        System.out.println("Percentual de representação ES: "+ (String.format("%.2f" ,(100 * ES) / somaValores)) + "%");

    }
}
