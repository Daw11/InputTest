package ires.corso;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner( System.in );
	    System.out.println("Inserisci il primo valore: ");
	    Integer a = in.nextInt();
        System.out.println("Inserisci il secondo valore: ");
        Integer b = in.nextInt();
        System.out.println("Inserisci il terzo valore: ");
        Integer c = in.nextInt();
        Integer maxVal;

        if( a > b ) {
            maxVal = a;
        }
        else {
            maxVal = b;
        }

        if( c > maxVal )
            maxVal = c;

        System.out.println("Il valore massimo è: " + maxVal);
    }
}
