//Gf=FG -> Array -> Last index of One

//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class //{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String s = br.readLine();
            
            Solution obj = new Solution();
            System.out.println(obj.lastIndex( s));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    public int lastIndex( String s) {
        
        int sLength =s.length()-1
        for(int i=sLength;i>=0;i--){
            if(s.charAt(i) == '1'){
                return i;
            }
        }
        
        return -1;
        
    }
} {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String s = br.readLine();
            
            Solution obj = new Solution();
            System.out.println(obj.lastIndex( s));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    public int lastIndex( String s) {
        
        int sLength =s.length()-1
        for(int i=sLength;i>=0;i--){
            if(s.charAt(i) == '1'){
                return i;
            }
        }
        
        return -1;
        
    }
}
