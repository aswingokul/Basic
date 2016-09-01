/**
 * 
 */
package pkgTreesGraphs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aswin
 *
 */
public class TrieNode {
	boolean isLeaf;
	boolean isWord;
	char nodeVal;
	TrieNode[] children;
	TrieNode parent;
	
	public TrieNode(){
		isLeaf = true;
		isWord = false;
		children = new TrieNode[26];		
	}
	
	public TrieNode(char ch){
		this();
		this.nodeVal = ch;		
	}
	
	public void addWord(String word){
		isLeaf = false;
		int childpos = word.charAt(0)-'a';
		if(children[childpos]==null){
			children[childpos]= new TrieNode(word.charAt(0));
			children[childpos].parent = this;
		}
		if(word.length() > 1){
			children[childpos].addWord(word.substring(1));
		}else{
			children[childpos].isWord = true;
			children[childpos].isLeaf = true;
		}
	}
	
	public String toString(){
		if(parent == null){
			return "";
		}
		return parent.toString()+new String(new char[] {nodeVal});		
	}
	
	public List<String> getWords(){
		List<String> list = new ArrayList<String>();
		if(isWord){
			list.add(toString());
		}
		
		if(!isLeaf){
			for(int i=0; i<children.length;i++){
				if(children[i] != null){
					list.addAll(children[i].getWords());
				}
			}
		}
		return list;
	}
	
	public TrieNode getNode(char ch){
		return children[ch-'a'];
	}
}
