/**
 * 
 */
package pkg_Stack;

/**
 * @author Aswin
 *
 */
public class StackDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Stacks.reverseString("Hello Bitch");
		String exp = "a+b*c+d";
		System.out.println(Stacks.infixToPostfix(exp));
		
		Stacks<Integer> stack = new Stacks<Integer>();
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		System.out.println("Before reversing\n");
		stack.printStack();
		stack.reverse();
		System.out.println("\nAfter reversing");
		stack.printStack();

	}

}
