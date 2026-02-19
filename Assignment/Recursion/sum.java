import java.util.Scanner;

public class sum {
    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int result = sum(n);
        System.out.println("Sum of first " + n + " numbers is: " + result);

        sc.close();
    }
}
