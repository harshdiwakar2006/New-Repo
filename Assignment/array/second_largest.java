import java.util.Scanner;

public class second_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements : ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();    
        }
        int max = 0;
        int sec_max = 0;
        for (int i = 0; i < n; i++){
            if (arr[i]>max){
                sec_max = max;
                max = arr[i];
            }
        }
        System.out.println("Second largest element is : " + sec_max);
        sc.close();
    }
}
