// 2019-03-25
// SunnyK

import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {
		int input[];
		int noInput;
		int x;
		
		Scanner scanner = new Scanner(System.in);	// x�� ���� �Է¹ޱ� ���� ��ĳ��
		System.out.print("input�� ����: ");
		noInput = scanner.nextInt();
		input = new int[noInput];
		
		System.out.print("input: ");
		for (int i = 0; i < noInput; i++)
			input[i] = scanner.nextInt();
		
		System.out.print("ã�� ��: ");
		x = scanner.nextInt();
		
		System.out.print("����� �˻����(1 - �����˻�, 2 - �̺а˻�): ");
		int n = scanner.nextInt();
		int xlocation = -1;
		
		switch(n) {
			case 1:
				SequentialSearch test1 = new SequentialSearch();
				xlocation = test1.seqSearch(input, x);
				break;
			case 2:
				BinarySearch test2 = new BinarySearch();
				xlocation = test2.binSearch2(input, x);
				break;
		}

		System.out.println("��ġ(0���� ����, ������ -1): " + xlocation);
		
		scanner.close();
	}
	
}
