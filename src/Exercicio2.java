import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numeroLido = leia.nextInt();


        boolean pertenceASequencia = true;

        int primeiroTermo = 0;
        int segundoTermo = 1;

        if (primeiroTermo == numeroLido || segundoTermo == numeroLido ) {
            pertenceASequencia = true;
        }

        int proximoNumero = primeiroTermo + segundoTermo;

        while (proximoNumero <= numeroLido) {
            if (proximoNumero == numeroLido) {
                pertenceASequencia = true;
            }else{
                pertenceASequencia = false;
            }

            primeiroTermo = segundoTermo;
            segundoTermo = proximoNumero;
            proximoNumero = primeiroTermo + segundoTermo;

        }



        if (pertenceASequencia) {
            System.out.println("O número " + numeroLido + " PERTENCE a sequência Fibonacci!");
        }else{
            System.out.println("O número NÃO " + numeroLido + " PERTENCE a sequência Fibonacci!");
        }

    }
}
