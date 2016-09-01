/**
 * 
 */
package pkgStackQueue;

/**
 * @author Aswin
 *
 */
public class QueueDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q1 = new Queue();
		q1.enqueue(3);
		q1.enqueue(4);
		q1.enqueue(5);
		q1.enqueue(6);
		
		q1.printQueue();
		
		q1.dequeue();
		q1.printQueue();

	}

}
