import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String cad;
        String cad2;
        ArrayList<String> cadenas = new ArrayList<String>();
        System.out.println("El programa acabará cuando introduzcas la palabra 'fin'");
        do {
            System.out.print("Introduce una cadena de texto: ");
            cad = read.next();
            cadenas.add(cad);
        } while (!Objects.equals(cad, "fin"));
        System.out.println("El programa acabará cuando introduzcas la palabra 'fin'");
        do {System.out.print("Introduce una cadena de texto  para buscarla en la lista: ");
            cad2 = read.next();
            if (cadenas.contains(cad2)) {
                System.out.println("La palabra aparece en la lista");
            } else {
                System.out.println("La palabra no aparece en la lista");
            }
        } while (!Objects.equals(cad2, "fin"));
    }
}