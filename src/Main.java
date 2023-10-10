import java.io.EOFException;
import java.lang.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int a;
        int b;
        int c;

        Scanner s = new Scanner(System.in);


            System.out.println("Enter 2 numbers: ");

            a = s.nextInt();
            b = s.nextInt();

        c = a + b;

        System.out.println(c);


    }
}