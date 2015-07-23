/**
 * 
 */
package pkg_Arrays;

import java.util.Scanner;

/**
 * @author Aswin
 *
 */
public class StringMatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = new String[5];
		String[] replace = new String[5];
		
		input[0] = "hello";
		input[1] = "is";
		input[2] = "madara";
		input[3] = "luffy";
		input[4] = "tobi";
		
		replace[0] = "hi";
		replace[1] = "was";
		replace[2] = "itachi";
		replace[3] = "dragon";
		replace[4] = "obito";
		boolean flag = false;
		String text = new String();
		text = "hello is madara there? this is tobi here. luffy wants to talk to you";
		Scanner sc = new Scanner(text);
		String inp;
		StringBuilder out = new StringBuilder();
		while(sc.hasNext()){			
			inp = sc.next();
			for(int i=0; i<input.length;i++){
				flag = false;				
				if(inp.compareTo(input[i])==0){
					inp = replace[i];
					out.append(inp);
					out.append(" ");					
					break;
				}else{
					flag = true;
					continue;
				}					
			}
			if(flag){
				out.append(inp);
				out.append(" ");				
			}			
		}
		System.out.print(out);
	}
}
