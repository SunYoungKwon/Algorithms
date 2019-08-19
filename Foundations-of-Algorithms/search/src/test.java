// 2019-03-25
// SunnyK

import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {
		int input[];
		int noInput;
		int x;
		
		Scanner scanner = new Scanner(System.in);	// x의 갑을 입력받기 위한 스캐너
		System.out.print("input의 개수: ");
		noInput = scanner.nextInt();
		input = new int[noInput];
		
		System.out.print("input: ");
		for (int i = 0; i < noInput; i++)
			input[i] = scanner.nextInt();
		
		System.out.print("찾을 값: ");
		x = scanner.nextInt();
		
		System.out.print("사용할 검색방법(1 - 순차검색, 2 - 이분검색): ");
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

		System.out.println("위치(0부터 시작, 없으면 -1): " + xlocation);
		
		scanner.close();
	}
	
}
