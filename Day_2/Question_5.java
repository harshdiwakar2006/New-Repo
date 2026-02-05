import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args){
        //Taking input 
        System.out.println("Enter the elements of matrix (3x3): ");
        int[][] matrix = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i < 3;i++){
            for (int j = 0; j < 3; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        // printing the output
        int c = 0; 
        System.out.println("Your matrix is : ");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3;j++){
                c += matrix[i][j];
            }
        }
        System.out.println("Sum of all elements of matrix : " + c);
        sc.close();
    }
}