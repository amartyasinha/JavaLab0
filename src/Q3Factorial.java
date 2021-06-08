import java.util.*;

public class Q3Factorial {

    static int factorial(int n){
        if(n == 0)
            return 1;
        else
            return (n*factorial(n-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("It is a Program to calculate the Factorial of a given number");
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        System.out.println("The factorial of " + num + " is " + factorial(num));
    }
}
