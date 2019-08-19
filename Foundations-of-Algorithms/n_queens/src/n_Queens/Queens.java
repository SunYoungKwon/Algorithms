// 2018-07-04
// SunnyK

package n_Queens;

public class Queens {
	private int col[]; // �� ���� ���� ��ġ�� ������ �迭
	private int n; // ���� ����, �� ��� ���� ����

	public Queens(int n) { // n*n�� ü���ǿ� n���� ���� ��ġ�ϴ� ��ü ����
		col = new int[n];
		this.n = n;
	}

	public void queens(int level) { // level: ���� ���� ��ġ
		if (level == n) { // ���� ���� n�ΰ�?
			// ���ȣ�� 0���� �����ϹǷ� n���� �Դٴ� ���� ��� �࿡ ���� ��ġ�Ǿ��ٴ� �ǹ�
			System.out.print("��: ");
			printQueens(col, level - 1, true); // ���� ��ġ ���, level�� 0���� �����ϹǷ� ����� ������ level-1
		} else
			for (int i = 0; i < n; i++) { // i�� ���� �࿡ ������ ���� ��ġ
				col[level] = i; // ���� (level, i)�� ��ġ
				if (promising(level)) // ���� �࿡ ������ ���� ��ġ�� ������ ��
					queens(level + 1); // ���� �� ���
			}
	}

	public boolean promising(int level) { // ���� �࿡ ������ ���ո��� ��ġ�� �������� �Ǵ�
		int k = 0; // �˻��� ��

		while (k < level) { // ù ����� �ٷ� ������ �����
			if (col[level] == col[k] || Math.abs(col[level] - col[k]) == (level - k)) {
				// ���� ��� k��° ���� ���� �������� �ְų�, �밢���� �ִ� ���
				System.out.println(level + "��° �࿡�� Backtracking");
				printQueens(col, level, false);	// �ش��� �������� �ʾ����Ƿ� false
				return false; // '����'�� ��ȯ
			}
			k++; // ������ �˻�
		}
		return true; // �ٷ� ���� ����� ��� �˻簡 ������ '��' ��ȯ
	}

	public void printQueens(int col[], int level, boolean isSolution) { // ���� ��ġ�� ���, level: ���� ���� ��ġ�� ������ ��
		// ���� ��ġ�� [ 1 2 3 4 ]�������� ���
		System.out.print("[ ");
		for (int i = 0; i <= level; i++) {// 0�� ����� ���� level����
			System.out.print(col[i] + " "); // �� ���� ���� ��ġ ���
		}
		System.out.println("]"); // �ٹٲ�

		// ���� ��ġ�� ü���� ���� ������� ���
		for (int c = 0; c < n; c++) { // 0 ~ n-1��° �����
			int currentPos = col[c]; // currentPos: c�࿡ ������ ���� ��ġ
			System.out.print("|"); // ü���� ���� ���� �׵θ�
			for (int r = 0; r < n; r++) { // 0 ~ n-1���� ������
				if (r == currentPos && c == level && isSolution == false) // (r: ���ո��� ������ ��ġ && c: ������� ������ �� && �������� �Ͼ)
					System.out.print("X|"); // ���ո��� X�� ü���� ���м��� |���� �����
				else if (r == currentPos && c <= level) // (r: ���ո��� ������ ��ġ && ���� ��ġ�� ������ ����)
					System.out.print("O|"); // ���ո��� O�� ü���� ���м��� |���� �����
				else // ���ո��� ������ ��ġ�� �ƴ϶��
					System.out.print(" |"); // ��ĭ�� ü����| ���
			}
			System.out.println(""); // �ٹٲ�
		}
		System.out.println(""); // �ٹٲ�
	}
}