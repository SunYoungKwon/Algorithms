// 2020-03-04
// SunnyK

package sort;

public class SelectionSort {
	
	// 선택정렬
	public void selectionSort(int[] input) {
		
		int smallest;	// list중 가장 작은 값의 인덱스
		int temp;		// 원소 exchange에 사용
		int noInput = input.length;
		
		for(int i = 0; i < noInput - 1; i++) {
			
			smallest = i;	// 최소값의 위치를 i로 초기화
			
			// i+1부터 마지막 원소까지 확인하며 최소값 찾기
			for(int j = i + 1; j < noInput; j++) {
				if(input[j] < input[smallest]) {
					smallest = j;
				}
			}
			
			// 최소값의 위치가 i와 같지 않다면
			if(i != smallest) {
				// swap
				temp = input[i];
				input[i] = input[smallest];
				input[smallest] = temp;
			}
		}
		
	}

}
