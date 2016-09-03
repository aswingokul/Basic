/**
 * 
 */
package pkg_Arrays;

import java.util.Stack;

/**
 * @author Aswin
 *
 */
public class PrettyPrintXAD {

	/**
	 * @param args
	 */
	
	static int removeIndex = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		PrettyPrintXAD pp = new PrettyPrintXAD();		
		XAD[] input = {
				new XAD(null, "1", "A"),				
				new XAD("1", "3", "B"),
				new XAD("7", "9", "H"),
				new XAD("3", "2", "C"),
				new XAD("3", "4", "D"),
				new XAD("1", "6", "E"),
				new XAD(null, "5", "F"),
				new XAD("9", "8", "H"),
				new XAD(null, "7", "G")

		};
		
		pp.prettyPrint(input);

	}
	
	
	
	void prettyPrint(XAD[] input){
		Stack<String> stack = new Stack<String>();
		int space = 1;
		String curr = null, next =null;
		for(int i=0; i<input.length; i++){
			XAD currObj = this.find(input, curr);
			if(currObj != null){
				next = currObj.id;
				stack.push(curr);
				this.printObj(stack, space, input, currObj);
				curr = next;
				next = null;
				space = 2 * space;
				input[removeIndex] = null;
			}else{
				curr = stack.pop();
				space = space/2;
			}			
		}
	}
	
	XAD find(XAD[] input, String key){
		XAD ob = null;
		for(int i=0; i<input.length; i++){
			if(input[i] != null && input[i].parent_id == key){
				removeIndex = i;
				ob = input[i];
				return ob;
			}
				
				
		}
		return null;
	}
	
	void printObj(Stack<String> stack, int space, XAD[] input, XAD curr){
		
		while(space > 0){
			System.out.print(" ");
			space--;
		}
		
		System.out.print(curr.val);
		System.out.println();
	}
	
	

}

class XAD{
	String parent_id;
	String id;
	String val;
	
	XAD(String p, String i, String v){
		parent_id = p;
		id = i;
		val = v;
	}
}
