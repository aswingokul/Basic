/**
 * 
 */
package pkgBasic;

/**
 * @author Aswin
 *
 */
public class ReverseVowels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseVowels rv = new ReverseVowels();
		System.out.println(rv.reverseVowels("hello"));

	}
	
	public String reverseVowels(String s) {
        int len = s.length();
        int left = 0, right = len-1;
        while(left < right){
            
            
            while(left < len && Character.toLowerCase(s.charAt(left)) != 'a' && Character.toLowerCase(s.charAt(left)) != 'e' && Character.toLowerCase(s.charAt(left)) != 'i' && Character.toLowerCase(s.charAt(left)) != 'o' && Character.toLowerCase(s.charAt(left)) != 'u'){
                left++;
            }
            System.out.println("left: " + left);
            
            while(right > 0 && Character.toLowerCase(s.charAt(right)) != 'a' && Character.toLowerCase(s.charAt(right)) != 'e' && Character.toLowerCase(s.charAt(right)) != 'i' && Character.toLowerCase(s.charAt(right)) != 'o' && Character.toLowerCase(s.charAt(right)) != 'u'){
                right--;
            }
            System.out.println("right: " + right);
            
            s=swap(s,left, right);
            System.out.println("s:" + s);
            left++;
            right--;
        }
        
        return s;
        
    }
    
    private String swap(String s, int i, int j){
        char[] str = s.toCharArray();
        char c = str[i];
        str[i] = str[j];
        str[j] = c;
        
        return str.toString();
    }

}
