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
        while(t-- !=0) {
            int[] arr = new int[3];
            for(int i = 0; i<3; ++i) {
                arr[i] = scanner.nextInt();
            }
            int totalPieces = arr[0]*arr[1];
            int remainingPieces = totalPieces - arr[2];
            if(remainingPieces%arr[0] == 0 || remainingPieces%arr[1] == 0) {
                System.out.println(remainingPieces);
                continue;
            }
            int dummy1 = arr[2];
            while(dummy1%arr[0] != 0) {
                dummy1++;
            }
            int dummy2 = arr[2];
            while(dummy2%arr[1] != 0) {
                dummy2++;
            }
            System.out.println(totalPieces- Math.min(dummy1, dummy2));
        }
	}
}
