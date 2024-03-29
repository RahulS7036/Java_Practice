//GFG -> Array -> Perfect Numbers




//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class PerfectNumbers {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long N = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.isPerfectNumber(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int isPerfectNumber(long N) {
        // code here
        if(N ==1){
            return 0;
        }
        long factSum =1;
        for(long i=2;i<Math.sqrt(N);i++){
            if((N % i)==0){
                
                  factSum += i;
                   factSum+=N/i;
            }
        }
        
        if(factSum == N){
            return 1;
        }
        return 0;
    }
}
