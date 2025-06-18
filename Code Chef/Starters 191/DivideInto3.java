import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner scanner = new Scanner(System.in);
        int totalToffees = scanner.nextInt();
        if(totalToffees%3 == 0) {
            System.out.println(0);
        }
        else {
            System.out.println(1);
        }
	}
}