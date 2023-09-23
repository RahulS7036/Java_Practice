//GFG -> String -> Remove characters from alphanumeric string


//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class Removecharactersfromalphanumericstring {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            
            Solution ob = new Solution();
            String result = ob.removeCharacters(s);
            
            System.out.println(result);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String removeCharacters(String S) {
        // code here
        String ans ="";
        for(int i=0;i<S.length();i++){
            if(S.charAt(i) == '1' || S.charAt(i) == '2' || S.charAt(i) == '3' ||S.charAt(i) == '4' ||
            S.charAt(i) == '5' ||S.charAt(i) == '6' ||S.charAt(i) == '7' ||S.charAt(i) == '8' ||
            S.charAt(i) == '9' || S.charAt(i) == '0' ){
                ans = ans + (String.valueOf(S.charAt(i)));
            }
        }
        return ans;
    }
}
