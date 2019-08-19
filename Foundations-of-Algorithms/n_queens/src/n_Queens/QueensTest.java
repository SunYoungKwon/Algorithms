// 2018-07-04
// SunnyK

package n_Queens;

import java.util.Scanner;

public class QueensTest {
	public static void main(String[] args) {
		Queens queens; // Queen객체 선언

		Scanner scanner = new Scanner(System.in); // 퀸의개수를 입력받기 위한 스캐너

		System.out.print("Queen의 개수를 입력하시오(양의 정수): ");
		int numOfQueens = scanner.nextInt(); // 입력받은 값을 numOfQueens에 저장

		queens = new Queens(numOfQueens); // 객체 초기화
		queens.queens(0);

		scanner.close();
	}
}