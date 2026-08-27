class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] result = new int[2]; 
        boolean foundNums = false;
        // LOOP EVERY ELEMENT and CHECK ONE NUMBER
        for(int i=0; i<nums.length ; i++){
            // loop for check other number
            for(int j=0; j<nums.length ; j++){
                if(j!=i && nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                    foundNums=true;
                }
            }
            if(foundNums){
                break;
            }
        }
        return result;

    }
}

class Main{
    public static void main(String[] args){
        Solution s = new Solution();
        int[] nums = {3,4,2};
        int target = 6;
        int[] result = s.twoSum(nums,target);
        for(int r:result){
            System.out.println(r);
        }
    }
}
// nums = [2,7,11,15], target = 9 output:[0,1]