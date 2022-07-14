// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
        String prefix = arr[0];
        int k =0;
        for(int i=1;i<n;i++){
            for(;;k++){
                if(k>=arr[i].length() || k>=prefix.length()){
                    break;
                }
                if(arr[i].charAt(k) != prefix.charAt(k))
                break;
            }
            prefix = prefix.substring(0,k);
            k=0;
        }
        if(prefix.equalsIgnoreCase(""))
        prefix = "-1";
        return prefix;
    }
}