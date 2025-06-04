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
            int c = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for(int i=0; i<n; ++i)
                a[i] = scanner.nextInt();
            for(int i=0; i<n; ++i)
                b[i] = scanner.nextInt();
            Map<Integer, Integer> vitaminList = new HashMap<>();
            for(int i=0; i<n; ++i) {
                if(vitaminList.containsKey(a[i])) {
                    int val = vitaminList.get(a[i]);
                    if(val>b[i])
                    vitaminList.put(a[i], b[i]);
                }
                else {
                    vitaminList.put(a[i], b[i]);
                }
            }
            List<Map.Entry<Integer, Integer>> sortedVitaminList = new ArrayList<>(vitaminList.entrySet());
            sortedVitaminList.sort(Map.Entry.comparingByValue());
            
            int maxValue = Integer.MIN_VALUE;
            int i = 1, y=0;
            for(Map.Entry<Integer, Integer> vitaminPair: sortedVitaminList) {
                y += vitaminPair.getValue();
                maxValue = Math.max(maxValue, (c*i++)-(y));
            }
            if(maxValue<1)
                System.out.println(0);
            else
                System.out.println(maxValue);
        }
	}
}
