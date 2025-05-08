import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        int bLength = 0;
        String s;
        String t;
        while(testCases>0){
            bLength = scanner.nextInt();
            s = scanner.next();
            t = scanner.next();
            oneDown(bLength, s, t);
            testCases--;
        }
	}
	
	public static void oneDown(int length, String s, String t) {
	    int sCount = 0;
	    for(int i = 0; i< length; ++i) {
	        if(t.charAt(i)=='1' && s.charAt(i)=='0'){
	            System.out.println("No");
	            return;
	        }
	        if(t.charAt(i)=='0' && s.charAt(i)=='1'){
	            sCount++;
	        }
	    }
	    if(sCount%2 == 0) {
	        System.out.println("Yes");
	    }
	    else{
	        System.out.println("No");
	    }
	}
}
