import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args){
        //Taking input 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
         System.out.println("Enter the elements");
        for (int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (arr[i] > arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }

    }
}
