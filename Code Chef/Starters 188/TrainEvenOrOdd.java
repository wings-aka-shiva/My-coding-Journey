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
        int arrSize = 0;
        while(t-- != 0) {
            int oddDaySum = 0, evenDaySum = 0;
            arrSize = scanner.nextInt();
            for(int i=1; i<=arrSize; ++i) {
                int temp = scanner.nextInt();;
                if(i%2 == 0) {
                    oddDaySum += temp;
                }
                else {
                    evenDaySum += temp;
                }
                
            }
            System.out.println(Math.max(oddDaySum, evenDaySum));
    	}
            
        }
}
