import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ListaDeDatos {
    Scanner read = new Scanner(System.in);
    String cad;
    String cad2;
    ArrayList<String> cadenas = new ArrayList<String>();
    public void incluir(String cadena) {
        System.out.println("El programa acabará cuando introduzcas la palabra 'fin'");
        do {
            System.out.print("Introduce una cadena de texto: ");
            cad = read.nextLine();
            cadenas.add(cad);
        } while (!cad.equalsIgnoreCase("fin"));
    }
    public boolean contiene(String cadena) {
        boolean fin;
        System.out.println("El programa terminará cuando introduzcas la palabra 'fin'.");
        do {
            System.out.print("Introduce una cadena de texto: ");
            cad2 = read.nextLine();
            if (cadenas.contains(cad2)) {
               fin = true;
                System.out.println("Se encuentra en la lista");
            } else {
                fin = false;
                System.out.println("No se encuentra en la lista");
            }
        } while (!cad2.equalsIgnoreCase("fin"));
        return fin;
    }
    public void MostrarDatosOrdenados() {
        Collections.sort(cadenas);
        System.out.println(cadenas);
    }
}
