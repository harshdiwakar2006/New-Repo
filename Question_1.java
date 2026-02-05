import java.util.Scanner;
public class Question_1 {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.println("Enter No. of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        // fatching output
        System.out.print("Elements of array: ");
        for (int i=0; i<n;i++){
            System.out.print(arr[i]+" ");
        }

     }
}
