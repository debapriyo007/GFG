//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new Solution().segregate(head);
		     printList(head);
		    System.out.println();
        }
    }
    
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    
}




// } Driver Code Ends


//User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        
        Node tem = head;
        int zero =0;
        int one = 0;
        int two = 0;
        
        while(tem!=null){
            if(tem.data == 0){
                zero++;
            }
            else if(tem.data == 1){
                one++;
            }
            else{
                two++;
            }
            tem = tem.next;
        }
        
        //creating a dummy node..
        Node dummy = new Node(-1);
        Node t = dummy;
        
        while(zero!= 0){
            t.next = new Node(0);
            t = t.next;
            zero--;
        }
        while(one!=0)
        {
           t.next=new Node(1);
           t=t.next;
           one--;
        }
        while(two!=0)
        {
           t.next=new Node(2);
           t=t.next;
           two--;
        }
        return dummy.next;
        
    }
}


