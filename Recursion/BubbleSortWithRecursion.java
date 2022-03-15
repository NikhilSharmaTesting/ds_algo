package Recursion;

import java.util.Arrays;

public class BubbleSortWithRecursion {

	public static void main(String[] args) {
		int[] data = { 4, 3, 2, 1 };
		bubbleSort(data, 0, 0, data.length - 1);
		System.out.println(Arrays.toString(data));

	}

	public static void bubbleSort(int[] data, int nOfLoops, int start, int end) {

//		System.out.println(Arrays.toString(data) + " " + nOfLoops + " " + start + " " + end);
		if (start == end) {
			if (start == 0 && end == 0) {
				return;
			} else {
				bubbleSort(data, ++nOfLoops, 0, --end);
			}

		}

		else if (data[start] > data[start + 1]) {
			swap(start, start + 1, data);
			bubbleSort(data, nOfLoops, ++start, end);
		} else {
			bubbleSort(data, nOfLoops, ++start, end);
		}
	}

	public static void swap(int first, int second, int[] data) {
		int temp = data[first];
		data[first] = data[second];
		data[second] = temp;

	}

}
