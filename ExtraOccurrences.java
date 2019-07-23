package deleteoccurrences;
import java.util.*;

public class ExtraOccurrences {
	public static void main(String[] args) {
		int[] elements = {6,1,2,3,1,2,3,4,4,4,4,5,1,1,2,5,5,5,5};
		List<Integer> arrList = new ArrayList<Integer>();
		int N = 2;
		
		
		for (int i = elements.length - 1; i >= 0; i--) {
			int counter = 0;
			for (int j = 0; j <= i; j++) {
				if (elements[j] == elements[i]) {
					counter++;
				}
			}
			if (counter <= N) {
				arrList.add(elements[i]);
			}	
		}
		
		
		int[] result = new int[arrList.size()];
		for (int i = 0; i <= arrList.size() - 1; i++) {
			result[i] = arrList.get(arrList.size() - 1 - i);
		}
		
		System.out.println(Arrays.toString(elements));
		System.out.println(Arrays.toString(result));
	}
}
