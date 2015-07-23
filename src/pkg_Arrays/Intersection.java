/**
 * 
 */
package pkg_Arrays;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Aswin
 *
 */
public class Intersection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "xyz";
		System.out.println(a.hashCode());
		String b = "xyz";
		System.out.println(b.hashCode());
		System.out.println("Enter the max input range for both arrays: ");
		Scanner sc = new Scanner(System.in);
		int maxNum = sc.nextInt();
		
		System.out.println("Enter number of elements in both arrays: ");
		int elemCount = sc.nextInt();
		int[] arr1 = new int[elemCount];
		int[] arr2 = new int[elemCount];
		int[] res = new int[elemCount];
		Random rnd = new Random();
		System.out.print("arr1: ");
		for(int i = 0; i<elemCount; i++){
			arr1[i] = rnd.nextInt(maxNum);
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.print("arr2: ");
		for(int i = 0; i<elemCount; i++){
			arr2[i] = rnd.nextInt(maxNum);
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		
		boolean[] bucket = new boolean[maxNum];
		for(int k =0; k<maxNum; k++)
			bucket[k] = false;
		for(int i=0; i<elemCount; i++){
			bucket[arr1[i]] = true;
		}
		int m=0;
		
		for(int j=0; j<elemCount; j++){
			if(bucket[arr2[j]]==true){
				res[m] = arr2[j];
				m++;
			}
		}
		
		for(int k=0; k<elemCount; k++){
			if(res[k]!=0)
				System.out.print(res[k]+" ");
		}

	}

}
