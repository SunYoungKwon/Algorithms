// 2019-03-25
// SunnyK

package sort;

public class ExchangeSort {
	
	public void exchange (int array[]) {
		for(int i = 0; i < array.length - 1; i++) {	// i�� 0���� �迭�� ��-1 ����
			for(int j = i + 1; j < array.length; j++) {	// j�� i�ٷ� ����
				if (array[j] < array[i]) {
					int temp = array[i];	// S[i]�� S[j]�� ��ȯ
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

}
