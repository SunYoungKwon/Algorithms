// 2019-04-14
// sunnyK

package sort;

public class QuickSort {
	private int input[];
	private int pivot = 0;
	
	public QuickSort() {}
	
	public QuickSort(int input[]) {
		this.input = input;
	}
	
	public void setArray(int array[]) {
		this.input = array;
	}
	
	public void setPivot(int n) {
		this.pivot = n;
	}
	
	public void quicksort() {
		quicksort(0, input.length - 1);
	}
	
	public void quicksort(int input[]) {
		this.input = input;
		quicksort(0, input.length - 1);
	}
	
	public void quicksort(int low, int high) {
		if(low < high) {
			partition(low, high);
			quicksort(low, pivot - 1);
			quicksort(pivot + 1, high);
		}
	}
	
	private void partition(int low, int high) {
		int j = low;
		int pivotitem = input[low];
	
		for (int i = low + 1; i <= high; i++) {
			if (pivotitem > input[i]) {
				j++;
				int temp1 = input[i];
				input[i] = input[j];
				input[j] = temp1;
			}
		}
		
		pivot = j;
		int temp2 = input[j];
		input[j] = pivotitem;
		input[low] = temp2;
	}
	
	// 5 1 9 7 3 4 6 8 2 0
}
