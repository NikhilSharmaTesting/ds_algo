package Recursion;

import java.util.ArrayList;

public class Practice {

	public static void main(String[] args) {
		int[] data = { 1, 2, 3, 4,4, 5 };
		ArrayList<Integer> out=search(data, 4, 0);
		System.out.println(out);

	}
	//returning the arraylist without passing it in the args

	public static ArrayList<Integer> search(int[] data, int target, int index) {
		ArrayList<Integer> out=new ArrayList<>();
		if(index==data.length-1) {
			return out;
		}
		
		if(data[index]==target) {
			out.add(index);
		}
		
		ArrayList<Integer> temp=search(data, target, ++index);
		
		out.addAll(temp);
		
		return out;
	}

	// returning the array list when we have duplicate element in the list by passing array list in args

//	public static ArrayList<Integer> search(int[] data, int target, int index, ArrayList<Integer> out) {
//
//		if (index == data.length - 1) {
//			return out;
//		}
//
//		if (data[index] == target) {
//			out.add(index);
//		}
//
//		return search(data, target, ++index, out);
//
//	}
	// linear search

	// linear search with recursion
//	public static int search(int[] data, int index, int target) {
//		if (index > data.length - 1) {
//			return -1;
//		}
//
//		if (data[index] == target) {
//			return index;
//		} else {
//			return search(data, ++index, target);
//		}
//
//	}

	// sorted array check if the array is sorted

//	public static boolean check(int[] data, int index) {
//
//		if (index == data.length - 1) {
//			return true;
//		}
//
//		return data[index] < data[index + 1] && check(data, ++index);
//
//	}

	// counting number of the zeros in the number
//	public static int count(int data) {
//		
//		if(data==0) {
//			return 0;
//		}
//		if(data%10==0) {
//			return 1+count(data/10);
//		}else {
//			return count (data/10);
//		}
//		
//	}

	// reversing the number eg 12345 output should be 54321

//	public static int reverse(int data) {
//		if(data==0)
//			return 0;
//		
//		
//		return (data%10)*(int)Math.pow(10,((int)(Math.log10(data))))+reverse(data/10);
//	}

	// product of the digits eb 1234=1*2*3*4=24

//	public static int productOfDigits(int num) {
//		if(num==0)
//			return 1;
//		
//		return num%10*productOfDigits(num/10);
//	}
//	
	// sum of the digits eg 1924 ==1+9+2+4

//	public static int sumOfDigits(int num) {
//		if(num==0)
//			return 0;
//		
//		
//		return (num%10)+sumOfDigits(num/10);
//		
//	}

	// sum of the number n to 1
//	public static int sum(int n) {
//		if(n==0)
//			return 0;
//		
//		
//		return n*sum(n-1);
//	}

	// product of the number n to 1
//	public static int product(int n) {
//		if(n==0)
//			return 1;
//		
//		
//		return n*product(n-1);
//	}

	// lets try doing the binary search using the recursion
	// when we are just updating the index we are sending

//	public static int find(int[] data, int start, int end, int target) {
//		if (start > end) {
//			return -1;
//		}
//		int mid = start + (end - start) / 2;
//		if (data[mid] == target) {
//			return mid;
//		}
//		
//
//		if (target > data[mid]) {
//			return find(data, mid + 1, end, target);
//		} else {
//			return find(data, start, mid - 1, target);
//		}
//
//	}

//	This is used to calculate the fibunaci number 
//	public static int fib(int num) {
//		if(num<2)
//			return num;
//		
//		return fib(num-1)+fib(num-2);
//		
//	}
	// lets try to print the reverse order 5,4,3,2,1

//	public static void print(int num) {
//		if(num==5) {
//			System.out.println(num);
//			return;
//		}
//		print(num+1);
//		System.out.println(num);
//		
//	}

	// it will print till 5 and in the way 1, 2,3 ,4 5
//	public static void print(int num) {
//		if(num==5) {
//			System.out.println(num);
//			return;
//		}
//		System.out.println(num);
//		print(num+1);
//	}

}
