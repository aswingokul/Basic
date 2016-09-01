/**
 * 
 */
package pkgTreesGraphs;

import java.util.List;

/**
 * @author Aswin
 *
 */
public class Trie {
	TrieNode root;
	
	public Trie(){
		root = new TrieNode();
	}
	
	public void addWord(String word){
		root.addWord(word);
	}
	
	public List<String> getWords(){
		return null;
		
	}

}
