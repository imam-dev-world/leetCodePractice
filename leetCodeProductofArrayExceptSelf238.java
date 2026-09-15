class leetCodeProductofArrayExceptSelf238 {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
         for (int i = 0; i < nums.length; i++) {
            result[i] = 1;
        }
        int leftproduct=1;
        int rightproduct=1;
        for (int i = 0; i < nums.length; i++) {
            int rightIndex = nums.length-1-i;
            result[i]*=leftproduct;
            leftproduct*=nums[i];

            result[rightIndex] *= rightproduct;
            rightproduct*=nums[rightIndex];
        }
        return result;
    }
}

class solve{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        leetCodeProductofArrayExceptSelf238 lc = new leetCodeProductofArrayExceptSelf238();
        int[] result=lc.productExceptSelf(nums);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
