import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static int gcd(int x, int y) {
        while(y!=0) {
            int temp = y;
            y = x%y;
            x = temp;
        }
        
        return x;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while(t-- != 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            
            if(gcd(x,y) > 1) {
                System.out.println(0);
            }
            else if(gcd(x+1, y)>1 || gcd(x, y+1)>1) {
                System.out.println(1);
            }
            else {
                System.out.println(2);
            }
        }
	}
}