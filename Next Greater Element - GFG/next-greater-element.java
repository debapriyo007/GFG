//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    long[] res = new Solution().nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
		}
	}
}




// } Driver Code Ends


class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        
        //creating a stack..
        Stack<Long> s = new Stack<>();
        //creating an array to store the result ..
       long nextGreater[]= new long [n];//this result array size should be equal to array size..
       
       for(int i = n-1;i>=0 ;i--){ //backward traversall to the array..
           while(!s.isEmpty() && s.peek() <= arr[i]){//when ever my arr elem is't greater or equal to my stack top i kepp remove the element from stack
               s.pop();
           }
           if(s.isEmpty()){ // when ever the stack is empty the next greater is -1.
               nextGreater[i]= -1;
           }else{
               nextGreater[i] = s.peek();  //when the stack is not empty stack top most element should be next greater..
           }
           s.push(arr[i]); // last push the elem into the stack..
       }
       return nextGreater; // return the result array..
    } 
}