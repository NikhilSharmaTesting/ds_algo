package RotatedBinarySearch;

public class RotatedBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 1, 0, 1, 1, 1 };
		System.out.println(search(data, 0));
	}

	public static int search(int[] data, int target) {
		int start = 0;
		int last = data.length - 1;
		while (start <= last) {
			int mid = start + (last - start) / 2;
			System.out.println(start + " " + mid + " " + last);
			if (data[mid] == target) {
				return mid;
			} else if (data[start] == data[last]) {
				start++;
				last--;
			}

			else if (data[start] <= data[mid]) {
				if (data[start] <= target && data[mid] > target) {
					last = mid - 1;
				} else {
					start = mid + 1;
				}

			} else if (data[mid] <= target && data[last] >= target) {
				start = mid + 1;
			} else {
				last = mid - 1;
			}
		}
		return -1;

	}

}
