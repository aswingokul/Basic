/**
 * 
 */
package pkg_Trie;

/**
 * @author Aswin
 *
 */
public class TrieNode {
	boolean isLeaf;
	TrieNode child[];
	String URL;
	
	public TrieNode(){
		isLeaf = false;
		URL = null;
		initializeChild();
	}
	public void initializeChild(){
		this.child = new TrieNode[11];
		for(int i=0; i<11; i++){
			this.child[i] = null;
		}
	}
}
