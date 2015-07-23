/**
 * 
 */
package pkg_Stack;
import pkgDoublyLinkList.Node;
/**
 * @author Aswin
 *
 */
public class SplStack {
	Node<Integer> head;
	int count;
	Node<Integer> midNode;
	
//	SplStack(){
//		head = new Node<Integer>();
//		count = 0;
//		midNode = new Node<Integer>();
//	}
	
	public void push(int data){
		Node<Integer> newNode = new Node<Integer>(data);
		newNode.setNext(head);
		this.count++;
		if(this.count == 1){
			this.midNode = newNode;
		}else if(this.count%2 != 0){
			this.midNode = this.midNode.getPrevious();
		}
		if(head != null)
			this.head.setPrevious(newNode);
		this.head = newNode;
	}
	
	public Node<Integer> pop(){
		if(this.count == 0){
			System.err.println("Error: Stack is empty!");
			return null;
		}
		
		Node<Integer> retNode = this.head;
		Node<Integer> nextHead = this.head.getNext();
		
		this.head = nextHead;
		if(this.head != null)
			this.head.setPrevious(null);
		
		--this.count;
		
		if(this.count%2 == 0)
			this.midNode = this.midNode.getNext();
			
		return retNode;
	}
	
	public Node<Integer> findMiddle(){
		if(count != 0)
			return midNode;
		System.err.println("Error: Stack is empty!");
		return null;
	}
	
	public void printStack(){
		Node<Integer> odu = head;
		while(odu != null){
			System.out.println("|_"+odu.getData() + "_|");
			odu = odu.getNext();
		}
	}

}
