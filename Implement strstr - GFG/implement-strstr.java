// { Driver Code Starts
import java.util.*;


class Implement_strstr
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String line = sc.nextLine();
			String a = line.split(" ")[0];
			String b = line.split(" ")[1];
			
			GfG g = new GfG();
			System.out.println(g.strstr(a,b));
			
			t--;
		}
	}
}// } Driver Code Ends


class GfG
{
    //Function to locate the occurrence of the string x in the string s.
    int strstr(String s, String x)
    {
       if(s.length()<x.length()){
           return -1;
       }
       int winStartPos = 0;
       int winEndPos = x.length()-1;
       
       int result = -1;
       
       String winString = s.substring(winStartPos,winEndPos+1);
       
       if(winString.equals(x))
       return 0;
       
       winStartPos++;
       winEndPos++;
       
       while(winEndPos<s.length()){
           winString = s.substring(winStartPos,winEndPos+1);
           if(winString.equals(x)){
               result = winStartPos;
               break;
           }
           winStartPos++;
           winEndPos++;
           }
           return result;
    }
}
