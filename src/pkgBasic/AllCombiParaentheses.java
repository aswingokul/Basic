/**
 * 
 */
package pkgBasic;

/**
 * @author Aswin
 *
 */
public class AllCombiParaentheses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printBrackets(1);
	}
	
	public static void printBrackets(int n){
		for(int i=1; i<=n; i++){
			printBrackets("", 0, 0, i);
		}
	}
	
	public static void printBrackets(String output, int close, int open, int pairs){
		if(close == pairs && open == pairs)
			System.out.println(output);
		else{
			if(open < pairs){
				printBrackets(output+"(", close, open+1, pairs);
			}
			if(close < pairs){
				printBrackets(output+")", close+1, open, pairs);
			}			
		}
	}

}
