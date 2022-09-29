import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        int num;
        System.out.print("Introduce un número: ");
        num = read.nextInt();

        switch (num) {
            //Números del 1 al 12 y el resto en default ya que no existen meses menores que 1 o mayores que 12
            case 1: System.out.println("El mes es Enero"); break;
            case 2: System.out.println("El mes es Febrero"); break;
            case 3: System.out.println("El mes es Marzo"); break;
            case 4: System.out.println("El mes es Abril"); break;
            case 5: System.out.println("El mes es Mayo"); break;
            case 6: System.out.println("El mes es Junio"); break;
            case 7: System.out.println("El mes es Julio"); break;
            case 8: System.out.println("El mes es Agosto"); break;
            case 9: System.out.println("El mes es Septiembre"); break;
            case 10: System.out.println("El mes es Octubre"); break;
            case 11: System.out.println("El mes es Noviembre"); break;
            case 12: System.out.println("El mes es Diciembre"); break;
            default: System.out.println("No existe ese mes"); break;
        }
    }
}