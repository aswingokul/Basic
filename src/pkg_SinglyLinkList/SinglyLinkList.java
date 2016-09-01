/**
 * 
 */
package pkg_SinglyLinkList;

import java.util.HashMap;



/**
 * @author Aswin
 *
 */
public class SinglyLinkList<T extends Comparable<T>> {
	Node<T> currNode, newNode;
	Node<T> nxtNode;
	Node<T> head = null;
	Node<T> loopNode = null;
	/**
	 * 
	 */
	
	/*
	 * Parametrised Constructor
	 * This initializes the list with the given start node
	 */
	SinglyLinkList(Node<T> start){
		head = start;
	}
	
	/*
	 * Default Constructor
	 * Initializes an empty list
	 */
	public SinglyLinkList() {
		// TODO Auto-generated constructor stub
		head =null;
	}
	
	/*
	 * Inserts a new node with the given data at the beginning of the list
	 */
	public void insertNode(T data){
		newNode = new Node<T>(data);
		newNode.next = head;
		head = newNode;
		
	}
	
	/*
	 * Deletes the 1st node at the beginning of the list
	 */
	public void deleteNode(){
		currNode = head;
		if(head!=null){
			head = currNode.next;
			currNode = head;	
		}
				
	}
	
	/*
	 * Returns the size of the list
	 */
	public int size(){
		int count=0;
		currNode =head;
		while(currNode!=null){
			count++;
			currNode = currNode.next;
		}
		return count;
	}
	
	public int recSize(){
		return recSize(head);
	}
	
	public int recSize(Node<T> head){
		if(head==null)
			return 0;
		
		return recSize(head.next)+1;
	}
	
	/*
	 * Removes any duplicate elements in the list
	 */
	public void removeDuplicate(){
		HashMap<Integer,Boolean> buffer = new HashMap<Integer,Boolean>();
		Node<T> prev = head;
		currNode = prev.next;
		
		//Node nextNode = null;
		while(currNode!=null){
			if(prev == head){
				buffer.put((Integer)prev.elem, true);
			}
			if(buffer.containsKey(currNode.elem)){
				prev.next = currNode.next;				
			}
			else{
				buffer.put((Integer)currNode.elem, true);
				prev = currNode;				
			}
			currNode = currNode.next;
		}		
	}
	
	/*
	 * Returns the no. of times the given data occurs in the list
	 */
	public int countOf(T data){
		int count=0;
		currNode = head;
		while(currNode!=null){
			if(currNode.elem==data)
				count++;
			currNode = currNode.next;
		}
		return count;
	}
	
	public int countOfRec(T data){		
		return countOf(head,data,0);
	}
	
	public int countOf(Node<T> node,T data, int count){
		if(node == null)
			return 0;
		
		int i = countOf(node.next,data,count);
		if(node.elem.equals(data)){
			++count;
			return count+i;
		}			
		else
			return i;
	}
	
	/*
	 * Reverses a list
	 * Note: This actually reverses the list, not just print the list in the reverse order
	 */
	public void reverseList(){
		Node<T> prev = null;
		currNode = head;
		Node<T> nextNode;
		while(currNode!=null){
			nextNode = currNode.next;
			currNode.next = prev;
			prev = currNode;
			currNode = nextNode;
		}
		head = prev;
	}
	/*
	 * Driver function for reversing list using recursion
	 * This function is called by the SinglyLinkListDemo class
	 */
	public void reverseListrec(){
		reverseListrec(head);
	}
	/*
	 * Actual function that reverses a list using recursion
	 */
	public void reverseListrec(Node<T> node){
		Node<T> first;
		Node<T> rest;
		
		if(node==null)
			return;
		first = node;
		rest = first.next;
		
		if(rest==null)
			return;
		reverseListrec(rest);
		//first.next.next = first;
		rest.next = first;
		first.next = null;
		head = rest;
		
	}
	
	void reverseListRec2(){
		reverseListRec2(head,null);
	}
	
	
	void reverseListRec2(Node<T> curr,Node<T> prev){
		if(curr.next == null){
			head = curr;
			curr.next = prev;
			return;
		}
		
		Node<T> next = curr.next;
		curr.next = prev;
		reverseListRec2(next,curr);
	}
	/*
	 * Reverse k list nodes
	 * 
	 */
	public void revGroupKNodes(int k){
		Node<T> ans = revGroupKNodes(head, k);
		Node<T> n = ans;
		
		while(n!=null){
			System.out.print(n.elem+" ");
			n=n.next;
		}
		
	}
	
	public Node<T> revGroupKNodes(Node<T> head, int k){
		currNode = head;
		Node<T> prev =null;
		int count=0;
		
		while(currNode!=null && count<k){
			nxtNode =currNode.next;
			currNode.next = prev;
			prev =currNode;
			currNode = nxtNode;
			count++;
		}
		
		System.out.println("prev: "+((prev==null)?0:prev.elem));
		System.out.println("currNode: "+((currNode==null)?0:currNode.elem));
		System.out.println("nxtNode: "+((nxtNode==null)?0:nxtNode.elem));
		System.out.println("head: "+((head==null)?0:head.elem));
		System.out.println("head.next: "+((head.next==null)?0:head.next.elem));
		System.out.println("--------------------------------");
		
		if(nxtNode!=null)
			head.next = revGroupKNodes(nxtNode, k);
		
		return prev;
	}
	
	/*
	 * Driver function for detecting a loop in the list
	 * This function is called by the SinglyLinkListDemo class
	 */
	public void detectLoop(){
		detectLoop(head);
	}
	
	/*
	 * Actual function for detecting a loop in the list
	 */
	public void detectLoop(Node<T> ref){
		Node<T> slow, fast;
		slow = fast = head;
		boolean flag = false;
		while(fast.next!=null && slow!=null){
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow){
				returnLoopNode(slow);
				break;
			}
		}
		if(flag)
			System.out.println("Loop detected");
		else
			System.out.println("No Loop detected");		
	}
	
	/*
	 * This function is used to create a loop from tail to the 2nd node from the head
	 */
	public void createLoop(){
		loopNode = head.next.next.next;
		Node<T> tail = head;
		while(tail.next!=null){
			tail = tail.next;
		}
		tail.next = loopNode;
	}
	
	
	public void returnLoopNode(Node<T> headref){
		Node<T> p1 = headref;
		Node<T> p2 = headref;
		int count = 1;
		while(p1.next != p2){
			p1 = p1.next;
			count++;
		}
		
		p1 = head;
		p2 = head;
		for(int i=0; i<count; i++){
			p2 = p2.next;
		}
		
		System.out.println(count+" nodes from head: "+p2.elem);
		
		while(p2 != p1){
			p1 = p1.next;
			p2 = p2.next;
		}
		System.out.println("p1 meets p2 at: "+p2.elem);
		p2 = p2.next;
		
		while(p2.next != p1){
			p2 = p2.next;
		}
		
		p2.next = null;
		
	}
	
	/*
	 * 2nd Method for removing duplicate from a list	
	 */
	public void removeDuplicate2(){
		Node<T> prev = head;
		currNode = prev.next;
		while(currNode!=null){
			Node<T> runner = head;
			while(runner!= currNode){
				if(runner.elem==currNode.elem){
					Node<T> temp = currNode.next;
					prev.next = temp;
					currNode = temp;
					break;
				}
				runner = runner.next;
			}
			if(runner == currNode){
				currNode = currNode.next;
			}
		}	
	}
	
	/*
	 * Method to delete a node with the given data
	 */
	public boolean deleteNode(T num){
		Node<T> n = this.searchNode(num);
		if(n.next!=null){
			n.elem = n.next.elem;
			n = n.next.next;
			return true;
		}
		return false;
	}
	
	public void deleteNode2(T num){
		if(head.elem.equals(num))
			head = head.next;
		
		Node<T> temp  = head;
		Node<T> prev = null;
		
		while(temp != null && !temp.elem.equals(num)){
			prev = temp; 
			temp = temp.next;			
		}
		
		if(temp == null)
			return;
		
		prev.next = temp.next;
	}
	
	/*
	 * Method to print the entire list
	 */
	public void showList(){
		currNode = head;
		//System.out.print("List: ");
		while(currNode!=null){
			currNode.printNode();
			currNode=currNode.next;
		}
		if(currNode==null){
			System.out.println("NULL");
		}
	}
	
	/*
	 * Method to search for the given item in the list
	 */
	public Node<T> searchNode(T item){
		currNode = head;
		while(currNode!=null){
			if(currNode.elem == item)
				return currNode;
			else 
				currNode = currNode.next;
			
		}
		return null;
	}
	
	public boolean searchNode(Node<T> head,T item){
		if(head == null)
			return false;
		
		if(head.elem.equals(item))
			return true;
		
		return searchNode(head.next,item);
		
	}
	/*
	public void getHeadNode(){
		this.head = head;
	}*/
	
	/*
	public void showHeadNode(){
		System.out.println(this.head.elem);
	}*/
	
	public Node<T> moveNextNode(){
		
		this.currNode = currNode.next;
		return currNode;
	}
	
	/*
	public void insertNodeRev(T data){
		
		newNode = new Node<T>(data);
		this.currNode.next = newNode;
		
	}*/
	
	/*
	public void showCurrNode(){
		System.out.println(currNode.elem);
	}*/
	
	public T currDataElem(){
		if(currNode!= null)
			return currNode.elem;
		else {
			currNode = head;
			return currNode.elem; 
		}
	}
	
	public void findNum(int n){
		Node<T> curr, last;
		int count = 0;
		curr = head;
		last = head;
		while(count!=n){
			last = last.next;
			++count;
		}
		
		while(last!=null){
			curr = curr.next;
			last = last.next;
		}
		
		System.out.println(n+"th element from the last is "+curr.elem);
	}
	
	/*
	 * Returns the middle node of the list
	 */
	public Node<T> getMiddleElem(){
		Node<T> fast,slow;
		fast = head;
		slow = head;
		
			while(fast!=null && fast.next!=null){
				fast = fast.next.next;
				slow = slow.next;
			}
		
		//System.out.println("The middle element is "+slow.elem);
		return slow;
	}
	
	/*
	 * Checks whether the given list is a palindrome or not
	 */
	public void palindrome(){
		Node<T> midelem = getMiddleElem();
		boolean flag =false;
		Node<T> list2 = midelem.next;
		midelem.next = null;
		SinglyLinkList<T> secondhalf = new SinglyLinkList<T>(list2);
		System.out.println("2nd half before reversal");
		secondhalf.showList();
		secondhalf.reverseList();
		System.out.println("1st half");
		this.showList();
		System.out.println("2nd half after reversal");
		secondhalf.showList();
		Node<T> list1runner = this.head;
		Node<T> list2runner = secondhalf.head;
		while(list1runner!=midelem && list2runner!=null){
			if(list1runner.elem == list2runner.elem){
				list1runner = list1runner.next;
				list2runner = list2runner.next;
				flag = true;
			}else
				flag =false;
			
		}
		
		if(flag)
			System.out.println("The list is a palindrome");
		else
			System.out.println("The list is NOT a palindrome");
		
		secondhalf.reverseList();
		secondhalf.showList();
		midelem.next = list2;
		this.showList();
	}
	
	/*
	 * Driver function for printing the list in the reverse order
	 * This function is called by the SinglyLinkListDemo class
	 */			
	public void printlistreverse(){
		printlistreverse(head);
	}
	
	/*
	 * Prints the list in the reverse order
	 * Note: This method doesn't change the order, it just prints
	 */
	public void printlistreverse(Node<T> node){
		Node<T> runner = node;
		//System.out.println("List in reverse order:");
		if(runner.next!=null){
			printlistreverse(runner.next);			
		}		
		runner.printNode();
		if(runner==head){
			System.out.print("NULL");
		}
		
	}
	
	/*
	 * Inserts new element to the list preserving its sorted order
	 */
	public void sortedInsert(T data){
		newNode = new Node<T>(data);
		{
			if(head==null){
				this.insertNode(data);
			}
			if(head!=null && (head.elem.compareTo(newNode.elem)>0)){
				newNode.next = head;
				head = newNode;
			}
			else if(head.elem.compareTo(newNode.elem)<0){
				Node<T> listrun = head;
				while(listrun.next!=null && (listrun.next.elem.compareTo(newNode.elem)<0)){
					listrun = listrun.next;
				}
				newNode.next = listrun.next;
				listrun.next = newNode; 
			}			
		}
	}
	
	/*
	 * Removes Duplicate elements from a sorted list
	 */
	public void removeDuplicateSortedList(){
		currNode = head;
		nxtNode = currNode.next;
		if(head!=null){
			while(nxtNode!=null){
				if(currNode.elem.equals(nxtNode.elem)){
					nxtNode = nxtNode.next;
					currNode.next = nxtNode;
				}
				nxtNode = nxtNode.next;
				currNode = currNode.next;
			}
		}else
			System.out.println("List is empty");		
	}
	
	/*
	 * Method 1 to swap pairwise elements
	 * Example 1: Input - 1->2->3->4->5, Output - 2->1->4->3->5
	 * Example 2: Input - 1->2->3->4->5->6, Output - 2->1->4->3->6->5
	 */
	public void swappairwise(){
		Node<T> lelem = head;
		Node<T> relem = head.next;
		T temp;
		
		while(relem!=null && lelem!=null){
			temp = lelem.elem;
			lelem.elem = relem.elem;
			relem.elem = temp;
			if(relem.next!=null){
				lelem = relem.next;
				relem = lelem.next;
			}else
				relem =null;
			
		}		
	}
	/*
	 * Method 2 (using recursion) to swap pairwise elements
	 * Example 1: Input - 1->2->3->4->5, Output - 2->1->4->3->5
	 * Example 2: Input - 1->2->3->4->5->6, Output - 2->1->4->3->6->5
	 */
	public void swappairwiserec(){
		swappairwiserec(head);
	}
	
	public void swappairwiserec(Node<T> node){
		Node<T> lelem = node;
		Node<T> relem = node.next;
		T temp;
		if(node!=null && node.next!=null){
			temp = lelem.elem;
			lelem.elem = relem.elem;
			relem.elem = temp;
			swappairwiserec(lelem.next.next);
		}		
	}
	
	/*
	 * Method to move the tail element to the beginning of the list
	 */
	public void moveTailToFirst(){
		Node<T> runner = head;
		Node<T> tail = head.next;
		while(tail.next!=null){
			tail = tail.next;
			runner = runner.next;
		}
		runner.next = null;
		tail.next = head;
		head = tail;
	}
	
	/*
	 * Method 1 to delete the alternate elements in the list
	 */
	public void deleteAlternateNodes(){
		currNode = head;
		while(currNode.next!=null){
			currNode.next = currNode.next.next;
			if(currNode.next!=null)
				currNode = currNode.next;
			else
				break;
		}
	}
	
	/*
	 * Method 2 (using recursion) to delete the alternate elements in the list
	 */
	public void deleteAltNodesRec(){
		deleteAltNodesRec(head);
	}
	
	public void deleteAltNodesRec(Node<T> node){
		currNode = node;
		
		if(currNode.next!=null && currNode!=null){			
			if(currNode.next.next!=null){
				currNode.next = currNode.next.next;
				deleteAltNodesRec(currNode.next);
			}else
				currNode.next = null;			
		}
	}
	
	public void splitList(){
		Node<T> runner = head;
		//Node<T> runner2 = head.next;
		SinglyLinkList<T> sublist1 = new SinglyLinkList<T>();
		SinglyLinkList<T> sublist2 = new SinglyLinkList<T>();
		while(true){
			sublist1.sortedInsert(runner.elem);
			if(runner.next!=null && runner.next.next!=null)
				runner = runner.next.next;
			else
				break;
		}
		runner = head.next;
		while(true){
			sublist2.sortedInsert(runner.elem);
			if(runner.next!=null && runner.next.next!=null)
				runner = runner.next.next;
			else
				break;			
		}
		
		System.out.print("\nSub List 1: ");
		sublist1.showList();
		System.out.print("\nSub List 2: ");
		sublist2.showList();
	}
	
	public void mergelist(SinglyLinkList<T> list1, SinglyLinkList<T> list2){
		SinglyLinkList<T> result = new SinglyLinkList<T>();
		Node<T> runner1 = list1.head;
		Node<T> runner2 = list2.head;
		
		while(true){
			if(runner1==null){
				while(runner2!=null){
					result.insertNode(runner2.elem);
					runner2 = runner2.next;
				}
			}else if(runner2 == null){
				while(runner1!=null){
					result.insertNode(runner1.elem);
					runner1 = runner1.next;
				}
			}else{
				while(runner1!=null && runner2!=null){
					if(runner1.elem.compareTo(runner2.elem)<0){
						result.insertNode(runner1.elem);
						runner1 = runner1.next;
					}else if(runner1.elem.compareTo(runner2.elem)>0){
						result.insertNode(runner2.elem);
						runner2 = runner2.next;
					}
				}
				if(runner1!=null){
					while(runner1!=null){
						result.insertNode(runner1.elem);
						runner1 = runner1.next;
					}
				}
				if(runner2!=null){
					while(runner2!=null){
						result.insertNode(runner2.elem);
						runner2 = runner2.next;
					}
				}
				break;
			}
				
		}
		System.out.print("Final list is: ");
		result.reverseList();
		result.showList();
	}
	
	
	
	
	public void reverseList(int num){
		int count=1;
		Node<T> runner = head;
		Node<T> prev = null;
		Node<T> curr = head;
		Node<T> nxt ;
		Node<T> temp;
		if(num>this.size() || num<0){
			System.out.println("Num must be between 0 and "+this.size());
			return;
		}			
		while(count<num && runner!=null){
			runner = runner.next;
			count++;
		}
		Node<T> joinNode = runner.next;
		runner.next = null;
		while(curr!=null){
			nxt = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nxt;			
		}
		temp = prev;
		head = prev;
		while(temp.next!=null){
			temp = temp.next;
		}
		temp.next = joinNode;
	}
	
	public void mergeSort(){
		mergeSort(head);
	}
	
	public void printList(Node<T> head){
		while(head!=null){
			System.out.print(head.elem + "-->");
			head = head.next;
		}
		if(head==null){
			System.out.print("NULL");
		}
	}
	
	public Node<T> mergeSort(Node<T> headref){
		//Node<T> start = headref;
		//printList(headref);
		//System.out.println();
		if(headref==null || headref.next == null){
			return headref;
		}
		Node<T> head1 = headref;
		Node<T> mid = getMiddleElem(headref);
		System.out.println("mergeSort(Node): Middle Element: "+mid.elem);
		Node<T> head2 = mid.next;
		mid.next = null;
		
		return sortedMerge(mergeSort(head1),mergeSort(head2));
	}
	
	public Node<T> sortedMerge(Node<T> list1, Node<T> list2){
		Node<T> dummyHead, cnode;
		dummyHead = new Node<T>();
		cnode = dummyHead;		
		while(list1!=null && list2!=null){
			if(list1.elem.compareTo(list2.elem)<=0){
				cnode.next = list1;
				list1 = list1.next;
			}else{
				cnode.next = list2;
				list2 = list2.next;
			}
			cnode = cnode.next;
		}
		cnode.next = (list1 ==null)?list2:list1;
		return dummyHead.next;
	}
	
	/*
	 * Returns the middle node of the list
	 */
	public Node<T> getMiddleElem(Node<T> start){
		Node<T> fast,slow;
		fast = start;
		slow = start;
		
			while(fast!=null && fast.next!=null){
				fast = fast.next.next;
				slow = slow.next;
			}
		
		//System.out.println("The middle element is "+slow.elem);
		return slow;
	}
	
	public Node<T> getTailptr(){
		Node<T> tail = head;
		if(head==null)
			return null;
		else if(head.next==null)
			return tail;
		else{
			while(tail.next!=null){
				tail = tail.next;
			}
		}
		return tail;
	}
	
	public void insertAtTail(T data){
		Node<T> newNode = new Node<T>(data);
		Node<T> tail = this.getTailptr();
		if(tail==null && head==null){
			tail = newNode;
			tail.next = null;
			head = newNode;
		}else {
			tail.next = newNode;
			newNode.next = null;
		}
		
	}
		
	public static SinglyLinkList<Integer> sumOfLists(SinglyLinkList<Integer> list1, SinglyLinkList<Integer> list2){
		SinglyLinkList<Integer> result = new SinglyLinkList<Integer>();
		Node<Integer> runner1 = list1.head;		
		Node<Integer> runner2 = list2.head;
		int sum=0, carry=0;
		while(runner1!=null || runner2!=null){
			sum = carry+((runner1!=null)?runner1.elem:0)+((runner2!=null)?runner2.elem:0);
			if(sum>=10)
				carry = 1;
			else
				carry = 0;
			result.insertAtTail((sum%10));
			if(runner1!=null)
				runner1 = runner1.next;
			if(runner2!=null)
				runner2 = runner2.next;
			
		}
		if(carry==1){
			result.insertAtTail(carry);
		}
		return result;
		
	}
	
	public static SinglyLinkList<Integer> sumOfListRev(SinglyLinkList<Integer> list1, SinglyLinkList<Integer> list2){
		SinglyLinkList<Integer> result = new SinglyLinkList<Integer>();
		
		list1.reverseList();
		list2.reverseList();
		int sum=0, carry=0;
		Node<Integer> runner1 = list1.head;
		Node<Integer> runner2 = list2.head;
		System.out.println("List1 head:"+runner1.elem);
		System.out.println("List2 head:"+runner2.elem);
		
		while(runner1!=null||runner2!=null){
			sum = carry+((runner1!=null)?runner1.elem:0)+((runner2!=null)?runner2.elem:0);
			if(sum>=10)
				carry =1;
			else
				carry=0;
			result.insertNode((sum%10));
			if(runner1!=null)
				runner1=runner1.next;
			if(runner2!=null)
				runner2=runner2.next;
		}
		if(carry==1)
			result.insertNode(carry);
		
		return result;
	}
	
	public void kAltRevList(int k){
		Node<T> resHead = kAltRevList(head, k);
		
		Node<T> run = resHead;
		while(run!=null){
			System.out.print(run.elem+" ");
			run = run.next;
		}
	}
	
	public Node<T> kAltRevList(Node<T> head, int k){
		currNode =head;
		int count=0;
		Node<T> prevNode = null;
		while(currNode!=null && count<k){
			nxtNode = currNode.next;
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = nxtNode;
			count++;
		}
		
		if(head!=null)
			head.next = currNode;
		
		count=0;
		while(currNode!=null && count<k-1){
			currNode = currNode.next;
			count++;
		}
		
		if(currNode!=null){
			currNode.next = kAltRevList(currNode.next,k);
		}
		return prevNode;
	}
	
	public void partition(T x){
		if(head == null)
			return;
		
		Node<T> fakeHead1 = new Node<T>();
		Node<T> fakeHead2 = new Node<T>();
		fakeHead1.next = head;
		
		Node<T> p = head;
		Node<T> prev = fakeHead1;
		Node<T> p2 = fakeHead2;
		
		while(p!=null){
			if(p.elem.compareTo(x) < 0 ){
				p = p.next;
				prev = prev.next;
			}else{
				p2.next = p;
				prev.next = p.next;
				
				p = prev.next;
				p2 = p2.next;
			}
		}
		
		p2.next = null;
		prev.next = fakeHead2.next;
		
		printList(fakeHead1.next);
	}
	
	public void removeMatch(T target){
		Node<T> curr, before;
		curr = head;
		before = null;
		
		while(head.elem.equals(target)){
			head = head.next;
		}
		System.out.println("Inside removeMatch");
		this.showList();
		curr = head;
		while(curr!=null){
			System.out.println(curr.elem);
			if(curr.elem.equals(target)){
				if(curr.next != null)
					before.next = curr.next;
				else
					before.next = null;
			}
			before = curr;
			curr = curr.next;
		}		
	}
	
	public void removeNthNodeFromLast(int n){
		if(head == null)
	        return;
	 
	    Node<T> fast = head;
	    Node<T> slow = head;
	 
	    for(int i=0; i<n; i++){
	        fast = fast.next;
	    }
	 
	    //if remove the first node
	    if(fast == null){
	        head = head.next;
	        return;
	    }
	 
	    while(fast.next != null){
	        fast = fast.next;
	        slow = slow.next;
	    }
	 
	    slow.next = slow.next.next;	
	}
	/*
	 * m and n are intervals
	 */
	public void reverseListInterval(int m, int n){
		Node<T> dummy = new Node<T>();
		dummy.next = head;
		Node<T> prev = dummy;
		for(int i = 1; i < m; i++){
			prev = prev.next;
		}
		
		Node<T> tail = prev.next;
		for(int i=0; i<=n-m; i++){
			tail = tail.next;
		}
		
		prev.next = reverseBetween(prev.next, prev, tail);
		
//		Node<T> curr = head;
//		while(curr != null){
//			curr.printNode();
//		}
		
	}
	
	public Node<T> reverseBetween(Node<T> start, Node<T> prev, Node<T> tail){
		Node<T> curr = start;
		Node<T> pre = null;
		
		while(curr != tail){
			Node<T> next = curr.next;
			curr.next = pre;
			pre = curr;
			curr = next;
		}
		
		prev.next = pre;
		start.next = tail;
		
		return prev.next;
	}
	
	
	   
}
