package demo;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int n = 1;
        int divs = 2;
        int esprimo = 0;
        int j = scanner.nextInt();


        for(n=2;n<=j;n++) {

            if (n == 2){
               System.out.println("2 primo");
            }else {
                while (divs < n && esprimo != 1) {
                    if (n % divs == 0) {
                        esprimo = 1; //pongo en un 1 cuando da una división entera antes de terminar el loop, entonces no es primo.
                    } else {
                        divs++;
                    }
                }
                if (esprimo == 0) {
                    System.out.println(n + " primo");
                } else {
                    //System.out.println(n + "No es primo");
                }
            }
            //Reinicio los contadores para el loop.
            esprimo = 0;
            divs = 2;
        }
    }
}
