import java.util.*;

public class Q2OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("It is a Program to check for Odd and Even Number\n");
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println(num + " is Even");
        }
        else
            System.out.println(num + " is Odd");
    }
}
