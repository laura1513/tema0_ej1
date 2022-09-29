import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num;
        int num2;
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        System.out.println("El programa acabará cuando introduzcas un número negativo");
        do {
            System.out.print("Introduce un número: ");
            num = read.nextInt();
            numeros.add(num);
        } while (num>=0);
        System.out.println("El programa acabará cuando introduzcas un número negativo");
        do {System.out.print("Introduce un número para buscarlo en la lista: ");
            num2 = read.nextInt();
            if (numeros.contains(num2)) {
                System.out.println("El número aparece en la lista");
            } else {
                System.out.println("El número no aparece en la lista");
            }
        } while (num2>=0);
    }

}