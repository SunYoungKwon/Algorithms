// 2019-03-25
// SunnyK

package sort;

public class ExchangeSort {
	
	public void exchange (int array[]) {
		for(int i = 0; i < array.length - 1; i++) {	// i는 0부터 배열의 끝-1 까지
			for(int j = i + 1; j < array.length; j++) {	// j는 i바로 다음
				if (array[j] < array[i]) {
					int temp = array[i];	// S[i]와 S[j]를 교환
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

}
