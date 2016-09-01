/**
 * 
 */
package pkg_Graph;

/**
 * @author Aswin
 *
 */
public class GraphTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphNode n1 = new GraphNode(1);
		GraphNode n2 = new GraphNode(2);
		GraphNode n3 = new GraphNode(3);
		GraphNode n4 = new GraphNode(4);
		GraphNode n5 = new GraphNode(5);
		GraphNode n6 = new GraphNode(6);
		
		n1.neighbors = new GraphNode[]{n2, n4};
		n2.neighbors = new GraphNode[]{n1,n3};
		n3.neighbors = new GraphNode[]{n2,n4,n5,n6};
		n4.neighbors = new GraphNode[]{n1,n3};
		n5.neighbors = new GraphNode[]{n3,n6};
		n6.neighbors = new GraphNode[]{n3,n5};
		
		breadthFirst(n1,6);
	}
	
	public static void breadthFirst(GraphNode start, int target){
		Queue q = new Queue();
		if(start.val == target){
			System.out.println("Found in root");
			return;
		}
		
		q.enqueue(start);
		start.visited = true;
		
		while(q.first !=null){
			GraphNode tmp = q.dequeue();
			for(GraphNode n : tmp.neighbors){
				if(!n.visited){
					System.out.print(n.toString()+" ");
					n.visited = true;
//					if(n.val == target)
//						System.out.println(n.toString());
					q.enqueue(n);
				}
			}
		}
	
	}

}
