import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int minGrandSlams = 25;
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int totalTitlesLeft = minGrandSlams - x;
        System.out.println((int) Math.ceil(totalTitlesLeft/4.0));
	}
}