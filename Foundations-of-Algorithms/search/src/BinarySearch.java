// 2019-03-29
// SunnyK
// binary search는 비내림차순으로 정렬된 경우에만 사용 가능하다.

public class BinarySearch {

	// 반복(iteration)
	public int binSearch1(int input[], int key) {
		int low = 0;
		int mid;
		int high = input.length;
		int location = -1;

		while (low <= high && location == -1) {
			mid = (high + low) / 2;

			if (input[mid] == key) {
				location = mid;
				break;
			} else if (input[mid] > key)
				high = mid - 1;
			else
				low = mid + 1;
		}

		return location;
	}

	public int binSearch2(int input[], int key) {
		return binSearch2(input, 0, input.length, key);
	}
	
	// 재귀(recursion)
	public int binSearch2(int input[], int low, int high, int key) {
		int mid = (high + low) / 2;
		int location = -1;

		while (low <= high && location == -1) {
			if (input[mid] == key) {
				location = mid;
			} 
			else if (input[mid] > key) {
				binSearch2(input, low, mid - 1, key);
			}
			else {
				binSearch2(input, mid + 1, high, key);
			}
		}

		return location;
	}
}