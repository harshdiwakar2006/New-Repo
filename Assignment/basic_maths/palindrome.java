import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int n = sc.nextInt();
        int a = n;
        int c =0;
        while (n > 0){
            c = ((n%10)+c)*10;
            n = n/10;
        }
        if (a == c/10){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
        sc.close();
    }
}



