class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i =0; //first pointer initilized as zero..
        int j = numbers.length-1; //and second pointer initilized as n-1..
        
        while(i<j){
            if(numbers[i]+numbers[j]== target){
                return new int []{i+1,j+1};
            }
            if(numbers[i]+numbers[j]<target){
                i++;
            }else{
                j--;
            }
        }
        return null;

        
    }
}
