//{ Driver Code Starts
import java.io.*;

import java.util.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling maxSubarraySum() function
		    System.out.println(obj.maxSubarraySum(arr, n));
		}
	}
}


// } Driver Code Ends


class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long currsum =0; //initilize the currsum value with 0..
        long maxsum = Long.MIN_VALUE; //initilize maxsum with minimum value (-infinity)
        
        for(int i =0 ;i<n;i++){ //run a loop to iterate the all elem..
            currsum = currsum+ arr[i];
            
            //if currsum is greater than maxsumm then update currsum value..
            if(currsum>maxsum){
               maxsum = currsum;
            }
            
            if(currsum<0){
                currsum =0;
            }
        }
        return maxsum;
        
    }
    
}

