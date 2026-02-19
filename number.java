import java.util.Scanner;

public class number {
    static void printNumbers(int n) {
        // Base Condition
        if (n == 0) {
            return;
        }

        // Recursive Call
        printNumbers(n - 1);

        // Print after recursive call
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        printNumbers(n);

        sc.close();
    }
    
}
