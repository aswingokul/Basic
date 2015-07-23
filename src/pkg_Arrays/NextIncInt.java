/**
 * 
 */
package pkg_Arrays;

import java.util.Scanner;

/**
 * @author Aswin
 *
 */
public class NextIncInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		boolean nextNumber = true;
		int next = number;
		int f1, i =1;
		while(nextNumber){
			next = number+i;
			while(next!=0){
				if(next/10==0){
					System.out.println(number+i);
					nextNumber = false;
					break;
				}
				f1=next%10;
				next = next/10;
				if((f1-1)==(next%10))
					continue;
				else{
					i++;
					break;
				}
			}
		}

	}

}
