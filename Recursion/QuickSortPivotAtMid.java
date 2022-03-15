package Recursion;

import java.util.Arrays;

public class QuickSortPivotAtMid {

	public static void main(String[] args) {
		int[] data = { 1,1};
		quickSort(data,0,data.length-1);
		System.out.println(Arrays.toString(data));
	}
	public static void quickSort(int[] arr, int start, int end) {
		int low=start;
		int high=end;
		int pivot=low+(high-low)/2;
		if(start>=end) {
			return;
		}
		
		while(low<high) {
			
			while(arr[low]<arr[pivot]) {
				low++;
			}
			while(arr[high]>arr[pivot]) {
				high--;
			}
			
			swap(arr, low, high);
		}
		
		quickSort(arr,start,pivot-1);
		quickSort(arr,pivot+1,end);
		
	}
	
	public static void swap(int[] arr, int first, int second) {
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}

}
