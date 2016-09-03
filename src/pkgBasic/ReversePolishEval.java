/**
 * 
 */
package pkgBasic;

import java.util.Stack;

/**
 * @author aswin
 *
 */
public class ReversePolishEval {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] exp = {"2","1","+","3","*"};
		ReversePolishEval rpe = new ReversePolishEval();
		System.out.println(rpe.evalexp(exp));
	}
	
	int evalexp(String[] tokens) {
		Stack<Integer> stack = new Stack<Integer>();
		for(String t : tokens) {
			switch(t) {
			case "+":
				stack.push(stack.pop() +stack.pop());
				break;
			case "-":
				stack.push(-stack.pop() + stack.pop());
				break;
			case "*":
				stack.push(stack.pop() * stack.pop());
				break;
			case "/":
				int a = stack.pop(); int b = stack.pop();
				stack.push(b/a);
				break;
			default:
				stack.push(Integer.parseInt(t));				
			}
		}
		return stack.pop();
	}

}
