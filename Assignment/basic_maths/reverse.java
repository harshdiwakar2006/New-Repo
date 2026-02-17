import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int n = sc.nextInt();
        int c =0;
        while (n > 0){
            c = ((n%10)+c)*10;
            n=n/10;
        }
        System.out.println(c/10);
    }
    
}
