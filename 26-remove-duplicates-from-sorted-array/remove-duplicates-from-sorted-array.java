class Solution {
    public int removeDuplicates(int[] nums) {

        int uniIndex = 1;

        for(int i = 1;i < nums.length;i++){
            if(nums[i] != nums[i - 1]){
                nums[uniIndex] = nums[i];
                uniIndex++;
                
            }
        }
        return uniIndex;
        
    }
}