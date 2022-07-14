// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String A = sc.next();
                    String B = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.UncommonChars(A, B));
                }
        }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    String UncommonChars(String A, String B)
    {
        String uncommon = "";
        for(char a = 'a';a<='z';a++){
            if((A.contains(a+"") && !B.contains(a+"")) || (!A.contains(a+"") && B.contains(a+"")))
            uncommon = uncommon+a;
        }
        if(uncommon.equals(""))
        uncommon = "-1";
        
        return uncommon;
    }
}