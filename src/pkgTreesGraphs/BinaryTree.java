/**
 * 
 */
package pkgTreesGraphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;



/**
 * @author Aswin
 *
 */
public class BinaryTree {
	/*==============
	 * Main Program
	 *==============
	 */
	public static void main(String args[]){
		
		BinaryTree btree = new BinaryTree();
		
		TreeNode root = new TreeNode(5);
		root.leftChild = new TreeNode(4);
		root.rightChild = new TreeNode(7);
		
//		TreeNode rootleft1 = root.leftChild;
//		rootleft1.leftChild = new TreeNode(3);
//		rootleft1.rightChild = new TreeNode(9);
//////		
		TreeNode rootright1 = root.rightChild;
		rootright1.leftChild = new TreeNode(70);
		rootright1.rightChild = new TreeNode(80);
		
//		TreeNode rootleft2 = rootleft1.leftChild;
//		rootleft2.leftChild = new TreeNode(8);
//		
		System.out.print("In Order representation: ");
		btree.inOrderIter(root);
		
		System.out.print("Pre Order representation: ");
		btree.preOrderIter(root);
		
		System.out.print("\nPost Order representation: ");
		btree.postOrderIter(root);
		
//		System.out.println("\n Root To Leaf Paths");
//		btree.rootToLeafPath(root, btree.size(root));
//		System.out.println("\nSize of the tree is "+btree.size(root));
		
		//System.out.println("Is it identical: "+ btree.identicalTree(root1, root2));
		//System.out.println("btree.samplefun(4, 5):"+btree.samplefun(4, 4));
		
		//System.out.println("\nDepth of tree: "+ btree.depth(root));
		//btree.depthIter(root);
//		btree.mirrorTree(root);
//		System.out.print("In Order representation of the mirror tree: ");
//		btree.inOrder(root);
	
//		System.out.println("Root to Leaf path");
//		btree.rootleaf(root, btree.size(root));
//		btree.rootToLeafPath(root, btree.size(root));
//		System.out.print("Nodes at level 3: ");
//		btree.kthNode(root, 3);
		
//		System.out.print("Level : ");
//		btree.nodeLevel(root, 8);
//		
//		System.out.println("Printing level order:");
//		btree.printLevelOrder(root);
//		
//		System.out.println("Child Sum Tree");
//		btree.childSum(root);
//		
//		System.out.println("In Order result: ");
//		btree.inOrder(root);
//		System.out.println("Max Depth of tree: "+ btree.depth(root));
//		btree.rootLeafPathSum(root, btree.size(root), 14);
//		
//		System.out.println("\nIs the tree balanced ? - "+ btree.isBalanced(root));
		
//		System.out.print("Max Sum and its path are :");
//		btree.maxSumRootLeaf(root, btree.size(root));
		
//		System.out.print("Ancestor: ");
//		btree.printAncestor(root, 4);
		
//		System.out.print("No. of leaves: ");
//		btree.countLeaves(root);
//		
//		System.out.println("Right side view");
//		btree.rightSideView(root);
//		
//		System.out.print("Level Order: ");
//		btree.levelOrder(root);
//		
//		System.out.println("Left Side view");
//		btree.leftSideView(root);
		
//		System.out.print("No. nodes between range 40 and 50: "+btree.getCount(root,40,50));
//		System.out.println("tree has path sum of 12: "+ btree.hasPathSum(root, 12));
		System.out.println("min depth: "+btree.minDepthIter(root));
		System.out.println("max Depth: "+btree.maxDepth(root));
	}
	
	/*=================================
	 * Prints nodes in InOrder fashion
	 *=================================
	 */
	public void inOrder(TreeNode node){
		if(node==null)
			return;
		
		inOrder(node.leftChild);
		System.out.print(" "+node.data);
		inOrder(node.rightChild);
	}
	
	/*=========================================
	 * InOrder Traversal - Iterative method
	 *=========================================
	 */
	public void inOrderIter(TreeNode root){
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode p = root;
		
		while(!stack.empty()||p!=null){
			//stack.push(root);
			if(p!=null){
				stack.push(p);
				p = p.leftChild;
			}else {
				p = stack.pop();
				System.out.print(p.data+" ");
				p = p.rightChild;
			}
		}
		System.out.println();
	}
	
	/*=================================
	 * Prints nodes in PreOrder fashion
	 *=================================
	 */
	public void preOrder(TreeNode node){
		
		if(node==null)
			return;
		
		System.out.print(" "+node.data);
		preOrder(node.leftChild);
		preOrder(node.rightChild);
	}
	/*=========================================
	 * PreOrder Traversal - Iterative method
	 *=========================================
	 */
	public void preOrderIter(TreeNode root){
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		
		while(!stack.empty()){
			TreeNode p = stack.pop();
			System.out.print(p.data + " ");
			
			if(p.rightChild != null){
				stack.push(p.rightChild);
			}
			if(p.leftChild!=null){
				stack.push(p.leftChild);
			}			
		}
		//System.out.println();
	}
	
	/*=========================================
	 * Prints nodes in PostOrder fashion
	 *=========================================
	 */
	public void postOrder(TreeNode node){
		if(node==null)
			return;
		
		postOrder(node.leftChild);
		postOrder(node.rightChild);
		System.out.print(" "+node.data);
	}
	
	/*=========================================
	 * PostOrder Traversal - Iterative method
	 *=========================================
	 */
	public void postOrderIter(TreeNode root){
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode curr, prev = null;
		stack.push(root);
		
		while(!stack.empty()){
			curr = stack.peek();
			
			if(prev == null || prev.leftChild == curr || prev.rightChild == curr){
				if(curr.leftChild!=null){
					stack.push(curr.leftChild);
				}else if(curr.rightChild!=null){
					stack.push(curr.rightChild);
				}else{
					stack.pop();
					System.out.print(curr.data + " ");
				}
			}else if(curr.leftChild == prev){
				if(curr.rightChild!=null){
					stack.push(curr.rightChild);
				}else{
					stack.pop();
					System.out.print(curr.data + " ");
				}
			}else if(curr.rightChild == prev){
				stack.pop();
				System.out.print(curr.data + " ");
			}			
			prev = curr;
		}
		System.out.println();
	}
	
	/*========================================================================
	 * Prints total number of nodes in a tree
	 *========================================================================
	 */
	public int size(TreeNode node){
		if(node == null)
			return 0;
		else 
			return(size(node.leftChild) + 1 + size(node.rightChild));
	}
	
	/*========================================================================
	 * Returns 1 if tree1 is identical to tree2 else returns 0
	 *========================================================================
	 */
	public int identicalTree(TreeNode node1, TreeNode node2){
		if(node1 == null && node2 == null)
			return 0;
		
		if(node1!=null && node2!= null){
			if(node1.data == node2.data && (identicalTree(node1.leftChild,node2.leftChild) == 1) && (identicalTree(node1.rightChild,node2.rightChild)==1))
				return 1;
		}
		return 0;	
	}
	
	/*
	 * Returns the height/depth of the tree
	 */
	public int depth(TreeNode node){
		if(node == null)
			return 0;		
		return Math.max(depth(node.leftChild)+1, depth(node.rightChild)+1); 
	}
	
	/*========================================================================
	 * Depth of a tree without recursion
	 *========================================================================
	 */
	public void depthIter(TreeNode node){
		Stack<TreeNode> stack = new Stack<TreeNode>();
		int ht=0, max=0;
//		int nodeData;
		boolean flag=false;
		stack.push(node);
		while(!stack.empty()){
			flag = false;
			node = stack.pop();
//			nodeData = node.data;
			if(node.rightChild!=null){
				stack.push(node.rightChild);
				flag = true;
			}
			
			if(node.leftChild!=null){
				stack.push(node.leftChild);
				flag=true;
			}
			
			if(flag){
				++ht;
				if(ht>max)
					max = ht;				
			}else{
				ht--;
			}				
		}
		System.out.println("max depth: "+max);
	}
	/*========================================================================
	 * Returns true if the abs difference of depth between left sub-tree 
	 * and right sub-tree is not more than 1
	 *========================================================================
	 */
	public boolean isBalanced(TreeNode node){
		if(node == null)
			return true;
			
		int ldepth = depth(node.leftChild);
		int rdepth = depth(node.rightChild);
			
		if(Math.abs(ldepth-rdepth)<=1 && isBalanced(node.leftChild) && isBalanced(node.rightChild) )
			return true;
		
		return false;
	}
	
	/*========================================================================
	 * Changes the given tree into its mirror tree
	 *========================================================================
	 */
	public void mirrorTree(TreeNode node){
		TreeNode temp;
		
		if(node == null)
			return;
		
		mirrorTree(node.leftChild);
		mirrorTree(node.rightChild);
		
		temp = node.leftChild;
		node.leftChild = node.rightChild;
		node.rightChild = temp;
	}
	
	/*========================================================================
	 * Prints nodes in a given level
	 *========================================================================
	 */
	public void printGivenLevel(TreeNode node, int level){
		if(node ==null)
			return;
		if(level == 1)
			System.out.print(node.data+" ");
		else if(level > 1){
			printGivenLevel(node.leftChild, level-1);
			printGivenLevel(node.rightChild, level-1);
		}
	}
	
	public void printLevelOrder(TreeNode node){
		int depth = this.depth(node);
		for(int i =1; i<=depth; i++){
			printGivenLevel(node, i);
		}
	}
	
	/*========================================================================
	 * Level Order Traversal without recursion
	 * Using a queue.
	 *========================================================================
	 */
	
	public void levelOrder(TreeNode root){
		if(root == null)
			return;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);

		while(!queue.isEmpty()){
			int size = queue.size();
			for(int i=0; i<size;i++){
				TreeNode node = queue.poll();			
				System.out.print(node.data + " ");
				if(node.leftChild != null){
					queue.offer(node.leftChild);
				}
				if(node.rightChild != null){
					queue.offer(node.rightChild);
				}
			}
		}
	}
	
	/*========================================================================
	 * Changes the given tree into another which satisfies child-sum property
	 * where the parent node's data is the sum of the data of it's child nodes
	 *========================================================================
	 */
	public void childSum(TreeNode node){		
		if(node == null)
			return;
		
		childSum(node.leftChild);
		childSum(node.rightChild);
		
		if(node.leftChild!=null && node.rightChild!=null){
			node.data = node.leftChild.data + node.rightChild.data;
		}			
		else if(node.leftChild == null && node.rightChild!= null){
			node.data = node.rightChild.data;
		}			
		else if(node.leftChild != null && node.rightChild == null){
			node.data = node.leftChild.data;			
		}		
	}
	
	/*===========================================================
	 * Prints the sum of a given path from root to leaf
	 *===========================================================
	 */
	public void rootLeafPathSum(TreeNode node, int size, int res){
		TreeNode[] arr = new TreeNode[size];
		int sum = 0;
		int runner = 0;		// To track the current node and no. of nodes processed
		int popIndex = 0;
		boolean found = false;
		while(runner<=size){			
			if(node!=null){
				arr[popIndex] = node;
				popIndex++; 
				node = node.leftChild;
				runner++;				
			}else{
				for(int j = 0 ; j< popIndex; j++){
					sum = sum + arr[j].data;
				}
				if(sum == res){
					found = true;
					System.out.print("Sum: "+ res + " - ");					
					for(int i = 0; i<popIndex; i++){
						System.out.print(arr[i].data + " ");
					}
					System.out.println();
				}else{
					popIndex--;
					node = arr[popIndex-1].rightChild;
					sum = 0;
				}				
			}
		}
		if(!found)
			System.out.println("No path exists whose sum is  "+ res);			
	}
	
	/*===========================================================
	 * Prints the a path from root to leaf whose sum is the maximum
	 *===========================================================
	 */
	public void maxSumRootLeaf(TreeNode node, int size){
		TreeNode[] arr = new TreeNode[size];		
		int maxSum = 0;
		int sum = 0;
		int runner = 0;		// To track the current node and no. of nodes processed
		int popIndex = 0;
		
		while(runner<=size){			
			if(node!=null){
				arr[popIndex] = node;
				popIndex++; 
				node = node.leftChild;
				runner++;				
			}else{
				for(int j = 0 ; j< popIndex; j++){
					sum = sum + arr[j].data;					
				}
				if(sum >= maxSum){
					maxSum = sum;					
				}
				popIndex--;
				node = arr[popIndex-1].rightChild;
				sum = 0;								
			}
		}
		this.rootLeafPathSum(node, size, maxSum);
	}
	
	/*===========================================================
	 * Prints the sum of a given path from root to leaf
	 *===========================================================
	 */
	public void rootleaf(TreeNode node, int size){
		TreeNode[] stack = new TreeNode[size];
		int stkptr = 0;
		int num = 1;
		int childcounter = 0;
		int sum = 0;
		while(num <= size){
			if(node!=null){
				//System.out.println("node: "+node.data);
				stack[stkptr] = node;
				stkptr++; num++;
				//System.out.println("stkptr: "+stkptr +"\nnum: "+num);
				if(node.leftChild!=null){
					node = node.leftChild;
				}else if(node.rightChild != null){
					node = node.rightChild;
				}else if(node.leftChild == null && node.rightChild == null){
					
					for(int i = 0; i < stkptr; i++){
						sum = sum + stack[i].data;
						System.out.print(stack[i].data + " ");
					}
					System.out.print(" => "+sum);
					System.out.println();
					sum = 0;
					childcounter++;
					//System.out.println("childCounter: "+ childcounter);
					if(childcounter > 1){
						stkptr--;
						stack[stkptr] = null;
						stkptr--;
						stack[stkptr] = null;
						node = stack[stkptr-1].rightChild;
						childcounter = 0;
					}else {
						stkptr--;
						stack[stkptr] = null;
						node = stack[stkptr-1].rightChild;
					}
					
				}
			}
		}
	}
	
	/*===========================================================
	 * Prints the nodes that are at k distance from root
	 *===========================================================
	 */
	public void kthNode(TreeNode node, int k){
		if(node == null)
			return;
		if(k == 0){
			if(node!=null)
				System.out.print(node.data+" ");			
			return;
		}
		
		kthNode(node.leftChild,k-1);
		kthNode(node.rightChild,k-1);
	}
	
	/*===========================================================
	 * Prints the level of the given node in the tree 
	 *===========================================================
	 */
	public void nodeLevel(TreeNode node, int key){
		nodeLevel(node, key, 1);
		
	}
	
	public void nodeLevel(TreeNode node, int key, int level){
		
		if(node == null)
			return;
		
		if(node.data == key){
			System.out.println(level);
			
		}			
		else{
			nodeLevel(node.leftChild,key,level+1);
			nodeLevel(node.rightChild,key,level+1);
		}		
	}
	
	/*===========================================================
	 * Prints the ancestor of the given node - fucked up version
	 *===========================================================
	 */
	public void ancestor(TreeNode root, int key){
		TreeNode[] stack = new TreeNode[this.size(root)];
		if(root.data == key)
			System.out.println(key + " is the root element");
		else
			ancestor(root,key,stack,0);		
	}
	
	public void ancestor(TreeNode node, int key, TreeNode[] stack, int stkptr){
		if(node == null)
			return;
		
		if(node.data == key){
			printStack(stack,stkptr);
			return;
		}			
		else{
			stkptr = push(stack,node,stkptr);
			ancestor(node.leftChild,key,stack,stkptr);
			stkptr = pop(stack,stkptr);
			ancestor(node.rightChild,key,stack,stkptr);
			
		}
	}
	
	/*==============================================
	 * Utility function to push a node into the stack
	 *==============================================
	 */
	public int push(TreeNode[] arr, TreeNode node, int endptr){
		arr[endptr] = node;
		endptr++;
		return endptr;
	}
	
	public int pop(TreeNode[] arr, int endptr){
		return --endptr;
	}
	
	/*==============================================
	 * Utility function to print the stack
	 *==============================================
	 */
	public void printStack(TreeNode[] arr, int endptr){
		for(int i = 0; i<=endptr; i++){
			if(arr[i]!=null)
				System.out.print(arr[i].data+" ");
//			else
//				System.out.println("NULL");
		}
		System.out.println();
	}
	
	/*==============================================
	 * Prints the ancestor of the given node
	 *==============================================
	 */
	public boolean printAncestor(TreeNode node, int key){
		if(node == null)
			return false;
		
		if(node.data == key){
			//System.out.print(node.data+" ");
			return true;
		}
			
		else if(printAncestor(node.leftChild, key) || printAncestor(node.rightChild, key)){
			System.out.print(node.data+" ");
			return true;
		}
		return false;		
		
	}	
	/*==============================================
	 * Prints the root to leaf path in Binary Tree
	 *==============================================
	 */
	public void rootToLeafPath(TreeNode node, int size){
		Stack<TreeNode> stack = new Stack<TreeNode>();
		int runner=0, childCtr=0;
		
		if(node==null)
			return;
		
		while(runner<=size){
			if(node!=null){
				stack.push(node);
				runner++;
				if(node.leftChild!=null)
					node = node.leftChild;
				else if(node.rightChild!=null)
					node = node.rightChild;
				else if(node.leftChild == null && node.rightChild == null){
					for(TreeNode stkptr:stack){
						System.out.print(stkptr.data+" ");
					}
					System.out.println();
					childCtr++;
					
					if(childCtr>1){
						stack.pop();
						stack.pop();
						node = stack.peek().rightChild;
						childCtr=0;
					}else{
						stack.pop();
						node = stack.peek().rightChild;
					}
										
				}
			}
		}
	}
	
	/*================================================
	 * Wrapper class to get the count of leaves in BT
	 *================================================
	 */
	public void countLeaves(TreeNode root){
		int leaves = countLeavesInt(root);
		System.out.println(leaves);
	}
	/*=======================================
	 * Return the no. of leaves in a tree
	 * =======================================
	 */
	int countLeavesInt(TreeNode root){
		if(root == null)
			return 0;
		
		int left = countLeavesInt(root.leftChild);
		int right = countLeavesInt(root.rightChild);
		if( left == 0 && right == 0){
			return 1;
		}
		
		return left+right;
	}
	
	/*=========================================
	 * Prints the Right side view of the tree 
	 *=======================================
	 */
	void rightSideView(TreeNode root){
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		if(root == null)
			return;
		TreeNode node;
		queue.offer(root);
		while(!queue.isEmpty()){
			int size = queue.size();
			for(int i=0; i<size; i++){
				node = queue.poll();
				if(i==0)
					System.out.print((node==null)?0:node.data + " ");

				if(node.rightChild != null){
					queue.offer(node.rightChild);
				}
				if(node.leftChild != null){
					queue.offer(node.leftChild);
				}
			}
//			System.out.println();
		}
	}	
	/*=======================================
	 * Prints the Left side view of the tree 
	 *=======================================
	 */
	void leftSideView(TreeNode root){
		if(root == null)
			return;
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		
		while(!queue.isEmpty()){
			int size = queue.size();
			for(int i=0; i<size; i++){
				TreeNode node = queue.poll();
				if(i == 0){
					System.out.print((node==null)?0:node.data + " ");
				}
				
				if(node.leftChild != null)
					queue.offer(node.leftChild);
				if(node.rightChild != null)
					queue.offer(node.rightChild);
			}
		}
	}
	
	/*==========================================================
	 * Get the number of nodes that are between the given range
	 *==========================================================
	 */
	int getCount(TreeNode root, int low, int high){
		if(root == null)
			return 0;
		
		if(root.data == high && root.data == low)
			return 1;
		
		if(root.data >= low && root.data <= high)
			return getCount(root.leftChild,low,high)+
					getCount(root.rightChild,low,high)+1;
		
		else if(root.data < low)
			return getCount(root.rightChild,low,high);
		else 
			return getCount(root.leftChild,low,high);		
	}
	
	/*============================================
	 * Returns true if the given tree has a path  
	 * with the given sum
	 *============================================
	 */
	boolean hasPathSum(TreeNode root,int sum){
		if(root == null)
			return false;
		Queue<Integer> valq = new LinkedList<Integer>();
		Queue<TreeNode> nodeq = new LinkedList<TreeNode>();
		
		nodeq.add(root);
		valq.add(root.data);
		
		while(!nodeq.isEmpty()){
			TreeNode node = nodeq.remove();
			int val = valq.remove();
			
			if(val == sum && (node.leftChild == null && node.rightChild == null))
				return true;
			
			if(node.leftChild != null){
				nodeq.add(node.leftChild);
				valq.add(val+node.leftChild.data);
			}
			
			if(node.rightChild != null){
				nodeq.add(node.rightChild);
				valq.add(val+node.rightChild.data);
			}
		}
		return false;
	}
	/*=========================
	 * Root Path sum recursive
	 *=========================
	 */
	boolean hasPathSumRec(TreeNode root, int sum){
		if(root == null)
			return false;
		if(sum == root.data && (root.leftChild == null && root.rightChild == null))
			return true;
		return (hasPathSumRec(root.leftChild,sum-root.data)||hasPathSumRec(root.rightChild,sum-root.data));
	}
	
	/*===================================================
	 * Return Minimum depth of Binary tree - recursively
	 *===================================================
	 */
	int minDepth(TreeNode root){
		if(root == null)
			return 0;
		else
			return Math.min(minDepth(root.leftChild)+1, minDepth(root.rightChild)+1);
		
	}
	
	/*===================================================
	 * Return Minimum depth of Binary tree - iteratively
	 *===================================================
	 */
	int minDepthIter(TreeNode root){
		if(root == null)
			return 0;
		
		Queue<TreeNode> nodes = new LinkedList<TreeNode>();
		Queue<Integer> count = new LinkedList<Integer>();
		
		nodes.add(root);
		count.add(1);
		
		while(!nodes.isEmpty()){
			TreeNode gai = nodes.remove();
			int cnt = count.remove();
			
			if(gai.leftChild == null && gai.rightChild == null)
				return cnt;
			
			if(gai.leftChild != null){
				nodes.add(gai.leftChild);
				count.add(cnt+1);
			}
			
			if(gai.rightChild != null){
				nodes.add(gai.rightChild);
				count.add(cnt+1);
			}
		}
		return 0;		
	}
	
	public int maxDepth(TreeNode root){
		if(root == null)
			return 0;
		else
			return Math.max(maxDepth(root.leftChild)+1, maxDepth(root.rightChild)+1);
	}
	
}
