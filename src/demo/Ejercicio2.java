package demo;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i = 1;
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for(i=1;i<=n;i++){
            System.out.println(i*m);
        }
    }
}
