import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int[] arr = new int[4];
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<4; ++i) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Math.max(arr[0]*arr[2], arr[1]*arr[3]));
	}
}
