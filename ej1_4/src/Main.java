import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        int num;
        System.out.print("Introduce un número: ");
        num = read.nextInt();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        if (num>=1 && num<=12) {
            //Las posiciones del Array inician en 0
            System.out.println("El mes que has escogido es " + meses[num-1]);
        } else {
            System.out.println("Este mes no existe");
        }
    }
}