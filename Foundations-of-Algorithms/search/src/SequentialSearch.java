// 2019-03-25
// SunnyK

public class SequentialSearch {

	public int seqSearch(int input[], int key) {
		int numOfInput = input.length;
		int location = 0;	// 검사중인 위치
		
		while(location < numOfInput && input[location] != key)	// 현재 위치가 배열의 끝이 아니면서 찾고자하는 값이 아닐 때
			location++;	// 다음 위치로 이동
		
		if (location >= numOfInput)
			location = -1;	// input에 x가 없으면 location은 -1
		
		return location;
	}
	
	public void printArray(int array[]) {
		System.out.print("[ ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("]");
	}
}
