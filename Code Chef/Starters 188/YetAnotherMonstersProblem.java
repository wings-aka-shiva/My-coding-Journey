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
            int size = scanner.nextInt();
            int[] arr = new int[size];
            for( int i=0; i<size; i++) {
                arr[i] = scanner.nextInt();
            }
            Arrays.sort(arr);
            int minSeconds = size;
            for(int i=0; i<size; ++i) {
                minSeconds = Math.min(minSeconds, arr[i]+size-i-1);
            }
            System.out.println(minSeconds);
        }
	}
}
