/**
 * 
 */
package pkgBasic;

/**
 * @author Aswin
 *
 */
public class Node {
	int elem;
	Node next = null;
	
	public Node(int elem){
		this.elem = elem;
	}
	
	public void printNode(){
		System.out.print(elem+"-->");
	}
}

