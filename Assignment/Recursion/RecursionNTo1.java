import java.util.Scanner;

public class RecursionNTo1 {
    static void printNumbers(int n) {
        // Base condition
        if (n == 0) {
            return;
        }

        // Print first
        System.out.print(n + " ");

        // Recursive call
        printNumbers(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        printNumbers(n);

        sc.close();
    }
}
