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
            int[] scores = new int[5];
            for(int i=0; i<5; ++i) {
                scores[i] = scanner.nextInt();
            }
            Arrays.sort(scores);
            int lessAverageSum = 0;
            int moreAverageSum = 0;
            int goldCoins = 0;
            for(int i=0; i<5; i++) {
                moreAverageSum += scores[i];
            }
            
            if(moreAverageSum>34) {
                System.out.println(goldCoins);
                continue;
            }
            
            for(int i=0; i<5; i++) {
                moreAverageSum = moreAverageSum + 10 - scores[i];
                goldCoins += 100;
                if(moreAverageSum>34) {
                    System.out.println(goldCoins);
                    break;
                }
            }
        }
	}
}
