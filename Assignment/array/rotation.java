public class rotation {
    static void rotate(int[] nums,int k){
        int n = nums.length;
        for (int i = 0; i < k; i++){
            int temp = nums[n-1];
            for (int j = 1; j < n; j++){
                nums[n-j] = nums[n-j-1];
            }
            nums[0] = temp;
        }
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7};
        int k = 3 ;
        rotate(nums, k);
        for (int i : nums){
            System.out.print(i + " ");
        }

    }
}
