import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner scanner = new Scanner(System.in);
        int s=scanner.nextInt();
        int m=scanner.nextInt();
        if(s>m) {
            System.out.println(s);
        }
        else {
            System.out.println(m - s + 1);
        }
	}
}
