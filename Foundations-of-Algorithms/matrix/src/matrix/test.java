// 2019-03-30
// SuunyK

package matrix;

public class test {
	
	public static void main(String[] args) {
		
		Matrixmult test = new Matrixmult();
		int A[][] = test.initializeMatrix();
		int B[][] = test.initializeMatrix();
		
		System.out.println("[ MatrixA ]");
		test.printMatrix(A);
		System.out.println("[ MatrixB ]");
		test.printMatrix(B);
		
		int C[][] = test.matrixmult(A, B);
		System.out.println("--- Multiply matrixA and matrixB ---");
		test.printMatrix(C);
		
	}
}
