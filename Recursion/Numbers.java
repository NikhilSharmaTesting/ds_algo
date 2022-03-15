package Recursion;

public class Numbers {

	public static void main(String[] args) {
//		oneToN(1);
		System.out.println(reverse(123));

	}
	
//	public static void nTo1(int n) {
//		if(n==10) {
//			System.out.println(10);
//			return;
//		}else {
//			nTo1(n+1);
//			System.out.println(n);
//		}
//	}
	
//	public static void oneToN(int n) {
//		
//		if(n==10) {
//			System.out.println(10);
//			return;
//		}
//		System.out.println(n);
//		oneToN(n+1);
//		
//	}
	
//	

//	

//	public static int sumOfDigit(int n) {
//		if(n/10==n) {
//			return n;
//		}
//		return n%10+sumOfDigit(n/10);
//	}

//	public static int productOfDigit(int n ) {
//		if(n/10==0) {
//			return n;
//		}
//		return n%10*productOfDigit(n/10);
//	}
	
	static int sum=0;
	
	public static int reverse(int num) {
		if(num==0) {
			return sum;
		}
		sum=sum*10+num%10;
		
		return reverse(num/10);
	}
}
