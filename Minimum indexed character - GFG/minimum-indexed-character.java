// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;


 // } Driver Code Ends
//User function template for JAVA

class Solution
{
    //Function to find the minimum indexed character.
    public static int minIndexChar(String str, String patt)
    {
        int arr1[] = new int[26];
        int arr2[] = new int[26];
        int smallest = str.length()+patt.length();
        int pos=0;
        
        for(int i=0;i<str.length();i++){
            arr1[str.charAt(i)-97]++;
        }
        for(int i=0;i<patt.length();i++){
            arr2[patt.charAt(i)-97]++;
        }
        for(int i=0;i<26;i++){
            if(arr1[i]!=0 && arr2[i]!=0){
                pos = str.indexOf((char)(97+i));
                if(pos<smallest)
                smallest = pos;
            }
        }
        if(smallest == str.length()+patt.length())
        smallest =-1;
        
        return smallest;
    }
}

// { Driver Code Starts.

class GFG {
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		    t--;
		    
		    String s1=sc.next();
		    String s2=sc.next();
		    
		    int res = new Solution().minIndexChar(s1, s2);
		    System.out.println(res);
		}
	}
}
  // } Driver Code Ends