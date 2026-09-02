import java.util.*;
class Solution4 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        boolean HasDuplicate = false;
        
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                HasDuplicate = true;
                break;
            }
            else{
                set.add(nums[i]);
            }
        }
        return HasDuplicate;
    }
}

public class leetcode217 {
    public static void main(String[] args) {
        Solution4 s4 = new Solution4();
        int[] nums = {1,2,3,4,1};
        boolean result = s4.containsDuplicate(nums);
        System.out.println(result);
    }
}
