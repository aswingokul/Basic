/**
 * 
 */
package pkgStackQueue;

/**
 * @author Aswin
 *
 */
public class StackMin {

	/**
	 * @param args
	 */
	StackNode top, currNode;
	
	public void push(int data){
		StackNode newNode = new StackNode(data);
		newNode.next = top;
		if(top!=null){
			if(data > top.min)
				newNode.min = top.min;
			else
				newNode.min = data;			
		}else
			newNode.min = data;
		
		top = newNode;				
	}
	
	public void pop(){
		if(top!= null){
			top = top.next;
		}
	}

	public void showList(){
		currNode = top;
		while(currNode!=null){
			System.out.println("|_"+currNode.elem+",{"+currNode.min+"}_|");
			currNode = currNode.next;
		}
	}


}
