// 2019-03-25
// SunnyK

public class SequentialSearch {

	public int seqSearch(int input[], int key) {
		int numOfInput = input.length;
		int location = 0;	// �˻����� ��ġ
		
		while(location < numOfInput && input[location] != key)	// ���� ��ġ�� �迭�� ���� �ƴϸ鼭 ã�����ϴ� ���� �ƴ� ��
			location++;	// ���� ��ġ�� �̵�
		
		if (location >= numOfInput)
			location = -1;	// input�� x�� ������ location�� -1
		
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
