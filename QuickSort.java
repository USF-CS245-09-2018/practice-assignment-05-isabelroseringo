import java.util.Arrays; 

public class QuickSort implements SortingAlgorithm {

	/*
		- choose a pivot point
		- arrange values around pivot
		- quicksort either side of pivot
	*/

	public void sort(int[] a) {
		quicksort(a, 0, a.length - 1); 
	}

	public void quicksort(int[] a, int left, int right) {
		if (left < right) {
			int p = partition(a, left, right); 
			quicksort(a, left, p - 1); 
			quicksort(a, p + 1, right); 
		}
	}

	public int partition(int[] a, int left, int right) {
		int pivot = left; 
		int i = left + 1; 
		int k = right; 
		while (i < k) {
			while (i < right && a[i] <= a[pivot]) {
				i++; 
			}
			while (k > left && a[pivot] < a[k]) {
				k--; 
			}	
			if (i < k) {
				swap(a, i, k); 
			}	
		}
		if (a[pivot] > a[k]) {
			swap(a, pivot, k);
		}
		return k; 
	}

	public void swap(int[] a, int x, int y) {
		int temp = a[x]; 
		a[x] = a[y]; 
		a[y] = temp; 
	}
}