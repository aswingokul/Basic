<<<<<<< HEAD
/**
 * 
 */
package pkg_Stack;
import pkg_SinglyLinkList.Node;

/**
 * @author Aswin
 *
 */
public class Stacks<T extends Comparable<T>> {
	Node<T> top;
	
	public void push(T data){
		Node<T> node = new Node<T>(data);
		if(top == null){
			top = node;
		}
		else{
			node.next = top;
			top = node; 
		}
	}
	
	public Node<T> pop(){
		Node<T> ret = top;
		if(top != null){
			top = top.next;
			return ret;
		}else
			return null;		
	}
	
	T peek(){
		return top.elem;
	}
	
	public Stacks(){
		top = null;
	}
	
	public void printStack(){
		Node<T> run = top;
		while(run != null){
			System.out.println("|_"+run.elem + "_|");
			run = run.next;
		}
	}
	
	public boolean isEmpty(){
		return (top == null);
	}
	public int size(){
		Node<T> run = top;
		int count = 0;
		while(run!=null && run.next!=null){
			count++;
			run = run.next;
		}
		return count;
	}
	
	public static void reverseString(String str ){
		int len = str.length();
		System.out.println("len: "+ len);
		char[] strarr = new char[len];
		strarr = str.toCharArray();
		Stacks<Character> stk = new Stacks<Character>();
		for(int i=0; i<strarr.length; i++){
			stk.push(strarr[i]);
		}
		
		System.out.println("Stacks items");
		stk.printStack();
		System.out.println("reversed array");
		for(int i=0; i<stk.size(); i++){
			strarr[i] = stk.pop().elem;
			System.out.print(strarr[i] + " ");
		}
		
		String op = strarr.toString();
		System.out.println("After reversal: " + op);
	}
	
	static int opPrecedence(char op){
		switch(op){
		case '+':
		case '-':
			return 1;
		
		case '*':
		case '/':
			return 2;
		
		case '^':
			return 3;
		}
		return -1;
	}
	
	static boolean isOperand(char c){
		return (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z');
	}
	
	static String infixToPostfix(String exp ){
		StringBuilder sb = new StringBuilder();
		Stacks<Character> stk = new Stacks<Character>();
		for(int i=0; i<exp.length(); i++){
			char c = exp.charAt(i);
			if(isOperand(c)){
				sb.append(c);
			}else if(c == '(')
				stk.push(c);
			else if(c == ')'){
				while((!stk.isEmpty()) && (!stk.top.elem.equals('('))){
					char x = (Character) stk.pop().elem;
					sb.append(x);
				}				
			}else{
				while((!stk.isEmpty()) && (opPrecedence(c) <= opPrecedence(stk.peek()))){
					char x = (Character) stk.pop().elem;
					sb.append(x);
				}
				stk.push(c);
			}
		}
		
		while(!stk.isEmpty()){
			char x = (Character) stk.pop().elem;
			sb.append(x);
		}
		
		return sb.toString();
	}
	
	void reverse(){
		T temp;
		if(!this.isEmpty()){
			/* Hold all items in Function Call Stack until we reach end of 
		     the stack */
			temp =  this.pop().elem;
			this.reverse();
			
			/* Insert all the items (held in Function Call Stack) one by one 
		       from the bottom to top. Every item is inserted at the bottom */
			insertAtBottom(this, temp);
		}
	}
	
	void insertAtBottom(Stacks<T> stack, T item){
		if(stack.isEmpty())
			stack.push(item);
		else{
			 /* Hold all items in Function Call Stack until we reach end of 
		       the stack. When the stack becomes empty, the isEmpty(*top_ref) 
		       becomes true, the above if part is executed and the item is 
		       inserted at the bottom */
			T temp = stack.pop().elem;
			insertAtBottom(stack, item);
			
			 /* Once the item is inserted at the bottom, push all the
	          items held in Function Call Stack */
			stack.push(temp);
		}
	}
}

=======
/**
 * 
 */
package pkg_Stack;
import pkg_SinglyLinkList.Node;

/**
 * @author Aswin
 *
 */
public class Stacks<T extends Comparable<T>> {
	Node<T> top;
	
	public void push(T data){
		Node<T> node = new Node<T>(data);
		if(top == null){
			top = node;
		}
		else{
			node.next = top;
			top = node; 
		}
	}
	
	public Node<T> pop(){
		Node<T> ret = top;
		if(top != null){
			top = top.next;
			return ret;
		}else
			return null;		
	}
	
	T peek(){
		return top.elem;
	}
	
	public Stacks(){
		top = null;
	}
	
	public void printStack(){
		Node<T> run = top;
		while(run != null){
			System.out.println("|_"+run.elem + "_|");
			run = run.next;
		}
	}
	
	public boolean isEmpty(){
		return (top == null);
	}
	public int size(){
		Node<T> run = top;
		int count = 0;
		while(run!=null && run.next!=null){
			count++;
			run = run.next;
		}
		return count;
	}
	
	public static void reverseString(String str ){
		int len = str.length();
		System.out.println("len: "+ len);
		char[] strarr = new char[len];
		strarr = str.toCharArray();
		Stacks<Character> stk = new Stacks<Character>();
		for(int i=0; i<strarr.length; i++){
			stk.push(strarr[i]);
		}
		
		System.out.println("Stacks items");
		stk.printStack();
		System.out.println("reversed array");
		for(int i=0; i<stk.size(); i++){
			strarr[i] = stk.pop().elem;
			System.out.print(strarr[i] + " ");
		}
		
		String op = strarr.toString();
		System.out.println("After reversal: " + op);
	}
	
	static int opPrecedence(char op){
		switch(op){
		case '+':
		case '-':
			return 1;
		
		case '*':
		case '/':
			return 2;
		
		case '^':
			return 3;
		}
		return -1;
	}
	
	static boolean isOperand(char c){
		return (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z');
	}
	
	static String infixToPostfix(String exp ){
		StringBuilder sb = new StringBuilder();
		Stacks<Character> stk = new Stacks<Character>();
		for(int i=0; i<exp.length(); i++){
			char c = exp.charAt(i);
			if(isOperand(c)){
				sb.append(c);
			}else if(c == '(')
				stk.push(c);
			else if(c == ')'){
				while((!stk.isEmpty()) && (!stk.top.elem.equals('('))){
					char x = (Character) stk.pop().elem;
					sb.append(x);
				}				
			}else{
				while((!stk.isEmpty()) && (opPrecedence(c) <= opPrecedence(stk.peek()))){
					char x = (Character) stk.pop().elem;
					sb.append(x);
				}
				stk.push(c);
			}
		}
		
		while(!stk.isEmpty()){
			char x = (Character) stk.pop().elem;
			sb.append(x);
		}
		
		return sb.toString();
	}
	
	void reverse(){
		T temp;
		if(!this.isEmpty()){
			/* Hold all items in Function Call Stack until we reach end of 
		     the stack */
			temp =  this.pop().elem;
			this.reverse();
			
			/* Insert all the items (held in Function Call Stack) one by one 
		       from the bottom to top. Every item is inserted at the bottom */
			insertAtBottom(this, temp);
		}
	}
	
	void insertAtBottom(Stacks<T> stack, T item){
		if(stack.isEmpty())
			stack.push(item);
		else{
			 /* Hold all items in Function Call Stack until we reach end of 
		       the stack. When the stack becomes empty, the isEmpty(*top_ref) 
		       becomes true, the above if part is executed and the item is 
		       inserted at the bottom */
			T temp = stack.pop().elem;
			insertAtBottom(stack, item);
			
			 /* Once the item is inserted at the bottom, push all the
	          items held in Function Call Stack */
			stack.push(temp);
		}
	}
}

>>>>>>> e1183d48c51150798e555e5c155c1abae0f1ee10
