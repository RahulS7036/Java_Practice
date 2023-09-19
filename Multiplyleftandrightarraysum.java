//GFG -> Array -> Multiply left and right array sum


//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Multiplyleftandrightarraysum {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int N = Integer.parseInt(element[0]);
		    int arr [] = new int[N];
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<N;i++){
	            arr[i] = Integer.parseInt(elements[i]);    
	        }
		    
		    Complete obj = new Complete();
		    int ans = obj.multiply(arr, N);
        	System.out.println(ans);
		}
	}
}


// } Driver Code Ends


//User function Template for Java


class Complete{
    
   
    // Function for finding maximum and value pair
    public static int multiply (int arr[], int n) {
        //Complete the function
        
        
        int mid = arr.length/2;
        int left = 0, right = 0;
        for(int i=0;i<n;i++){
            
            if(i< mid ){
                left+=arr[i];
                
            }else{
                right +=arr[i];
            }
            
        }
        return left*right;
    }
    
    
}





