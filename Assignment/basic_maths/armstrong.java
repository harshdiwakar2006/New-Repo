import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int originalNum = num;
        int result = 0;
        int digits = 0;

        // Count number of digits
        int temp = num;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }

        temp = num;

        // Calculate sum of digits raised to power
        while (temp != 0) {
            int digit = temp % 10;
            result += Math.pow(digit, digits);
            temp /= 10;
        }

        // Check Armstrong
        if (result == originalNum)
            System.out.println(originalNum + " is an Armstrong number.");
        else
            System.out.println(originalNum + " is NOT an Armstrong number.");

        sc.close();
    }
}
