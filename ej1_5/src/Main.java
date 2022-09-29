import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        int num;
        System.out.print("Introduce un número: ");
        num = read.nextInt();
        if (esPrimo(num) == false) {
            System.out.println("El número "+num+" no es primo");
        } else {
            System.out.println("El número "+num+" es primo");
        }
        if (esPalindromo(num) == false) {
            System.out.println("El número "+num+" no es palindromo");
        } else {
            System.out.println("El número "+num+" es palindromo");
        }

    }
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero % 2 == 0) {
            return false;
        }
        for(int i=3;i*i <= numero ;i+=2) {
            if(numero%i==0)
                return false;
        }
        return true;
    }
    public static boolean esPalindromo(int numero) {
        int rev = 0;
        int n = numero;
        while (n > 0) {
            /*
            esto almacenará el último dígito de `n` en la variable `r`
            por ejemplo, si `n` es 1234, entonces `r` sería 4
             */
            int r = n % 10;

            /*
             añade `r` a `rev` en el lugar de uno
             por ejemplo, si `rev = 65` y `r = 4`, entonces el nuevo `rev`
             sería 654
             */
            rev = rev * 10 + r;

            /*
            elimina el último dígito de `n`
            por ejemplo, si `n` es 1234, entonces la nueva `n` sería 123
             */
            n = n / 10;
        }
        if  (numero == rev) {
            return true;
        }
        return false;
    }
}