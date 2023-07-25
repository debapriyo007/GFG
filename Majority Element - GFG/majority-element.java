//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        //creating and hashmap..
        HashMap<Integer , Integer> hm = new HashMap<>();
        
        //iterate the loop..
        for(int i = 0 ;i<size ;i++){
            if(hm.containsKey(a[i])){ // if in the map key are exists.
            
            // then put the key and update the frequency or u can say count..
                hm.put(a[i] , hm.get(a[i]) + 1);
            }else{// if that's not happen the put the key with frequency with 1..
                hm.put(a[i] , 1);
            }
        }
        for(Integer key : hm.keySet()){
            if(hm.get(key) > size/2){
                return key;
            }
        }
        return -1; //Majority ele is't exist return -1..
    }
}