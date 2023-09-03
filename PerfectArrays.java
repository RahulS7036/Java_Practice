//GFG Array Perfect Arrays Problem

//{ Driver Code Starts
/*package whatever //do not write package name here */


import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases-- > 0){
		    
		    int n = Integer.parseInt(br.readLine());
		    int arr[] = new int[n];
		    
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split(" ");
		    
		    for(int index = 0;index < n; index++){
		        arr[index] = Integer.parseInt(elements[index]);
		    }
		    
		    Solution obj = new Solution();
		    if(obj.IsPerfect(arr, n))
		        System.out.println("PERFECT");
		    else
		        System.out.println("NOT PERFECT");
		}
		
	}
}


// } Driver Code Ends


class Solution{
    
    public boolean IsPerfect(int a[], int n)
    {
        // Complete the function
        
        // boolean flag = true;
        // int[] result = new int[n];
        // int i=n-1;
        // int j=0;
        // while(i >=0){
        //     result[j] = a[i];
        //     j++;
        //     i--;
        // }
        // for(int k=0;k<n;k++){
        //     if(a[k] != result[k]){
        //         flag = false;
        //         break;
        //     }
        // }
        
        // return flag;


	    //Optimized soiution

	     for(int i=0;i<n/2;i++){

        if(a[i]!=a[n-i-1])

        {

        return false;

         }

     }

      return true;
        
    }
    
}
