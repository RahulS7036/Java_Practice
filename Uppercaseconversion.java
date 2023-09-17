//GFG -> String -> Upper case conversion

//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class Uppercaseconversion
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String str = br.readLine();
                    Solution ob = new Solution();
                    System.out.println(ob.transform(str));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String transform(String s)
    {
           s=s.trim();
        StringBuffer sb=new StringBuffer(s);
        for(int i=0;i<sb.length();i++){
            if(i==0||sb.charAt(i-1)==' '){
                sb.setCharAt(i,Character.toUpperCase(sb.charAt(i)));
            }
        }
        return sb.toString().trim();
    }
}
