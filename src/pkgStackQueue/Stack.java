<<<<<<< HEAD
/**
 * 
 */
package pkgStackQueue;

import pkg_SinglyLinkList.Node;

/**
 * @author Aswin
 *
 */
public class Stack {
	Node<Integer> top;
	
	
	public void push(int data){
		
		Node<Integer> newNode = new Node<Integer>(data);
		newNode.next = top;
		top = newNode;
	}
	
	public void pop(){
		if(top!=null){
			//int elem = top.elem;
			top =top.next;
			//return elem;
		}
		//return 0;
	}
	
	public void printStack(){
		Node<Integer> currNode = top;
		
		while(currNode!=null){
			System.out.println("|_"+currNode.elem+"_|");
			currNode =currNode.next;
		}
	}
	
}
=======
/**
 * 
 */
package pkgStackQueue;

import pkg_SinglyLinkList.Node;

/**
 * @author Aswin
 *
 */
public class Stack {
	Node<Integer> top;
	
	
	public void push(int data){
		
		Node<Integer> newNode = new Node<Integer>(data);
		newNode.next = top;
		top = newNode;
	}
	
	public void pop(){
		if(top!=null){
			//int elem = top.elem;
			top =top.next;
			//return elem;
		}
		//return 0;
	}
	
	public void printStack(){
		Node<Integer> currNode = top;
		
		while(currNode!=null){
			System.out.println("|_"+currNode.elem+"_|");
			currNode =currNode.next;
		}
	}
	
}
>>>>>>> e1183d48c51150798e555e5c155c1abae0f1ee10
