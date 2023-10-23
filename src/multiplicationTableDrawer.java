//Code by Juan Pablo Jiménez
//Grade 10
import java.util.Scanner;

public class multiplicationTableDrawer {
    public static <string> void main(String[] args) {
        //Introduce the program
        System.out.println("This program prints a multiplication table");
        //declare variables
        int num = 0;
        int num2 = 0;
        int prod = 0;
        Scanner input = new Scanner(System.in);
        //Ask user for input
        System.out.println("Type a number (The table): ");
        num = input.nextInt();
        System.out.println("Number of rows for the table: ");
        num2 = input.nextInt();
        //Print the given number
        System.out.print("The table of ");
        System.out.print(num);
        System.out.println( " is: ");
        //Loop that multiplies the number and prints the table
        for(int N =0;N<=num2;N++){
            prod = num * N;
            System.out.println(num + " X " + N + " = " + prod);
        }
    }
}