//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String s; 
            s = br.readLine();
            
            Solution obj = new Solution();
            int res = obj.checkRedundancy(s);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int checkRedundancy(String s) {
        // code here
        
        //creating a stack .
        
        Stack<Character> stk = new Stack<>();
        
        for(int i = 0 ;i<s.length();i++){
            char ch = s.charAt(i);
            
           //closing ..
           if(ch == ')'){
               int count = 0;//take an varrible count  which will counting num of operand , operator
               while(stk.peek()!= '('){
                   stk.pop();
                   count++;
               }
               if(count<=1){ //count is less than and equal 1..
                   return 1;
               }else{
                   stk.pop();
               }
           }else{
               stk.push(ch);
           }
        }
        return 0;
    }
}
        
