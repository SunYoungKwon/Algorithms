// 2019-03-31
// SunnyK

package sort;

public class MergeSort {
	
	private int input[];
	
	public MergeSort() {}
	public MergeSort(int input[]) {
		this.input = input;
	}
	
	public void setarray(int input[]) {
		this.input = input;
	}
	
	// n개의 원소를 비내림차순으로 정렬(재귀)
	public void mergesort() {
		mergesort(input.length, input);
	}

	public void mergesort(int n, int array[]) {
		if (n > 1) {
			int f = n / 2;

			int Farray[] = new int[f];
			int Barray[] = new int[n - f];

			for (int i = 0; i < n; i++) {
				if (i < f)
					Farray[i] = array[i];
				else
					Barray[i - f] = array[i];
			}

			mergesort(f, Farray);
			mergesort(n - f, Barray);

			merge(f, Farray, Barray, array);
		}
	}

	private void merge(int f, int Farray[], int Barray[], int array[]) {
		int i = 0;
		int j = 0;
		int k = 0;

		for (int n = 0; n < array.length && i < f && j < Barray.length; n++) {
			if (Farray[i] < Barray[j]) {
				array[k] = Farray[i];
				i++;
			} else {
				array[k] = Barray[j];
				j++;
			}
			k++;
		}
		
		if (i < f) {
			while (i < f) {
				array[k] = Farray[i];
				i++;
				k++;
			}
		}
		else {
			while (j < Barray.length) {
				array[k] = Barray[j];
				j++;
				k++;
			}
		}
	}
	
	// 2019-04-15
	// 제자리 정렬(in-place sort)
	public void mergesort2() {
		mergesort2(0, input.length);
	}
	
	public void mergesort2(int low, int high) {
		int mid = (low + high) / 2;
		
		if(low < high - 1) {
			mergesort2(low, mid);
			mergesort2(mid, high);
			merge2(low, mid, high);
		}
	}
	
	private void merge2(int low, int mid, int high) {
		int i = low;	// index for input
		int j = mid;	// index for input
		
		int array[] = new int[high - low];
		int k = 0;		// index for array
		
		while(i < mid && j < high) {
			if(input[i] < input[j]) {
				array[k] = input[i];
				i++;
			} else {
				array[k] = input[j];
				j++;
			}
			
			k++;
		}
		
		if(i < mid) {
			while(i < mid) {
				array[k] = input[i];
				i++;
				k++;
			}
		} else {
			while(j < high) {
				array[k] = input[j];
				j++;
				k++;
			}
		}

		for(k = 0; k < array.length; k++) {
			input[low] = array[k];
			low++;
		}
	}
	//12 5 65 7 2 9 6 3 8 9
}
