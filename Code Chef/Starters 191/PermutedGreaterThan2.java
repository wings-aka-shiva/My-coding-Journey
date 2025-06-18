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
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();

            
            if(x==0) {
                System.out.println("Yes");
            }
            else if(y==0){
                if(x <= z+1)
                    System.out.println("Yes");
                else 
                    System.out.println("No");
            }
            else {
                if(z >= x) 
                    System.out.println("Yes");
                else 
                    System.out.println("No");
            }
        }
	}
}