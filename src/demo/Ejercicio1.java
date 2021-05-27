package demo;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        int i=0;
        int par=0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(i<n){
            System.out.println(par);
            par= par+2;
            i++;
        }
    }
}
