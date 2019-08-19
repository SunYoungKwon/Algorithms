// 2018-07-04
// SunnyK

package n_Queens;

public class Queens {
	private int col[]; // 각 행의 퀸의 위치를 저장할 배열
	private int n; // 퀸의 개수, 각 행과 열의 개수

	public Queens(int n) { // n*n의 체스판에 n개의 퀸을 배치하는 객체 생성
		col = new int[n];
		this.n = n;
	}

	public void queens(int level) { // level: 현재 행의 위치
		if (level == n) { // 현재 행이 n인가?
			// 행번호가 0부터 시작하므로 n까지 왔다는 것은 모든 행에 퀸이 배치되었다는 의미
			System.out.print("답: ");
			printQueens(col, level - 1, true); // 퀸의 위치 출력, level는 0부터 시작하므로 출력할 범위는 level-1
		} else
			for (int i = 0; i < n; i++) { // i는 현재 행에 놓여진 퀸의 위치
				col[level] = i; // 퀸을 (level, i)에 배치
				if (promising(level)) // 현재 행에 놓여진 퀸의 위치가 유망할 때
					queens(level + 1); // 다음 행 계속
			}
	}

	public boolean promising(int level) { // 현재 행에 놓여진 여왕말의 위치가 유망한지 판단
		int k = 0; // 검사할 행

		while (k < level) { // 첫 행부터 바로 직전의 행까지
			if (col[level] == col[k] || Math.abs(col[level] - col[k]) == (level - k)) {
				// 현재 행과 k번째 행의 퀸이 일직선상에 있거나, 대각선상에 있는 경우
				System.out.println(level + "번째 행에서 Backtracking");
				printQueens(col, level, false);	// 해답이 구해지지 않았으므료 false
				return false; // '거짓'을 반환
			}
			k++; // 다음행 검사
		}
		return true; // 바로 직전 행까지 모든 검사가 끝나면 '참' 반환
	}

	public void printQueens(int col[], int level, boolean isSolution) { // 퀸의 위치를 출력, level: 현재 퀸의 위치가 구해진 행
		// 퀸의 위치를 [ 1 2 3 4 ]형식으로 출력
		System.out.print("[ ");
		for (int i = 0; i <= level; i++) {// 0번 행부터 현재 level까지
			System.out.print(col[i] + " "); // 각 행의 퀸의 위치 출력
		}
		System.out.println("]"); // 줄바꿈

		// 퀸의 위치를 체스판 위의 모습으로 출력
		for (int c = 0; c < n; c++) { // 0 ~ n-1번째 행까지
			int currentPos = col[c]; // currentPos: c행에 놓여진 퀸의 위치
			System.out.print("|"); // 체스판 가장 왼쪽 테두리
			for (int r = 0; r < n; r++) { // 0 ~ n-1번재 열까지
				if (r == currentPos && c == level && isSolution == false) // (r: 여왕말이 놓여진 위치 && c: 현재까지 구해진 행 && 되추적이 일어남)
					System.out.print("X|"); // 여왕말을 X로 체스판 구분선을 |으로 출력함
				else if (r == currentPos && c <= level) // (r: 여왕말이 놓여진 위치 && 퀸의 위치가 구해진 레벨)
					System.out.print("O|"); // 여왕말을 O로 체스판 구분선을 |으로 출력함
				else // 여왕말이 놓여진 위치가 아니라면
					System.out.print(" |"); // 빈칸과 체스판| 출력
			}
			System.out.println(""); // 줄바꿈
		}
		System.out.println(""); // 줄바꿈
	}
}