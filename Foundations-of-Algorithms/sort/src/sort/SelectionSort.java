// 2020-03-04
// SunnyK

package sort;

public class SelectionSort {
	
	// ��������
	public void selectionSort(int[] input) {
		
		int smallest;	// list�� ���� ���� ���� �ε���
		int temp;		// ���� exchange�� ���
		int noInput = input.length;
		
		for(int i = 0; i < noInput - 1; i++) {
			
			smallest = i;	// �ּҰ��� ��ġ�� i�� �ʱ�ȭ
			
			// i+1���� ������ ���ұ��� Ȯ���ϸ� �ּҰ� ã��
			for(int j = i + 1; j < noInput; j++) {
				if(input[j] < input[smallest]) {
					smallest = j;
				}
			}
			
			// �ּҰ��� ��ġ�� i�� ���� �ʴٸ�
			if(i != smallest) {
				// swap
				temp = input[i];
				input[i] = input[smallest];
				input[smallest] = temp;
			}
		}
		
	}

}
