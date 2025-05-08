import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.print(threeMultiple(n));
	}
	
	public static int threeMultiple(int n) {
	    int lowerLimit = n - (n%3);
	    int higherLimit = lowerLimit + 3;
	    if(n-lowerLimit < higherLimit-n) {
	        return lowerLimit;
	    }
	    else {
	        return higherLimit;
	    }
	   // if(n%3 == 0){
	   //     return n;
	   // }
	   // if(n%3 == 1){
	   //     return n-1;
	   // }
	   // if(n%3 == 2){
	   //     return n+1;
	   // }
	   // return n;
	}
}
