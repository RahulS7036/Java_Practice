//GFG Array  Find Index 




//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.lang.*;
import java.io.*;




class Array
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t-->0)
	    {
	    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i] = sc.nextInt();
		    }
		    int key = sc.nextInt();
		    Solution ob=new Solution();
		    int ar[]=ob.findIndex(arr,n,key);
		    System.out.println(ar[0]+" "+ar[1]);
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{ 
    // Function to find starting and end index 
    static int[] findIndex(int a[], int N, int key) 
    { 
        //code here.
        int[ ] result = new int[2];
        
        for(int i=0;i<N;i++){
            if(a[i] == key){
                result[0] = i;
                
                for(int j=i; j<N;j++){
                    if(a[j] == key){
                        // continue;
                        result[1] = j;

                    }
                    // else{
                    //     result[1] = j;
                    //     break;
                    // }
                }
                break;
            }
            else{
                result[0] = -1;
                result[1] = -1;
            }
        }
        return result;
        
    }
}
