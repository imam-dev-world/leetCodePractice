import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m = new HashMap<>();
        int[] result = new int[2];
        // loop every element
        for(int i=0; i<nums.length; i++){
            // check the required number to achieve the target
           int requiredNum = target - nums[i]; 
            
            // check the matching pairs of index
            if(m.containsKey(requiredNum)){
                result[0]=m.get(requiredNum);
                result[1]=i;
                break;
            }
            
            // add the number into the map
            m.put(nums[i],i);
            
        }
        return result;
    }
}

class Main1 {
    public static void main(String[] args){
        Solution s = new Solution();
        int[] nums = {2,5,4,7};
        int target = 6;
        int[] result = s.twoSum(nums,target);
        for(int r:result){
            System.out.println(r);
        }
    }
}