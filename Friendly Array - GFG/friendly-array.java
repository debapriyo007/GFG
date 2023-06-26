//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java



class Solution
{
    long sumOfMinAbsDifferences(long arr[] ,int N)
    {
       Arrays.sort(arr);
        long sum=0;
        for(int i=0;i<N;i++){
            if(i==0){
                sum+=Math.abs(arr[i]-arr[i+1]);
            }else if(i==N-1){
                sum+=Math.abs(arr[i]-arr[i-1]);
            }else{
                sum+=Math.min(Math.abs(arr[i]-arr[i-1]), Math.abs(arr[i]-arr[i+1]));
            }
        }
        return sum;


    }
}


//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main (String[] args) throws IOException{
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while(testcases-- > 0){
            int n=Integer.parseInt(br.readLine());
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[]=new long[n];
            for(int  i=0;i<n;i++)
            {
                a[i]=Long.parseLong(a1[i]);
            }
            Solution ob=new Solution();
            long ans=ob.sumOfMinAbsDifferences(a,n);
            System.out.println(ans);
        }
    }
}




// } Driver Code Ends