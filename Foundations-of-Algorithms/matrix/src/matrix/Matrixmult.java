// 2019-03-30
// SunnyK

// import java.util.Scanner;
package matrix;
import java.util.Scanner;

public class Matrixmult {
	public int[][] matrixmult(int A[][], int B[][]) {
		int row = A.length;
		int col = B[0].length;
		int result[][] = new int[row][col]; // m*n행렬과 a*b행렬을 곱하면 m*b

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				result[i][j] = 0;
				for (int k = 0; k < row; k++) {
					result[i][j] = result[i][j] + A[i][k] * B[k][j];
				}
			}
		}

		return result;
	}

	public void printMatrix(int input[][]) { // 행렬을 출력
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[0].length; j++) {
				System.out.printf("%3d", input[i][j]);
			}
			System.out.println("");
		}
	}

	public int[][] initializeMatrix() { // 입력받은 값으로 행렬을 초기화 
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Input the num of row : ");
		int row = sc.nextInt();
		System.out.print("Input the num of colume : ");
		int col = sc.nextInt();
		System.out.println("Input the matrix");
		int matrix[][] = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		//sc.close();
		return matrix;
	}

	
}
