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
            int n = scanner.nextInt();
            // int[] nums = new int[n];
            Set<Integer> nums = new HashSet<>();
            for(int i=0; i<n; ++i)
                nums.add(scanner.nextInt());
            if(nums.size()>1)
                System.out.println(2);
            else
                System.out.println(-1);
        }
	}
}
