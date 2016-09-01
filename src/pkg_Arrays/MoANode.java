/**
 * 
 */
package pkg_Arrays;

import java.util.Random;



/**
 * @author Aswin
 *
 */

//This method implements Moore's voting algorithm 
public class MoANode{
	
	public static void main(String args[]){
		int[] array = {1,3,3,3,3,5,6,7};
	
		for(int i = 0; i<array.length; i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
		MoANode ob = new MoANode();
		ob.printMajority(array);
	}
	
	public int findCandidate(int input[]){
		int majorInd = 0, count = 1;
		
		for(int i=1; i<input.length; i++){
			if(input[majorInd] == input[i])
				count++;
			else
				count--;
			if(count == 0){
				majorInd = i;
				count =1;
			}
				
		}
//		System.out.println("Answer:"+((count==0)?array[majorInd]:"None"));
		System.out.println(input[majorInd]);
		return input[majorInd];
	}
	
	void printMajority(int input[]){
		int cand = findCandidate(input);
		if(isMajority(input, cand)){
			System.out.println("Major Element: "+cand);
		}else
			System.out.println("None");
	}
	
	boolean isMajority(int input[],int candy){
		int count = 0;
		int size = input.length;
		for(int i=0; i<input.length;i++){
			if(input[i] == candy)
				count++;
		}
		if(count>(size/3)){
			return true;
		}else
			return false;
	}
	
}
