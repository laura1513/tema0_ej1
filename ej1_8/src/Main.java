import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaDeDatos lista = new ListaDeDatos();
        String cad="";
        String cad2="";
        lista.incluir(cad);
        System.out.println("El programa acabará cuando introduzcas la palabra 'fin'");
        System.out.println("Se ha acreado una lista con las palabras introducidas anteriormente.");
        System.out.println("A continuación se buscará en dicha lista la palabra que introduzca");
        lista.contiene(cad2);
        lista.MostrarDatosOrdenados();
    }
}