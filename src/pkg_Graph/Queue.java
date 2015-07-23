/**
 * 
 */
package pkg_Graph;

/**
 * @author Aswin
 *
 */
public class Queue {
	GraphNode first,last;
	
	public void enqueue(GraphNode n){
		if(first == null){
			first = n;
			last = first;
		}else{
			last.next = n;
			last = last.next;
		}
	}
	
	public GraphNode dequeue(){
		if(first == null)
			return null;
		else{
			GraphNode tmp = new GraphNode(first.val,first.neighbors);
			first = tmp.next;
			return tmp;
		}
	}
}
