package RotatedBinarySearch;

public class RotatedBinarySearch {
/*
 * This is used to find the element in the rotated array
 * 
 * so the main thing while solving this is 
 * 
 * suppose we have the array [3,4,5,1,2]
 * 
 * mid is at 2 element 5 
 * if start<=mid //check if the left side is sorted 
 * mean it is sorted part now check if the target >=start and <mid
 * if true then end =mid-1;// means element is in the left part 
 * else 
 * start=mid+1;// means element is in the right part 
 * 
 * suppose if the left side is not sorted then right side will be sorted for sure so 
 * no need the check for that thing over here just check 
 * 
 * target>mid and <=end 
 * start=mid+1;
 * 
 * other wise it is on the other half
 * 
 * 
 * 
 * 
 */
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
