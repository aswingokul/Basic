/**
 * 
 */
package pkg_Trie;

/**
 * @author Aswin
 *
 */
public class ReverseDNSLookup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ip = {"107.108.11.123", "107.109.123.255", "74.125.200.106"};
		String[] URL = {"www.samsung.com", "www.facebook.com", "www.google.com"};
		ReverseDNSLookup ob = new ReverseDNSLookup();
		TrieNode root = new TrieNode();
		for(int i=0; i<3;i++){
			ob.insert(ip[i], URL[i], root);
		}
		String key = "107.108.11.123";
		String val = ob.searchDNS(key, root);
		if(val!=null){
			System.out.println(key+" "+val);
		}else{
			System.out.println("Error 404");
		}
		
	}
	
	public int getIndex(char c){
		return (c=='.')?10:(int)(c-'0');
	}
	
	public void insert(String ipaddr, String URL, TrieNode root){
		TrieNode crawl = root;
		for(int level = 0; level < ipaddr.length(); level++){
			int index = getIndex(ipaddr.charAt(level));
			
			if(crawl.child[index]==null){
				crawl.child[index] = new TrieNode();				
			}
			
			crawl = crawl.child[index];
		}
		
		crawl.isLeaf = true;
		crawl.URL = URL;
	}
	
	public String searchDNS(String ipaddr, TrieNode root){
		TrieNode crawl = root;
		for(int level = 0; level < ipaddr.length(); level++){
			int index = getIndex(ipaddr.charAt(level));
			if(crawl.child[level]!=null)
				crawl = crawl.child[index];
			else
				return null;
		}
		if(crawl!=null && crawl.isLeaf){
			return crawl.URL;
		}
		return null;
	}

}
