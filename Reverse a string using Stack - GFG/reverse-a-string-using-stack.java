//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Solution obj = new Solution();
            System.out.println(obj.reverse(sc.next()));
        }
	}
}

// } Driver Code Ends


class Solution {
    
    public String reverse(String S){
        //code here
        Stack<Character> s = new Stack<>();
        //define an index 
        int index = 0;
        while(index < S.length()){ // when my index is not greter than my string length loop will be continue..
            s.push(S.charAt(index));// push the char in particular index..
            index++; // index will be increment..
        }
        
        //using String builde to store result less time..
        StringBuilder result = new StringBuilder(""); //creating a string builder..
        while(!s.isEmpty()){ // when ever my stack is not empty.
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
        
    }

}