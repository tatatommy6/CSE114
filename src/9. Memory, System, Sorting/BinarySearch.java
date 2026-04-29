/*
	BinarySearch.java
	Last modified by J.Finn: 4-Apr-2026
	Binarysearch of sorted array
 */

// import java.util.Arrays;


// 이진 탐색 알고리즘 구현 코드
// 이진 탐색은 정렬되어 있는 배열에서 특정 값(key 값)을 찾는 알고리즘임
// 1. 배열의 중간 인덱스를 지정한다
// 2. 중간 인덱스의 값보다 key값이 더 크면 중간 인덱스의 오른쪽 부분을 탐색하고
// 3. 중간 인덱스의 값보다 key값이 작으면 중간 인덱스의 왼쪽 부분을 탐색한다.
// 4. 이 과정을 반복하여 key값을 찾을 때 까지 탐색한다.
public class BinarySearch {
	/*
		a must be sorted
		search a[low] .. a[high-1] for value
		Return: index i where a[i] == value,
			or -1 if value not found.
	 */

	// 이진 탐색을 하다가 값을 찾으면 해당 인덱스를 return
	// 못찾으면 -1 reutrn 하는 함수
    public static int binsearch (int value, int[] a, int low, int high) {
		high--;
		while (low <= high) {
			int middle = (low + high) / 2;
			if (a[middle] == value) return middle;
			if (a[middle] < value) low = middle + 1;
			else high = middle - 1;
		}
		return -1; 
    }

    public static void main (String[] args) {
		int [] a = { 0, 3, 5, 7, 9, 20 };
		int [] searches = { 0, 3, 20, 10, 2 };
		int [] expected = { 0, 1, 5, -1, -1 };
		boolean failures = false;

		for (int i = 0; i < searches.length; i++){
			int result = binsearch(searches[i], a, 0, a.length);
			if (result != expected[i]) {
				failures = true;
				System.out.println("Error: search for " + searches[i] +	
					" returned " + result + ", expected " + expected[i]);
			}
		}
		if (!failures)
			System.out.println("All tests passed");
	}
}

