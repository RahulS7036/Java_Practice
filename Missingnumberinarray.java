//GFG -> Array -> Missing number in array

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class Missingnumberinarray {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] array = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                array[i] = Integer.parseInt(str[i]);
            }
            Solution sln = new Solution();
            System.out.println(sln.missingNumber(array, n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int missingNumber(int array[], int n) {
        // Your Code Here
        int sum=0;
        for(int i=0;i<n-1;i++){
            sum += array[i];
        }
        
        return (n*(n+1)/2) - sum;
    }
}