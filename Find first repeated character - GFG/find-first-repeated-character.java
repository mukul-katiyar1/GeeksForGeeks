// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String s = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.firstRepChar(s));
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String firstRepChar(String s) 
    {
        int smallest = s.length();
        String result = "";
        int pos =0;
        for(int i=0;i<s.length()-1;i++){
            if(s.substring(i+1).contains(s.charAt(i)+"")){
                pos = s.substring(i+1).indexOf(s.charAt(i))+i+1;
                if(pos<smallest)
                smallest = pos;
            }
        }
        if(smallest == s.length())
        result = "-1";
        else
        result = s.charAt(smallest)+"";
        
        return result;
    }
} 