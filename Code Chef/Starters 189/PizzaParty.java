import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int g = scanner.nextInt();
        int totalSlices = (b+1)*4 + (g*3);
        if(totalSlices%8 == 0)
            System.out.println(totalSlices/8);
        else 
            System.out.println((totalSlices/8)+1);
	}
}
