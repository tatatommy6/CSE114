/*
	Insertion.java
	Last modified by J.Finn: 4-Apr-2026
	Implementation of Insertion Sort
 */

import java.util.Arrays;

// 삽입 정렬
// 이미 정렬된 부분에 새 값을 끼워 넣는 방식의 정렬 알고리즘
// 시간 복잡도는 O(n^2)로 느린 편이지만, 작은 데이터셋이나 거의 정렬된 데이터셋에서는
// 버블 정렬이나 선택 정렬보다 빠를 수 있음.

// 1. 첫번째 요소는 정렬된 상태로 간주한다.
// 2. 다음 요소를 꺼낸다.
// 3. 꺼낸 값을 왼쪽(정렬된 부분)과 비교한다.
// 4. 왼쪽 값이 더 크면 오른쪽으로 한 칸씩 밀어낸다.
// 5. 더 이상 밀 필요 없으면 그 자리에 값을 넣는다.
// 6. 이 과정을 배열 끝까지 반복한다.

// 이런 방식이기 때문에 swap 이 필요함. 
public class Insertion {
	/*
		swap (interchange) array elements a[first] and a[second]
	 */
	public static void swap (int [] a, int first, int second) {
		int temp = a[first];
		a[first] = a[second];
		a[second] = temp;
	}
	
	/*
		Sort a[0] .. a[n-1] using Selection sort
		n must be <= a.length
	 */
    public static void insertionSort (int[] a, int n)  {
		for (int i = 1; i < n; i++) {
			for (int j = i;	j > 0 && a[j] < a[j-1]; j--)
				swap(a, j, j-1);
		}
    }

    public static void main (String[] args) {
		int [] a = { 0, 7, 5, 9, 3, 20 };
		int [] asorted = { 0, 3, 5, 7, 9, 20 };
		System.out.println(Arrays.toString(a));
		insertionSort(a, a.length);
		System.out.println(Arrays.toString(a));
		if (Arrays.equals(a, asorted))
			System.out.println("Sort worked, yay!");
		else
			System.out.println("Sort failed, why oh why?");
    }
}