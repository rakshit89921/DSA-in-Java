class Solution {
    public void moveZeroes(int[] nums) {

        int posi = 0;

        for(int i = 0; i < nums.length;i++){
            if(nums[i] != 0){
                nums[posi] = nums[i];
                posi++;
            }
        }
        for(int j = posi;j <= nums.length - 1;j++){
            nums[j] = 0;
        }
        
    }
}