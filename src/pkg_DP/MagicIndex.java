/**
 * 
 */
package pkg_DP;

/**
 * @author Aswin
 *
 */
public class MagicIndex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-5, -3, -1, 3, 5};
		MagicIndex mi = new MagicIndex();
		System.out.println(mi.magicIndex(nums));
		System.out.println(mi.magicIndexBS(nums));

	}
	
	public boolean magicIndex(int[] A){
		int len = A.length;
		for(int i=0; i<len; i++){
			if(A[i] == i)
				return true;
		}
		return false;
	}
	
	public boolean magicIndexBS(int[] A){
		return magicIndex(A, 0, A.length-1);
	}
	
	public boolean magicIndex(int[] A, int left, int right){
		if(left > right)
			return false;
		int index = (left+right)/2+1 ;
		if(A[index] == index)
			return true;
		else if(A[index] < index){
			if(!magicIndex(A, left, index-1))
				return magicIndex(A, index, right);
		}		
		return false;
	}

}
