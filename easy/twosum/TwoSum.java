package easy.twosum;

public class TwoSum {
    public static void main(String[] args) {
    }

    public int[] twoSum(int[] nums, int target) { //tempo: Big O(n^2)
        int[] numsSelected = new int[2];
        for(int j = 0; j<nums.length; j++) {
            for(int k = j; k<nums.length; k++){
                if(j != k && nums[j]+nums[k] == target){
                    numsSelected[0] = j;
                    numsSelected[1] = k;
                    return numsSelected;
                }
            }
        }
        return null;
    }
}