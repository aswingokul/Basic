<<<<<<< HEAD
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
=======
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
>>>>>>> e1183d48c51150798e555e5c155c1abae0f1ee10
