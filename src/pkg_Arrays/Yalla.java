/**
 * 
 */
package pkg_Arrays;

import java.util.Scanner;

/**
 * @author Aswin
 *
 */

/*===========================================================
 * Replace %20 in the input string with a space
 * Eg: Input - hello%20world
 * 		Output - hello world 
 * ==========================================================
 */
public class Yalla {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter String:");
		Scanner sc = new Scanner(System.in);
		String s1 = new String();
		s1="";
		s1 = sc.next();
		System.out.println(s1);
		for(int i=0;i<s1.length()-2;i++){
			
			System.out.println("s1.substring(i, i+3): "+s1.substring(i, i+3));
			if(s1.substring(i, i+3).compareTo("%20")==0){
				System.out.println("Replace the %20");
				s1=s1.substring(0, i)+" "+s1.substring(i+3);
				System.out.println(s1);
			}
		}
		System.out.println("Output: "+s1);

	}

}
