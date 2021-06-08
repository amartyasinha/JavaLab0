import java.util.*;

public class Q4Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("It is a Program to check for Prime Number");
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        boolean flag = false;

        for (int i = 2; i < (num / 2); i++) {
            if (num % i == 0) {
                System.out.println(num + " is not Prime");
                flag = true;
                break;
            }
        }
        if(!flag) {
            System.out.println(num + " is Prime");
        }
    }
}
