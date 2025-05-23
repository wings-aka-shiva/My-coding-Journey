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
		    int[] nums = new int[3];
		    for(int i=0; i<3; ++i) {
		        nums[i] = scanner.nextInt();
		    }
		    int max = Math.max(nums[0], nums[1]);
		    int min = Math.min(nums[0], nums[1]);
		    if(max<=nums[2]){
		        System.out.println("Alice");
		    }
		    else{
		        if(Math.max(min, max - nums[2]) > nums[2]) {
		            System.out.println("Bob");
		        }
		        else {
		            System.out.println("Alice");
		        }
		    }
		}
	}
}
