import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o tamanho da lista desejada? ");
        int tamanho = ler.nextInt();

        List<Integer> lista = retornoNumero (tamanho);

        adicionaValor(lista,tamanho);
        System.out.println("A média dos valores é: "+ Media(lista));
    }

        public static List<Integer> retornoNumero (int tamanho){
        List<Integer> lista  = new ArrayList<>(tamanho);

        return lista;

        }public static boolean adicionaValor(List<Integer>lista,int tamanho){
        Scanner ler =new Scanner(System.in);
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o"+ (i+1)+"valor: ");
            lista.add(ler.nextInt());}
        return false;

        } public static double Media(List<Integer> Lista){
        double media=0;

        for (int i = 0; i < Lista.size(); i++) {
            media = media/Lista.get(i);
        }
        return media;
    }
    }
