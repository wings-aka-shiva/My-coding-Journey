import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner scanner = new Scanner(System.in);
        int minB = 1001;
        int t=scanner.nextInt();
        while(t-- != 0) {
            minB = 1001;
            int n = scanner.nextInt();
            while(n-- != 0) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                if(a>6) {
                    minB = Math.min(minB, b);
                }
            }
            if(minB == 1001)
                System.out.println(-1);
            else
                System.out.println(minB);
        }
	}
}
