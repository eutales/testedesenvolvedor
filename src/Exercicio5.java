public class Exercicio5 {
    public static void main(String[] args) {
        //Passo a passo
        //Criar váriaveis das strings,original e invertida
        //passar a string para um array de caracteres
        //trocar os caracteres com while

        String original = "Candidato: Tales Siqueira";


        char[] caracteres = original.toCharArray();
        int inicioString = 0;
        int fimString = (caracteres.length - 1);

        while (inicioString <= fimString) {
            char letraTemporaria = caracteres[inicioString];
            caracteres[inicioString] = caracteres[fimString];
            caracteres[fimString] = letraTemporaria;
            inicioString++;
            fimString--;
        }

        String invertida = new String(caracteres);

        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);




    }
}
