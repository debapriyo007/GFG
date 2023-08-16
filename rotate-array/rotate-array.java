class Solution {
    public void rotate(int[] nums, int k) {
        k = k% nums.length;
        reverse(nums , 0 , nums.length-1);
        reverse(nums , 0 , k-1);
        reverse(nums , k , nums.length-1);
        
    }
    
    //lets create a reverse function..
    public static void reverse(int[] nums, int si , int ei){
        while(si<= ei){
            int tem = nums[si];
            nums[si] = nums[ei];
            nums[ei] = tem;
            si++;
            ei--;
        }
    }
}