/**
 * 
 */
package pkgBasic;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Aswin
 *
 */
public class ExcelSheetColToTitle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcelSheetColToTitle ect = new ExcelSheetColToTitle();
		System.out.println(ect.colToTitle(3452));
		System.out.println(ect.convertToTitle(3452));

	}
	
	String colToTitle(int n){
		if(n<1)
			return null;
		
		StringBuilder sb = new StringBuilder();
		while(n>0){
			n--;
			char ch = (char) (n%26 +'A');
			sb.append(ch);
			n /=26;
		}
		
		sb.reverse();
		return sb.toString();
	}
	
	String convertToTitle(int n){
	    if(n<1)
	        return null;
	    
	    Map<Integer,Character> map = new HashMap<Integer,Character>();
		char j = 'A';
        
        for(int i =1; i<=26; i++, j++){
            map.put(i,j);
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(n>26){            
            int r = n%26;
            if(r == 0){
                n = (n/26)-1;
                r += 26;
            }else
                n = n/26;
            sb.append(map.get(r));
            if(n<26)
                break;
            
        }
	    sb.append(map.get(n));
	    sb.reverse();
	    return sb.toString();
	}

}
