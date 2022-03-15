/**
 * 
 */
package Recursion;

/**
 * @author nikhilsharma
 *
 */
public class FirstPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printing(0,4);
	}
	
	/*
	 *  ####
	 *  ###
	 *  ##
	 *  #
	 */
	
	public static void printing(int x, int y) {
		if(y<1) {
			return;
		}else if(x==y) {
			System.out.println();
			printing(0,--y);
		}
		else {
			System.out.print("*");
			printing(++x,y);
		}
	}

}
