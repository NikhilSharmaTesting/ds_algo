package Recursion;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 5,4,3,2,1 };
		selectionSort(data, 0, data.length - 1,0);
		System.out.println(Arrays.toString(data));
	}
	
	public static void selectionSort(int[] num, int start, int end, int large) {
		System.out.println(Arrays.toString(num)+" "+ start+" "+end+" "+ large);
		
		if(end==0) {
			return;
		}
		if(start>end) {
			swap(large,end, num);
			selectionSort(num, 0,--end,0);
		}else {
			if(num[large]<num[start]) {
				large=start;
				selectionSort(num, ++start,end,large);
			}else {
				selectionSort(num, ++start,end,large);
			}
			
		}
		
	}
	public static void swap(int first, int second, int[] data) {
		int temp = data[first];
		data[first] = data[second];
		data[second] = temp;

	}

}
