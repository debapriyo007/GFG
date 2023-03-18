class Solution {
    public void moveZeroes(int[] nums) {
        int i =0;  //initilize i and j with 0 index..
        int j =0;

        while(i<nums.length){ 
            if(nums[i]==0){
                i++;
            }
            else{
                //swap the elements...
                int tem = nums[j];
                nums[j]= nums[i];
                nums[i]= tem;
                i++;j++;
            }
        }

        
    }
}