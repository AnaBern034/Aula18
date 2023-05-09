import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
      List<Integer> lista = new ArrayList<>();
      lista.add(1);
      lista.add(2);
      lista.add(3);
      lista.add(4);
      lista.add(6);
     lista.add(5);

        System.out.println("Lista original"+lista);
        lista.remove(5);
        System.out.println("Lista sem o numero 5: "+ lista);


    }
}
