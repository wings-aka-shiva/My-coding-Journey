import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    private static long frontOrBack(int[] arr) {
        long possibilties = 1, MOD = 998244353;
        int length = arr.length;
		for(int i=0; i<length/2; ++i) {
		    if(arr[i] + arr[length-i-1] !=2) {
		        return 0;
		    }
		    possibilties = (possibilties*2)%MOD;
		}
		return possibilties%MOD;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-- != 0){
		    int n = scanner.nextInt();
		    int[] arr= new int[n];
		    for(int i=0; i<n; ++i) {
		        int val = scanner.nextInt();
		        arr[val]++;
		    }
            System.out.println(frontOrBack(arr));
		}
	}
}
