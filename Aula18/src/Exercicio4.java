import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numeros ");
        int numero = ler.nextInt();

        System.out.println("Digite outro numero");
        int numeroDois = ler.nextInt();

        if (numero>numeroDois){
            System.out.println(numero+"......."+numeroDois);
        } else if (numero<numeroDois) {
            System.out.println(numeroDois+"....."+numero);

        }


    }
}
