/**
 * 
 */
package pkgDoublyLinkList;

/**
 * @author Aswin
 *
 */
public class DoublyLinkListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkList<Integer> list = new DoublyLinkList<Integer>();
		list.insertNode(1);
		list.insertNode(2);
		list.insertNode(3);
		list.insertNode(4);
		list.insertNode(5);
		System.out.print("Original List: ");
		list.showList();
		
//		System.out.print("After Reversal: ");
//		list.reverseList();
//		list.showList();
//		list.deleteNode(3);
//		System.out.print("After deletion: ");
//		list.showList();
		
//		System.out.println("2rd Node from tail: "+ list.getkthFromTail(2).data);
		list.swapkthnode(2);

	}

}
