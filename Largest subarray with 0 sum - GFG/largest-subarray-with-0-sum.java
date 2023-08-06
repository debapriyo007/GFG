//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
       //create a Hashmap..
        //this hashmap i store the sum and index pair.
        HashMap<Integer, Integer> map = new HashMap<>();

        //calculate the length .
        int len = 0; //intilize the length with 0..
        int sum = 0;  //intilize the sum with 0 also..

        //iterate a loop..
        for(int j = 0;j<arr.length;j++){
            //calculate the sum of i'th index ..
            sum = sum+arr[j];
            if(sum ==0){
                len = j+1;
            }
            //then, check the sum is exist in the map or not..
            if(map.containsKey(sum)){
                //if exist the calculate the length and compair with j-i.
               len = Math.max(len, j-map.get(sum));
            }else{
                map.put(sum, j); //if not exist the put the sum and it's index..
            }
        }
        return len;
    }
}