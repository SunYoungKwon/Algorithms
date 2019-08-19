//2019-03-25
//SunnyK

package sort;
import java.util.Scanner;

public class test {
	
	public static void printArray(int S[]) {	// 배열 전체 출력
		System.out.print("[ ");
		for (int i = 0; i < S.length; i++) {
			System.out.print(S[i] + " ");
		}
		System.out.println("]");
	}
	
	public static void main(String[] args) {
		int input[];
		int noInput;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("The number of input: ");
		noInput = sc.nextInt();
		input = new int[noInput];
		
		System.out.print("Input: ");
		for (int i = 0; i < noInput; i++)
			input[i] = sc.nextInt();
		
		System.out.print("The way to sort(1-Exchange, 2-Merge1, 3-Merge2, 4-Quick): ");
		int way = sc.nextInt();
		
		sc.close();
		
		System.out.println("");
		System.out.println("[ Before ]-----------------------");
		printArray(input);
		
		switch(way) {
			case 1:
				ExchangeSort test1 = new ExchangeSort();
				test1.exchange(input);
				break;
			case 2:
				MergeSort test2 = new MergeSort(input);
				test2.mergesort();
				break;
			case 3:
				MergeSort test3 = new MergeSort(input);
				test3.mergesort2();
				break;
			case 4:
				QuickSort test4 = new QuickSort(input);
				test4.quicksort();
				break;
		}
		
		System.out.println("[ After ]------------------------");
		printArray(input);

	}
}
