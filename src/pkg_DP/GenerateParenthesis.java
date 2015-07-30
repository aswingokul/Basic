/**
 * 
 */
package pkg_DP;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author aswin
 *
 */
public class GenerateParenthesis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub		 
		GenerateParenthesis gp = new GenerateParenthesis();
		System.out.println("Efficient Method");
		System.out.println("-----------------");
		List<String> res = gp.generateParen(3);
		for(String word : res) {
			System.out.println(word);
		}
		
		System.out.println("Inefficient Method");
		System.out.println("-------------------");
		Set<String> out = gp.addParen(3);
		for(String s : out) {
			System.out.println(s);
		}
	}
	
	public List<String> generateParen(int count){
		char[] str = new char[count*2];
		List<String> list = new ArrayList<String>();
		generateParen(list,count,count,str,0);
		return list;
	}
	
	/*
	 * This method builds the string of parenthses from the scratch
	 */
	public void generateParen(List<String> list, int leftRem, int rightRem, char[] str, int count) {
		if(leftRem < 0 || rightRem < leftRem)
			return;	//invalid state
		
		if(leftRem == 0 && rightRem == 0) {
			String s = String.copyValueOf(str);
			list.add(s);
		}else {
			//Add left parens, if any left parens remaining
			if(leftRem > 0) {
				str[count] = '(';
				generateParen(list,leftRem-1,rightRem,str,count+1);
			}
			
			//Add right parens if the expression is still valid
			if(rightRem > leftRem) {
				str[count] = ')';
				generateParen(list,leftRem,rightRem-1,str,count+1);
			}
		}			
	}
	
	/*
	 * Inefficient method since it needs to check for duplicate
	 */
	public Set<String> addParen(int remaining){
		Set<String> set = new HashSet<String>();
		if(remaining == 0) {
			set.add("");
		}else {
			Set<String> prev = addParen(remaining-1);
			for(String word : prev) {
				for(int i=0; i<word.length();i++) {
					if(word.charAt(i) == '(') {
						String s = insertParen(word,i);
						set.add(s);
					}
				}
				if(!set.contains("()"+word)) {
					set.add("()"+word);
				}
			}
		}
		return set;
	}
	
	String insertParen(String s, int leftInd) {
		String left = s.substring(0,leftInd+1);
		String right = s.substring(leftInd+1);
		return left+"()"+right;
	}
	
	
}
