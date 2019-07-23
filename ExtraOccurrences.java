package deleteoccurrences;

import java.util.Arrays;

public class ExtraOccurrences {
	
	public static void main(String[] args) {
		int[] elements = {6,1,2,3,1,2,3,4,4,4,4,5,1,1,2,5,5,5,5};
		int[] copy = elements.clone();
		
		int N = 2;
		
		for (int i = elements.length - 1; i>= 0; i--) {
			int counter = 0;
			for (int j = 0; j <= elements.length - 1; j++) {
				if (elements[j] == elements[i]) {
					counter++;
				}	
			}
			
			if (counter > N) {
					elements[i] = -1;
			}
		}
		System.out.println(Arrays.toString(copy));
		System.out.println(Arrays.toString(elements));
		
		int marked = 0;
		for (int item : elements) {
			if (item == -1) {
				marked++;
			}
		}
		
		System.out.println(elements.length);
		System.out.println(elements.length - marked);
		System.out.println();
		
		int[] result = new int[elements.length - marked];
		
		int elementsIndex = 0; // set to 0
		
		
		for (int r = 0; r <= result.length - 1; r++) {
			while (elements[elementsIndex] == -1) {
				++elementsIndex;
			}
			result[r] = elements[elementsIndex];
			++elementsIndex;
		}
		
		
		System.out.println(Arrays.toString(result));
			
	}
}
