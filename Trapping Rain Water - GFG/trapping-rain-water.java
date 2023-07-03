//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}


// } Driver Code Ends


class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
        
        
        //intilize the trapWater with 0..
        long trapWater = 0;
        
        //creating an axuliary array.
        int leftmax[] = new int[n];
        leftmax[0] = arr[0];
        for(int i = 1 ;i<n ;i++){ //iterate the loop to find the max value of the left side.
            leftmax[i] = Math.max(arr[i], leftmax[i-1]);
        }
        
       int rightmax[] = new int[n]; //creating another axulairy array..
        rightmax[n-1] = arr[n-1];
        for(int i = n-2;i>= 0 ;i--){ //to find the maximum value of right size..
            rightmax[i] = Math.max(arr[i], rightmax[i+1]);
        }
        
        for(int i =0 ;i<n ;i++){
            int waterLevel = Math.min(leftmax[i], rightmax[i]); //Find out the water level.
            trapWater += waterLevel - arr[i]; //calculate the total water..
        }
        return trapWater;
        
        
    } 
}


