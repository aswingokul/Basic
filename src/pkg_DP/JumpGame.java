/**
 * 
 */
package pkg_DP;

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
		JumpGame jg = new JumpGame();
		int[] nums = {2,3,1,1,4};
		int[] nums2 = {1,2,3,4,5,0};
//		System.out.println("nums: "+jg.backtrack(nums));
//		System.out.println("nums2: "+jg.backtrack(nums2));
		System.out.println(jg.programCreek(nums2));

	}
	
	public boolean backtrack(int[] nums){
		return backtrack(nums,0);
	}
	
	public boolean backtrack(int[] nums, int position){
		if(position == nums.length-1)
			return true;
		int furthestPos = Math.min(nums[position]+position, nums.length-1);
		for(int i=position+1; i<=furthestPos;){
			return backtrack(nums,i);
		}
		return false;
	}
	
	public boolean programCreek(int[] nums){
		if(nums.length <=1)
			return true;
		int max = nums[0];
		for(int i =0; i<nums.length; i++){
			if(max <= i && nums[i] == 0)
				return false;
			if(i+nums[i] > max)
				max = i+nums[i];
			if(max >=nums.length-1)
				return true;
		}
		return false;
	}

}
