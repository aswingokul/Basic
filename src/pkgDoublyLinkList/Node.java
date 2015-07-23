/**
 * 
 */
package pkgDoublyLinkList;

/**
 * @author Aswin
 *
 */
public class Node<T> {
	
	T data;
	Node<T> previous;
	Node<T> next;
	
	public Node(){
		data = null;
		previous = null;
		next = null;
	}
	
	public Node(T elem){
		data = elem;
		previous = null;
		next = null;
	}
	
	public void printNode(){
		System.out.print(data+"<-->");
	}
	
	public void printNode(Node<T> node){
		if(node != null)
			System.out.print(node.data + " ");
		else
			System.out.print("NULL ");
	}
	
	public void setPrevious(Node<T> node){
		this.previous = node;
	}
	
	public Node<T> getPrevious(){
		return this.previous;
	}
	
	public void setNext(Node<T> node){
		this.next = node;
	}
	
	public Node<T> getNext(){
		return this.next;
	}
	
	public T getData(){
		return this.data;
	}
	
	public void setData(T val){
		this.data = val;
	}

}
