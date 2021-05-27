package demo;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String c = "";
        int i = 0; //contador
        int j = 0; //contador
        int k = 0; //contador
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int d=scanner.nextInt(); //llimitado de 0 a 9
        int loop=0;
        int conta=0;
        int iCaracter =0;
        char caracter='a';
        String strD = Integer.toString(d);

            //for (i = 0; i < 315; i++) {    //aumento contador de 0 a xxxxx
        while(loop<n){

                c = Integer.toString(i); // paso a string
                if (c.length() >= m) { //chequeo el length de c para que sea como mínimo m
                    //Recorro el c char por char
                    j = c.length();

                    for (k = j; k > 0; k--) {
                        caracter = c.charAt(k - 1);
                        iCaracter = Character.getNumericValue(caracter);
                        if (iCaracter == d) {
                            conta++;
                        }
                    }
                    if (conta >= m) {
                        System.out.println(c);
                        loop++; //incremento la variable que lleva la cuenta de n
                    }

                    conta = 0;

                }
                i++;
            }

    }
}
