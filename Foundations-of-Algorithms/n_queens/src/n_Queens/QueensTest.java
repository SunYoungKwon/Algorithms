// 2018-07-04
// SunnyK

package n_Queens;

import java.util.Scanner;

public class QueensTest {
	public static void main(String[] args) {
		Queens queens; // Queen��ü ����

		Scanner scanner = new Scanner(System.in); // ���ǰ����� �Է¹ޱ� ���� ��ĳ��

		System.out.print("Queen�� ������ �Է��Ͻÿ�(���� ����): ");
		int numOfQueens = scanner.nextInt(); // �Է¹��� ���� numOfQueens�� ����

		queens = new Queens(numOfQueens); // ��ü �ʱ�ȭ
		queens.queens(0);

		scanner.close();
	}
}