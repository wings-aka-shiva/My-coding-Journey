import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scanner = new Scanner(System.in);
		int testCase = 0;
		int n = 0;
		testCase = scanner.nextInt();
		while(testCase>0){
		    n = scanner.nextInt();
		    sumToZero(n);
		    System.out.println();
		    testCase--;
		}

	}
	
	public static void sumToZero(int n) {
	    int temp = n;
	    if(temp==1){
	        System.out.print(-1);
	    }
	    else if(n%2 == 0) {
    	    while(temp>0) {
    	        if(temp%2 == 0){
    	            System.out.print(-1 + " ");
    	        }
    	        else{
    	            System.out.print(1 + " ");
    	        }
    	        temp--;
    	    }
	    }
	    else if(temp%2 == 1) {
	        int counter = 0;
	        while(counter<temp-3) {
    	        if(counter%2 == 0){
    	            System.out.print(-1 + " ");
    	        }
    	        else{
    	            System.out.print(1 + " ");
    	        }
    	        counter++;
    	    }
    	    System.out.print(2 + " " + -1 + " " + -1);
	    }
	}
}
