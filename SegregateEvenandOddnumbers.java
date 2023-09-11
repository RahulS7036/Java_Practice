//GFG ->Array -> Segregate Even and Odd numbers


//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class SegregateEvenandOddnumbers {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().segregateEvenOdd(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java




class Solution {
    void segregateEvenOdd(int arr[], int n) {
        // code here
        int[] even = new int[n];
        int count=0;
        int imp=0;
        for(int i=0;i<n;i++){
            if(arr[i] == 0){
                imp++;
            }
            if(arr[i] % 2 == 0){
              even[count] = arr[i];
                arr[i] =0;
                count++;
            
             }
           
        }
        
        
        Arrays.sort(arr);
    
        Arrays.sort(even);
        
      int x=0 +imp;
      for(int i=0;i<n;i++){
          if(even[i] != 0){
              arr[x] =even[i];
              x++;
          }
      }
        
        
        
    }
        
}
