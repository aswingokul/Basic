/**
 * 
 */
package pkg_Arrays;

/**
 * @author Aswin
 *
 */
public class JumpGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {2,3,1,1,4};
		int[] nums2 = {3,2,1,0,4};
		int[] nums3 = {2,5,0,0};
		JumpGame jg = new JumpGame();
		System.out.println(jg.jumpGame2(nums1));

	}
	
	public boolean jumpGame(int[] nums){
		if(nums.length == 0 || nums == null)
			return false;
		if(nums.length == 1)
			return true;
		int jumpIndex = 0, jumpLen;
		int arrLen = nums.length;
		
		while(true){
			if(jumpIndex < arrLen){
				if(nums[jumpIndex] == 0 && jumpIndex != arrLen-1)
					return false;
				jumpLen = nums[jumpIndex];
				jumpIndex += jumpLen;
				if(jumpIndex == arrLen-1)
					return true;
			}else if(jumpIndex >= arrLen)
				return true;
		}
	}
	
	public boolean jumpGame2(int[] nums){
		int max = 0;
	    for(int i=0;i<nums.length;i++){
	        if(i>max) {
	        	return false;
	        }
	        max = Math.max(nums[i]+i,max);
	    }
	    return true;
	}

}
