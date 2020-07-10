package leetCode;

public class twoSum {
    public int[] ts(int[] nums, int target) {
        int j;
        for (int i = 0; i < nums.length; i++) {
            for ( j = i + 1; j < nums.length; j++){
                if(nums[j] == target - nums[i]){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException();
    }
}
