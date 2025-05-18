package easy.twosum;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BestSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i<n;i++){
            nums[i] = scan.nextInt();
        }
        int target = scan.nextInt();
        int[] ns = twoSum(nums,target);
        for(int v : ns){
            System.out.println(v);
        }
    }

    public static int[] twoSum(int[] nums, int target) {//tempo: big O(n)
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i< nums.length;i++) {
            int x = target - nums[i];
            if(map.containsKey(x)) {
                return new int[] {map.get(x),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
