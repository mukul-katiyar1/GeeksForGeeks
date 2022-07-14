// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String S = read.readLine();
            Solution obj = new Solution();
            System.out.println(obj.printSequence(S));
            
        }
    } 
} // } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String printSequence(String S) 
    { 
        StringBuilder result = new StringBuilder();
        for (int i=0; i<S.length(); i++) {
            switch (S.charAt(i)) {
               case 'C': result.append("2");
               case 'B': result.append("2");
               case 'A': result.append("2"); break;
               case 'F': result.append("3");
               case 'E': result.append("3");
               case 'D': result.append("3"); break;
               case 'I': result.append("4");
               case 'H': result.append("4");
               case 'G': result.append("4"); break;
               case 'L': result.append("5");
               case 'K': result.append("5");
               case 'J': result.append("5"); break;
               case 'O': result.append("6");
               case 'N': result.append("6");
               case 'M': result.append("6"); break;
               case 'S': result.append("7");
               case 'R': result.append("7");
               case 'Q': result.append("7");
               case 'P': result.append("7"); break;
               case 'V': result.append("8");
               case 'U': result.append("8");
               case 'T': result.append("8"); break;
               case 'Z': result.append("9");
               case 'Y': result.append("9");
               case 'X': result.append("9");
               case 'W': result.append("9"); break;
               case ' ': result.append("0"); break;
               default : result.append(S.charAt(i));
            }
        }
        return result.toString();
        
    }
}