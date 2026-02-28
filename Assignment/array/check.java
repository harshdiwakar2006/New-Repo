
import java.util.Scanner;

public class check {
    static boolean is_check(int[] nums) {
        int n = nums.length;
        int c = 0;
        for (int i = 1; i < n; i++){
            if (nums[i-1] > nums[i]){
                c++;
            }
        }
        if (c == 1){
            if (nums[0]>=nums[n-1]){
                return true;
            }
        }
        if (c == 0){
            return true;
        }
        return false;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(is_check(nums));
    }
}
