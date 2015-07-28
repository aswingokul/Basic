/**
 * 
 */
package pkg_BST;

/**
 * @author Aswin
 *
 */
public class BST {

	/**
	 * @param args
	 */
	private static int index;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST bst = new BST();
		BST bst2 = new BST();
		int preOrderArr[] = {30,20,10,25,40,35,50};
		int sorted[] = {10,20,30,30,40,50,60};
//		System.out.println("Constructing the BST from the given PreOrder array");
		TreeNode root = bst.constructBST(preOrderArr);
		System.out.print("Pre Order Traversal: ");
		bst.preOrder(root);
		
		bst.insertKey(root, 34);
		System.out.print("\nIn Order Traversal: ");
		bst.inOrder(root);
		
//		System.out.print("\nPost Order Traversal: ");
//		bst.postOrder(root);
//		
//		System.out.print("Search result for key 40: "+ bst.searchBST(root, 4));
//		bst2.buildBSTSorted(sorted);
		
		TreeNode root2 = bst2.buildBSTSorted(sorted);
		
//		System.out.print("\nIn Order Traversal: ");
//		bst2.inOrder(root);
		
//		System.out.print("\nRemoving 34 from the BST");
//		root = bst.removeNode(40, root);
//		
//		System.out.print("\nPre Order Traversal: ");
//		bst.preOrder(root);
//		System.out.println("\nMinimum Element: "+bst.getMinNode(root));
		
		System.out.println("\nIs this a BST ? "+ bst2.checkBST(root2));
		
//		System.out.println("LCA of node 34 and 50: "+bst.lowestCommonAncestor(root,34,50).data);
//		
//		System.out.println("Depth of left subtree:"+ bst.depth(root.left));
//		System.out.print("2nd smallest Element: "); 
//		bst.kthSmallest(root, 5);
//		
//		System.out.print("5 th smallest Element: "+ bst.kthSmallest2(root, 5).data);
		
//		System.out.print("Nodes between 20 and 40 are: ");
//		bst.printRange(root, 10, 15);
		
	}
	
	/*==========================================================
	 * Construct BST from the given PreOrder array Wrapper
	 *==========================================================
	 */
	public TreeNode constructBST(int[] nums){
		if(nums.length == 0)
			return null;
		
		return constructBST(nums,nums.length,Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	/*==========================================================
	 * Construct BST from the given PreOrder array Recursively
	 *==========================================================
	 */
	private TreeNode constructBST(int[] nums, int len, int min, int max){
		if(index > len)
			return null;
		TreeNode root = null;
		int currNode = nums[index];
		if(currNode > min && currNode < max){
			root = new TreeNode(currNode);
			index++;
			
			if(index < len){
				root.left = constructBST(nums,len,min,currNode);
			}
			
			if(index < len){
				root.right = constructBST(nums,len,currNode,max);
			}
		}
		
		return root;
	}
	
	/*=================================
	 * PreOrder Traversal - Recursive
	 *=================================
	 */
	void preOrder(TreeNode root){
		if(root == null)
			return;
		
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	/*=================================
	 * InOrder Traversal - Recursive
	 *=================================
	 */
	void inOrder(TreeNode root){
		if(root == null)
			return;
		
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}
	
	/*=================================
	 * PostOrder Traversal - Recursive
	 *=================================
	 */
	void postOrder(TreeNode root){
		if(root == null)
			return;
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
	
	boolean searchBST(TreeNode root,int key){
		if(root == null)
			return false;
		
		if(root.data == key)
			return true;
		
		if(searchBST(root.left,key) || searchBST(root.right,key))
			return true;
		else
			return false;
	}
	
	/*====================================================
	 * Builds BST from the given Sorted array Wrapper
	 *====================================================
	 */
	public TreeNode buildBSTSorted(int[] arr){
		if(arr.length == 0)
			return null;
		
		return buildBSTSorted(arr,0,arr.length-1);
	}
	
	/*====================================================
	 * Builds BST from the given Sorted array Recursively
	 *====================================================
	 */
	private TreeNode buildBSTSorted(int[] arr, int start, int end){
		if(start > end)
			return null;
		
		int mid = (start+end)/2;
		TreeNode root = new TreeNode(arr[mid]);
		
		root.left = buildBSTSorted(arr,start, mid-1);
		root.right = buildBSTSorted(arr,mid+1,end);
		
		return root;
	}
	
	/*=========================================================
	 * Inserts the given key into the BST - Non self balancing
	 *=========================================================
	 */
	TreeNode insertKey(TreeNode root, int key){
		if(root == null)
			return new TreeNode(key);
		
		if(key > root.data)
			root.right = insertKey(root.right, key);
		else if(key < root.data)
			root.left = insertKey(root.left, key);
		
		return root;
	}
	/*============================================
	 * Delete a given node in the BST Wrapper
	 *============================================
	 */
	TreeNode removeNode(int key, TreeNode root){
		if(root == null)
			return null;
		
		TreeNode aux = new TreeNode(0);
		aux.left = root;
		if(removeNode(key,aux,root)){
			System.out.println("\nSuccessfully deleted "+ key);
			return aux.left;
		}else{
			System.out.println("\nThere's no node in the BST with key "+key);
			return root;
		}
	}
	
	/*============================================
	 * Delete a given node in the BST Recursively
	 *============================================
	 */
	boolean removeNode(int key, TreeNode parent, TreeNode currNode){
		if(currNode!=null){
			if(currNode.data == key){
				if(currNode.left == null && currNode.right == null){
					if(parent.left == currNode)
						parent.left = null;
					else
						parent.right = null;					
					return true;
				}else if(currNode.left != null && currNode.right == null){
					if(parent.left == currNode)
						parent.left = currNode.left;
					else
						parent.right = currNode.left;
					return true;
				}else if(currNode.left == null && currNode.right != null){
					if(parent.left == currNode)
						parent.left = currNode.right;
					else
						parent.right = currNode.right;
					return true;
				}else{
					int minNode = getMinNode(currNode.right);
					currNode.data = minNode;
					return removeNode(minNode,currNode, currNode.right);
				}
				
			}else if(currNode.data < key){
				return removeNode(key,currNode,currNode.right);
			}else if(currNode.data > key)
				return removeNode(key,currNode, currNode.left);
		}
		
		return false;
	}
	
	/*============================================
	 * Returns minimum node in the BST Recursively
	 *============================================
	 */
	int getMinNode(TreeNode root){		
		if(root.left == null)
			return root.data;
		return getMinNode(root.left);
	}
	
	/*============================================================
	 * Returns whether a Binary tree is valid BST or not - Wrapper
	 *============================================================
	 */
	boolean checkBST(TreeNode root){
		return checkBST(root,Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	/*============================================================
	 * Returns whether a Binary tree is valid BST or not - Recursively
	 *============================================================
	 */
	boolean checkBST(TreeNode root, int min, int max){
		if(root == null)
			return true;
		
		if(root.data < min || root.data > max)
			return false;
		
		return (checkBST(root.left,min,root.data) && checkBST(root.right,root.data, max));
	}
	
	/*==========================================================
	 * Returns the Lowest Common Ancestor for the given 2 nodes
	 *==========================================================
	 */
	TreeNode lowestCommonAncestor(TreeNode root, int node1, int node2){
		if(root == null)
			return null;
		
		if(Math.max(node1, node2) < root.data)
			return lowestCommonAncestor(root.left,node1,node2);
		else if(Math.min(node1, node2) > root.data)
			return lowestCommonAncestor(root.right,node1,node2);
		else
			return root;
		
	}
	
	void printSorted(int[] nums){
		printSorted(nums, 0);
	}
	
	void printSorted(int nums[],int start){
		if(start > nums.length)
			return;
		
		printSorted(nums, start*2+1);
		System.out.print(nums[start]+" ");
		printSorted(nums,start*2+2);
	}
	
	/*===================================
	 * Returns the height of the tree
	 *===================================
	 */
	int depth(TreeNode root){
		if(root != null){
			return(Math.max(depth(root.left)+1, depth(root.right)+1));
		}
		return 0;
	}
	
	/*===========================================
	 * Returns number of nodes in the BST
	 *===========================================
	 */
	int size(TreeNode root){
		if(root != null){
			return size(root.left)+1+size(root.right);
		}
		return 0;
	}
	/*=============================================
	 * Returns the Kth smallest element in the BST
	 *=============================================
	 */
	static int count = 0;
	void kthSmallest(TreeNode root, int k){
		if(root!=null){
			kthSmallest(root.left,k);
			count++;
			if(count == k)
				System.out.println(root.data);
			kthSmallest(root.right,k);
		}
	}
	
	TreeNode kthSmallest2(TreeNode root, int k){
		if(root != null){
			kthSmallest2(root.left, k);
			--k;
			if( k == 0)
				return root;
			kthSmallest2(root.right,k);
		}
		return null;
		
	}
	
	void printRange(TreeNode root, int lo, int hi){
		if(root != null){
			if( root.data > lo)
				printRange(root.left,lo,hi);
			if(root.data >= lo && root.data <= hi)
				System.out.print(root.data +" ");
			if(root.data < hi)
				printRange(root.right,lo,hi);
		}
	}
}
