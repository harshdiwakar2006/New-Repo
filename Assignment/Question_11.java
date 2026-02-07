import java.util.Scanner;

public class Question_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your year of study: ");
        int year = sc.nextInt();

        // Output
        System.out.println("My name is " + name + " and I am in " + year + " year.");

        sc.close();
    }
    
}
