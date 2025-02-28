import java.util.Scanner;

public class AATS {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a = input.nextInt();
        System.out.print("Enter second number:");
        int b = input.nextInt();
        System.out.println("Addition of " + a + " and " + b + " is " + (a + b));
    }
}