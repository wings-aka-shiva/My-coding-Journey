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
		    int rem1Count = 0;
		    int rem2Count = 0;
		    boolean rem0 = false;
		    int size = scanner.nextInt();
		    while(size-- != 0) {
		        int ele = scanner.nextInt();
		        int rem = ele%3;
		        if(rem == 0) {
		            rem0 = true;
		        }
		        if(rem==1) {
		            rem1Count++;
		        }
		        if(rem==2) {
		            rem2Count++;
		        }
		    }
		    if(rem0 == true || rem1Count>2 || rem2Count>2 || (rem1Count>0 && rem2Count>0)){
		        System.out.println("Yes");
		    }else {
		        System.out.println("No");
		    }
		}
	}
}
