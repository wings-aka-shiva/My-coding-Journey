import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    private static int killTime(int s1, int s2, int d1, int d2, int h) {
        if(d1 == 0) {
            return ((h + d2 - 1) / d2)*2;
        }
        if(d2 == 0 || d1>= h || d1*2 > d2) {
            return (h + d1 - 1) / d1;
        }

        int remDamage2 = h-((h/d2)*d2);
        if( remDamage2!=0 && remDamage2 <= d1) {
            return (h/d2)*2 + 1;
        }
        else {
            return ((h + d2 - 1)/d2) * 2;
        }
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for(int i=0; i<t; ++i) {
		    int n = scanner.nextInt();
		    int h = scanner.nextInt();
		    int s1 = 1, s2 = 2, d1 = 0, d2 = 0, s, d;
		    while(n-- != 0) {
		        s = scanner.nextInt();
		        d = scanner.nextInt();
		        if(s == s1) {
		            d1 = Math.max(d, d1);
		        }
		        if(s == s2) {
		            d2 = Math.max(d, d2);
		        }
		    }
		    System.out.println(killTime(s1,s2,d1,d2,h));
		}
	}
}
