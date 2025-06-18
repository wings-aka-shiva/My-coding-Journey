import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while(t-- !=0) {
            int n = scanner.nextInt();
            int sqrt = (int) Math.sqrt(n);
            System.out.println(sqrt*sqrt);
        }
	}
}