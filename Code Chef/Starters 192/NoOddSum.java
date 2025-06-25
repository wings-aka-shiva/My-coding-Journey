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
            int n = scanner.nextInt();
            int[] arr = new int[n];
            int count2 = 0;
            for(int i=0; i<n; ++i) {
                arr[i] = scanner.nextInt();
                if(arr[i]==2) count2++;
            }
            int count1 = n - count2;
            if(count1 == n || count2 == n) {
                System.out.println(0);
                continue;
            }
            if(count1 %2 == 1) {
                System.out.println(count2);
                continue;
            }
            if(count1/2 < count2)
                System.out.println(count1/2);
            else 
                System.out.println(count2);
        }
	}
}
