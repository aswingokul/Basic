/**
 * 
 */
package pkgStackQueue;

import pkg_SinglyLinkList.Node;
/**
 * @author Aswin
 *
 */
public class Queue {
	Node<Integer> first, last;
	
	public void enqueue(int data){
		if(first==null){
			last = new Node<Integer>(data);
			first = last;
		}
		else {
			last.next = new Node<Integer>(data);
			last = last.next;
		}
		
	}
	
	public void dequeue(){
		if(first!=null)
			first = first.next;
	}
	
	public void printQueue(){
		Node<Integer> currNode = first;
		while(currNode!=null){
			System.out.print(currNode.elem+"_|");
			currNode = currNode.next;
		}
		System.out.println();
	}

}
