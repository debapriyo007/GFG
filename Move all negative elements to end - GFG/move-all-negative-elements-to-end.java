//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            obj.segregateElements(a, n);
            
            for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
            
            System.out.println();
        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
        
        
         //create  a tem array..
         int arr2[] = new int [n];
         //define this array index 
         int j = 0;
         
         //fist findout the maximum value in the arr..
         for(int i = 0 ;i<n ;i++){
             //check array index elem is greater or equal to 0 or not
             if(arr[i]>= 0){
                 //if greater or equal to zero then copy that elm into arr2..
                 arr2[j]= arr[i];
                 j++; // j index will be increment.
                 
             }
         }
         
        //if my new created arr index is equal to arr size then simpily return .
        if(j == n || j ==0){
            return;
        }
        
        //if elm are smaller..
        for(int i = 0 ;i<n ;i++){
            if(arr[i]<0){
                arr2[j] = arr[i];
                j++;
            }
        }
        
        //last i copied all elem into my new array..
        for(int i = 0 ;i<n ;i++){
            arr[i] = arr2[i];
        }
        
    }

 //----------------------DS APPROACH:-------------------------------------------------------------------------------------------------------------------------
    //creating two array list.. 
        List<Integer> posNum = new ArrayList<>();
        List<Integer> negNum = new ArrayList<>();
        
        for(int i = 0 ;i<n ;i++){ 
            //first iterate the whole array ..
            if(arr[i]>=0){ // if the array elem is greater than zero or equal to zero then it's should be added in the first array list
                posNum.add(arr[i]);
            }else{
                negNum.add(arr[i]); //if smaller then added 2nd one..
            }
        }
        posNum.addAll(negNum); //then add both array list in one..
        for(int i =0 ;i<n ;i++){ //show the elements..
            arr[i]= posNum.get(i);
        }
        
}
