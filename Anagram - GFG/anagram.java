// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}// } Driver Code Ends


class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        int arr1[] = new int[26];
        int arr2[] = new int[26];
        
        boolean result = true;
        
        for(int i=0;i<26;i++){
            arr1[i]=0;
            arr2[i]=0;
        }
        if(a.length()!=b.length()){
            result = false;
        }
        else{
            for(int i=0;i<a.length();i++){
                char first = a.charAt(i);
                char second = b.charAt(i);
                arr1[first-97]++;
                arr2[second-97]++;
            }
            for(int i=0;i<26;i++){
                if(arr1[i] != arr2[i]){
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}