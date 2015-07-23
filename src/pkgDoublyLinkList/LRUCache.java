/**
 * 
 */
package pkgDoublyLinkList;

import java.util.HashMap;

/**
 * @author Aswin
 *
 */
public class LRUCache {
	Node<Integer> head;
	Node<Integer> tail;
	private int cap;
	private int count;
	static HashMap<Integer,Node<Integer>> map;
	
	LRUCache(int size){
		head = null;
		tail = null;		
		cap = size;
		count = 0;
		map = new HashMap<Integer,Node<Integer>>();
	}
	
	int size(){
		return cap;
	}
	
	int filled(){
		return count;
	}
	
	boolean isFull(){
		return (count==cap);
	}
	
	boolean isEmpty(){
		return (tail==null);
	}
	
	void deQueue(){
		if(this.isEmpty()){
			System.out.println("Error: Cache is empty!");
			return;
		}
		if(head==tail){
			head = null;
		}
		
		//Node<Integer> temp = tail;
		tail = tail.previous;
		
		if(tail.previous!=null)
			tail.next = null;
		count--;
	}
	/*-------------------------------------------
	 * Adds the new referenced page to the cache
	 * ------------------------------------------
	 */
	void enQueue(int newdata){
		if(this.isFull()){
			map.put(tail.data, null);
			deQueue();
		}
		
		Node<Integer> newNode = new Node<Integer>(newdata);
		newNode.next = head;
		if(this.isEmpty()){
			head = tail = newNode;
		}else{			
			head.previous = newNode;
			head = newNode;			
		}
		map.put(newdata, newNode);
		count++;			
	}
	
	void ReferencePage(int pageNum){
		if(!map.keySet().contains(pageNum)){
			enQueue(pageNum);			
		}else{
			Node<Integer> temp = map.get(pageNum);
			if(temp!=head && temp!=tail){
				temp.previous.next = temp.next;
				temp.next.previous = temp.previous;				
			}else if(temp==tail){
				temp.previous.next = null;
			}
			temp.next = head;
			temp.previous = null;
			head = temp;
			map.put(pageNum, temp);
		}
	}
	
	void printCache(){
		Node<Integer> run = head;
		while(run!=null){
			run.printNode();
			run=run.next;
		}
		if(run==null)
			System.out.println("NULL");
	}
	
	public static void main(String args[]){
		LRUCache cache = new LRUCache(5);
		System.out.println("cache.isEmpty(): "+cache.isEmpty());
		System.out.println("cache.isFull(): "+ cache.isFull());
		cache.ReferencePage(1);
		cache.printCache();
		cache.ReferencePage(2);
		cache.printCache();
		cache.ReferencePage(3);
		cache.printCache();
		cache.ReferencePage(4);
		cache.printCache();
		cache.ReferencePage(5);
		cache.printCache();
		System.out.println("cache.isEmpty(): "+cache.isEmpty());
		System.out.println("cache.isFull(): "+ cache.isFull());
		cache.ReferencePage(6);
		cache.printCache();
		cache.ReferencePage(3);
		cache.printCache();
	}

}
