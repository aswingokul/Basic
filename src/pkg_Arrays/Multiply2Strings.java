/**
 * 
 */
package pkg_Arrays;

/**
 * @author Aswin
 *
 */
public class Multiply2Strings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Multiply2Strings ms = new Multiply2Strings();
		
		System.out.println(ms.multiply("88", "797"));
	}
	
	public String multiply(String num1, String num2){
		int m = num1.length(), n = num2.length();
		int[] pos = new int[m+n];
		
		for(int i=m-1; i>=0; i--){
			for(int j=n-1; j>=0; j--){
				int mul = (num1.charAt(i)-'0') * (num2.charAt(j)-'0');
				int p1 = i+j; int p2 = i+j+1;
				int sum = mul +  pos[p2];
				
				pos[p1] += (sum/10);
				pos[p2] = sum%10;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<pos.length; i++){
			if(sb.length() != 0 || pos[i] != 0){
				sb.append(pos[i]);
			}
		}
		
		return sb.length() == 0 ? "0" : sb.toString();
	}

}
