// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            
            int N=sc.nextInt();
            int K=sc.nextInt();
            ArrayList<Integer> Arr = new ArrayList<Integer>(N); 
  
            // Appending new elements at 
            // the end of the list 
            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                Arr.add(x); 
            }

            Solution ob = new Solution();
            System.out.println(ob.maximumSumSubarray(K,Arr,N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        
        int winStartPos = 0;
        int winEndPos = winStartPos+K-1;
        long winSum =0;
        
        for(int i=winStartPos;i<=winEndPos;i++)
        winSum = winSum+Arr.get(i);
        
        long maxSum = winSum;
        winEndPos++;
        winStartPos++;
        
        while(winEndPos<N){
            winSum = winSum + Arr.get(winEndPos) - Arr.get(winStartPos-1);
            if(winSum>maxSum)
            maxSum = winSum;
            winEndPos++;
            winStartPos++;
        }
        return maxSum;
    }
}