package Recursion;

import java.util.Arrays;

public class MergeSortWithArgs {
	public static void main(String[] args) {
		int[] data = { 4,5,3,1,2};
		mergeSort(data, 0, data.length - 1);

		System.out.println(Arrays.toString(data));

	}

	public static void mergeSort(int[] data, int start, int end) {

		if (start == end) {
			return;
		}
		int mid = start + (end - start) / 2;

		mergeSort(data, start, mid);
		mergeSort(data, mid + 1, end);

		merge(data, start, mid + 1, end);

	}

	public static void merge(int[] data, int start, int mid, int end) {
		
		int sizeOfArray = end - start + 1;
		int[] temp = new int[sizeOfArray];
		int j = 0;

		int i1 = start;
		int i2 = mid;

		while (i1 < mid && i2 <= end) {

			if (data[i1] < data[i2]) {
				temp[j++] = data[i1++];
			} else {
				temp[j++] = data[i2++];
			}
		}

		while (i1 < mid) {

			temp[j++] = data[i1++];
		}

		while (i2 <= end) {

			temp[j++] = data[i2++];
		}

		for (j = 0; j < sizeOfArray; j++) {
			data[start + j] = temp[j];
		}

	}

}
