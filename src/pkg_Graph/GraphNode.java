/**
 * 
 */
package pkg_Graph;

/**
 * @author Aswin
 *
 */
public class GraphNode {
	int val;
	GraphNode[] neighbors;
	boolean visited;
	GraphNode next;
	
	public GraphNode(int x){
		val = x;
	}
	
	public GraphNode(int x, GraphNode[] nb){
		val = x;
		neighbors = nb;
	}
	
	public String toString(){
		return String.valueOf(val);
	}

}
