public class Q1CMDSum {

    public static void main(String[] args) {
        int sum = 0;
        for (String x : args) {
            sum = sum + Integer.parseInt(x);
        }
        System.out.println("The sum is "+ sum);
    }
}