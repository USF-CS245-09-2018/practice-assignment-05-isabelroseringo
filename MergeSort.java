import java.util.Arrays; 

public class MergeSort implements SortingAlgorithm {

	/*
		- split array until it is in arrays of size 1
		- combine left and right halves
	*/

	public void sort(int[] a) {
		mergesort(a, 0, a.length - 1);
	}	

	public void mergesort(int[] a, int left, int right) {
		if (left >= right) {
			return; 
		}
		int mid = (left + right) / 2; 
		mergesort(a, left, mid); 
		mergesort(a, mid + 1, right); 
		int[] leftArray = Arrays.copyOfRange(a, left, mid + 1);
		int[] rightArray = Arrays.copyOfRange(a, mid + 1, right + 1); 
		merge(a, left, leftArray, rightArray); 
	}

	public void merge(int[] targetArray, int target, int[] leftArray, int[] rightArray) {
		int left = 0, right = 0; 

		while (left < leftArray.length && right < rightArray.length) {
			if (leftArray[left] < rightArray[right]) {
				targetArray[target++] = leftArray[left++]; 
			}
			else {
				targetArray[target++] = rightArray[right++]; 
			}
		}

		while (left < leftArray.length) {
			targetArray[target++] = leftArray[left++];
		}

		while (right < rightArray.length) {
			targetArray[target++] = rightArray[right++];
		}
	}
}