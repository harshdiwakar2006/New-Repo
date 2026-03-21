public class zero {
    static void move(int[] nums){
        int n = nums.length, temp;
        for (int i = 0; i < nums.length ; i++){
            for (int j = 0; j < n-i-1; j++){
                if (nums[j] == 0){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        move(nums);
        for (int i : nums){
            System.out.print(i + " ");
        }
    }
}
