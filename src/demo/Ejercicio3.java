package demo;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int n = scanner.nextInt();
        int divs = 2;
        int esprimo = 0;

        if(n==1){
            System.out.println("1 es primo");
        }
        else{
            while(divs<n && esprimo!=1){
                if(n%divs == 0){
                    esprimo=1;
                }
                else{
                    divs++;
                }
            }
            if(esprimo==0){
                System.out.println("Es primo");
            }
            else{
                System.out.println("No es primo");
            }
        }
    }
}
