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
		while(t-- != 0) {
		    int x = scanner.nextInt();
		        while(x>3) {
		            x -= 3;
		        }
		        while(x%2==0) {
		            x /= 2;
		        }
		        System.out.println(x);
		}
	}
}
