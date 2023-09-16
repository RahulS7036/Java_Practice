//GFG ->String -> Reverse a String


//{ Driver Code Starts
// Initial template for Java

import java.util.*;
import java.io.*;
class ReverseaString {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();

            System.out.println(ob.revStr(S));
        }
    }
}
// } Driver Code Ends


class Solution {
    static String revStr(String S) {
        // code here
        
        StringBuilder sb=new StringBuilder(S);
        
        // sb.append(S);
        sb.reverse();
        return sb.toString();
    }
}
