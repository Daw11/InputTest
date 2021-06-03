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
        Integer maxVal, maxPos;

        if( a > b ) {
            maxVal = a;
            maxPos = 0;
        }
        else {
            maxVal = b;
            maxPos = 1;
        }

        if( c > maxVal ) {
            maxVal = c;
            maxPos = 2;
        }

        String[] positions = {"PRIMO", "SECONDO", "TERZO"};
        System.out.println("Il numero maggiore che hai inserito è il " + positions[maxPos] + " e vale: " + maxVal);
    }
}
