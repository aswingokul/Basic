/**
 * 
 */
package pkg_SinglyLinkList;


/**
 * @author Aswin
 *
 */
public class Node<T> {
	public T elem;
	public Node<T> next = null;
	
	public Node(T data){
		elem = data;
	}
	
	public Node(){
		elem = null;
	}
	
	public void printNode(){
		System.out.print(elem+"-->");
	}
	


}
