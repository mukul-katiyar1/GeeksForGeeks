// { Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			System.out.println(obj.atoi(str));
		t--;
		}
	}
}// } Driver Code Ends


//User function template for JAVA

/*You are required to complete this method */
class Solution
{
    int atoi(String str) {
        int result = 0;
        char digit = ' ';
        boolean isNegative = false;
        int i =0;
        if(str.charAt(0) == '-'){
            isNegative = true;
            i=1;
        }
        for(;i<str.length();i++){
            digit = str.charAt(i);
            if(digit<48 || digit>57){
                result = -1;
                return result;
                //break;
            }
            result = 10*result + (digit-48);
        }
        if(isNegative)
        result = 0-result;
        return result;
    }
}
