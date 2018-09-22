public class InsertionSort implements SortingAlgorithm {

	/*
		- take the first element out of the unsorted array
		- copy to temp variable
		- compare to each element of the sorted portion, backwards
			- if it is greater than that element, move that one up a space and keep going
		- insert the temp variable into the place you end up
		- repeat for the rest of the array
	*/

	public void sort(int[] a) { 
		for (int i = 1; i < a.length; i++) {
			int temp = a[i]; 
			int k = i - 1; 
			while (k >= 0 && a[k] > temp) {
				a[k + 1] = a[k]; 
				--k;
			}
			a[k + 1] = temp; 
		}
	}	
}