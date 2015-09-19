/**
 * 
 */
package pkg_BitManip;

/**
 * @author Aswin
 *
 */
public class BitManipIntro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	boolean getBits(int num,int i){
		return ((num & (1 << i))!=0);
	}
	
	int setBits(int num, int i){
		return num | (1 << i); 
	}
	
	int clearBits(int num, int i){
		int mask = ~(1 << i);
		return num & mask;
	}

}
