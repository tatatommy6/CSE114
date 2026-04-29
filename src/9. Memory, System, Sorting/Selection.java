/*
	Selection.java
	Last modified by J.Finn: 4-Apr-2026
	Implementation of Selection Sort
 */

import java.util.Arrays;
// 선택 정렬
// 선택 정렬은 정렬되지 않은 데이터들에 대해 가장 작은 데이터를 찾아 가장 앞의 데이터와 교환해나가는 방식.

// 1. 배열의 첫 번째 위치를 기준으로 시작한다.
// 2. 현재 위치부터 배열 끝까지 순회하면서 가장 작은 값을 찾는다.
// 3. 찾은 최소값을 현재 위치의 값과 교환한다.
// 4. 기준 위치를 한 칸 오른쪽으로 이동한다.
// 5. 남은 부분 배열에 대해 같은 과정을 반복한다.
// 6. 배열 끝까지 반복하면 전체 배열이 정렬된다.

// 시간복잡도는 O(n^2).
public class Selection {
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
    public static void selectionSort (int[] a, int n) {
		int min;
		for (int i = 0; i < n; i++) {
	    	min = i;	// assume smallest already in place
			// find the smallest
			for (int j = i + 1; j < n; j++) 
				if (a[j] < a[min])
					min = j;
			if (i != min)
                swap(a, i, min);
		}
    }

    public static void main (String[] args) {
		int [] a = { 5, 7, 9, 0, 20, 3};
		int [] asorted = { 0, 3, 5, 7, 9, 20 };
		// here is another way to print a whole array up to its length
		System.out.println(Arrays.toString(a));

		// 배열은 참조로 전달되기 때문에 함수 안에서 바꾸면 원본이 바뀜.
		selectionSort(a, a.length);
		System.out.println(Arrays.toString(a));    	
		// Arrays.equals tests if two arrays have equal elements!
		if (Arrays.equals(a, asorted))
			System.out.println("Sort worked, yay!");
		else
			System.out.println("Sort failed, why oh why?");
    }
}