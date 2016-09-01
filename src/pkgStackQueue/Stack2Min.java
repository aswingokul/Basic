/**
 * 
 */
package pkgStackQueue;

import pkg_SinglyLinkList.Node;
/**
 * @author Aswin
 *
 */
public class Stack2Min {
	Node<Integer> stack, minList, currSNode, currMLNode, topStack, topMinList;
	
	public void push(int data){
		Node<Integer> newNode = new Node<Integer>(data);
		newNode.next = topStack;
		topStack = newNode;
		
		if(topMinList!=null){
			if(data < topMinList.elem){
				Node<Integer> newMin = new Node<Integer>(data);
				newMin.next = topMinList;
				topMinList = newMin;
			}
		}else{
			Node<Integer> newMin = new Node<Integer>(data);
			newMin.next = topMinList;
			topMinList = newMin;
		}
	}
	
	public void pop(){
		if(topStack!=null){
			if(topStack.elem == topMinList.elem){
				topStack = topStack.next;
				topMinList = topMinList.next;
			}
		}
	}
	
	public void showStack(){
		currSNode = topStack;
		System.out.println("Data Stack:");
		while(currSNode!=null){
			System.out.println("|___"+currSNode.elem+"___|");
			currSNode = currSNode.next;
		}
		
		System.out.println("Min value: "+topMinList.elem);
	}
	
	public void showMinList(){
		currMLNode = topMinList;
		System.out.println("Min List:");
		while(currMLNode!=null){
			System.out.println("|___"+currMLNode.elem+"___|");
			currMLNode = currMLNode.next;
		}
	}
}
