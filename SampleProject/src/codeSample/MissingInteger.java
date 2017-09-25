/* Assumption: if there is no missing Integer then returning -1
 */

package codeSample;

import java.util.Iterator;
import java.util.TreeSet;

public class MissingInteger {

	public static int Solution(int[] A)
	{
		
		TreeSet<Integer> tree = new TreeSet<>();
		for(int i : A)
			tree.add(i);
		Iterator<Integer> it = tree.iterator();
		int j = 1;
		int element;
		while (it.hasNext())
		{
			element = it.next();
			if (element > 0)
			{   
				 if (element == j) {
					 j++;
				 }
				 else {
					 return j;
				 }
			}
		}
		
			return j;
	
	}
	
}
