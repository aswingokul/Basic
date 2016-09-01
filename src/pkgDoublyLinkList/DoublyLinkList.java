/**
 * 
 */
package pkgDoublyLinkList;



/**
 * @author Aswin
 *
 */
public class DoublyLinkList<T extends Comparable<T>> {
	Node<T> head;
	
	public void insertNode(T data){
		if(head == null){
			head = new Node<T>(data);
			head.next = null;
			head.previous = null;
		}else{
			Node<T> newNode = new Node<T>(data);
			head.previous = newNode;
			newNode.next = head;			
			head = newNode;
		}
	}
	
	public void showList(){
		Node<T> currNode = head;
		while(currNode!=null){
			currNode.printNode();
			currNode = currNode.next;
		}
		if(currNode == null)
			System.out.println("NULL");
	}
	
	public void printAdjacent(T key){
		Node<T> currNode = head;
		boolean flag = false;
		System.out.print("Adjacent nodes of " + key + ": ");
		
			while(currNode.data != key){
				if(currNode != null)
					currNode = currNode.next;				
			}
			if(currNode.data == key)
				flag = true;
			else 
				flag = false;
			
			if(!flag){
				System.out.println("No such node in the list");
			}else{
				currNode.printNode(currNode.previous);
				currNode.printNode(currNode.next);
			}
			
		
	}
	
	public void reverseList(){
		Node<T> prevNode = null;
		Node<T> currNode = head;
		Node<T> nextNode;
		
		while(currNode != null){
			nextNode = currNode.next;
			prevNode = currNode.previous;
			currNode.next = prevNode;
			currNode.previous = nextNode;
			prevNode = currNode;
			currNode = nextNode;
		}
		head = prevNode;
	}
	
	public DoublyLinkList(){
		head = null;
	}
	
	
	public void deleteNode(T key){
		Node<T> currNode = head;
		
		boolean flag = false;
		
		while(currNode != null){
			if(currNode.data != key)
				currNode = currNode.next;
			else{
				flag = true;
				break;
			}
				
		}
		if(!flag){
			System.out.println("No such node in the list");
		}else{
			currNode.previous.next = currNode.next;
			currNode.next.previous = currNode.previous;
		}		
	}
	
	public void swapkthnode(int k){		
		Node<T> node1 = head, node2 = head, runner = head;
		int count1 = 1;
		T temp;
		while(node1 != null){
			if(count1 != k){
				node1 = node1.next;
				count1++;
//				System.out.println("node1: "+ node1.data);
//				System.out.println("count: "+ count1);
			}else
				break;
		}
//		System.out.println("node1: "+ node1.data);
		count1 = 1;
		while(count1 != k){
			runner = runner.next;
			count1++;
		}
		
		while(runner.next!= null){
			runner = runner.next;
			node2 = node2.next;
//			System.out.println("node2: "+ node2.data);
//			System.out.println("runner: "+ runner.data);
		}
//		System.out.println("node2: "+ node2.data);
		temp = node1.data;
		node1.data = node2.data;
		node2.data = temp;
//		System.out.println("node1: "+ node1.data);
//		System.out.println("node2: "+ node2.data);
		this.showList();
	}
	
	public Node<T> getTail(){
		Node<T> runner = head;
		while(runner.next != null){
			runner = runner.next;
		}
		return runner;
	}
	
	public Node<T> getkthNode(int k){
		Node<T> runner = head;
		int count= 0;
		
		while(runner != null){
			if(count != k){
				runner = runner.next;
				count++;
			}
			else 
				break;			
		}
		return runner;
	}
	
	public Node<T> getkthFromTail(int k){
		Node<T> first = head;
		Node<T> last = head;
		int count = 0;
		while(first.next != null){
			if(count != k){
				first = first.next;
				count++;				
			}
			else
				break;
		}
		
		while(first != null){
			last = last.next;
			first = first.next;
		}
		
		return last;
	}

}
