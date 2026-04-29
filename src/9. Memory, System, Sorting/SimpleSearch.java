/*
	SimpleSearch.java
	Last modified by J.Finn: 4-Apr-2026
	Simple array search
 */

// import java.util.Arrays;

// 순차 탐색
// 순차 탐색은 배열의 처음부터 끝까지 순서대로 탐색하는 방법

// 1. 배열의 첫 번째 요소부터 시작한다.
// 2. 현재 요소가 찾고 싶은 값(value)과 같은지 비교한다.
// 3. 같으면 그 위치(index)를 반환하고 종료한다.
// 4. 다르면 다음 요소로 이동한다.
// 5. 배열 끝까지 반복한다.
// 6. 끝까지 찾지 못하면 -1을 반환한다.

// 시간복잡도는 O(n). 하지만 최선(맨 앞에서 찾았을 때)은(는) O(1).
public class SimpleSearch {
	/*
		search a[0] .. a[n-1] for value
		Return: index i where a[i] == value,
			or -1 if value not found.
	 */
    public static int search (int value, int[] a, int n) {
		for (int i = 0; i < n; i++)
			if (a[i] == value) return i;
		return -1; 
    }

    public static void main (String[] args) {
		int [] a = { 0, 7, 5, 9, 3, 20 };
		int [] searches = { 0, 3, 20, 10, 2 };
		int [] expected = { 0, 4, 5, -1, -1 };
		boolean failures = false;
		for (int i = 0; i < searches.length; i++){
			int result = search(searches[i], a, a.length);
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

