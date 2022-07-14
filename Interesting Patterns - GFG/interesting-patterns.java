// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            String[] S = ob.interestingPattern(N);
            
            for(int i=0; i<S.length; i++)
                System.out.println(S[i]);
        }
    }
}// } Driver Code Ends


class Solution {
    static String[] interestingPattern(int N) {
        int length = 2*N-1;
        String[] result = new String[length];
        
        for(int i=0; i<length; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<length; j++) {
                int a = (int)Math.min(i, j);
                int b = (int)Math.min(length-1-i, length-1-j);
                sb.append(N-(int)Math.min(a, b));
            }
            result[i] = sb.toString();
        }
        return result;
    }
};