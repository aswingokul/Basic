<<<<<<< HEAD
/**
 * 
 */
package pkg_Stack;

/**
 * @author Aswin
 *
 */
public class SplStackDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SplStack stk = new SplStack();
		stk.push(3);
		stk.push(4);
		stk.push(6);
		stk.push(9);
		stk.push(23);
		stk.printStack();
		
		System.out.println("Middle Element: "+stk.findMiddle().getData());
		stk.pop();
		stk.printStack();
		System.out.println("Middle Element: "+stk.findMiddle().getData());

	}

}
=======
/**
 * 
 */
package pkg_Stack;

/**
 * @author Aswin
 *
 */
public class SplStackDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SplStack stk = new SplStack();
		stk.push(3);
		stk.push(4);
		stk.push(6);
		stk.push(9);
		stk.push(23);
		stk.printStack();
		
		System.out.println("Middle Element: "+stk.findMiddle().getData());
		stk.pop();
		stk.printStack();
		System.out.println("Middle Element: "+stk.findMiddle().getData());

	}

}
>>>>>>> e1183d48c51150798e555e5c155c1abae0f1ee10
