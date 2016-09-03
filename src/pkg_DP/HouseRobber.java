/**
 * 
 */
package pkg_DP;

/**
 * @author Aswin
 *
 */
public class HouseRobber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,3,1,2,8};
		HouseRobber hr = new HouseRobber();
		System.out.println(hr.rob2(nums));
		System.out.println(hr.rob3(nums));

	}
	
	/*
	 * Solution 1
	 */
	public int rob(int[] nums){
		int evenSum = 0, oddSum = 0;
		for(int i=0; i<nums.length;i++){
			if(i%2==0){
				evenSum = Math.max(evenSum+nums[i], oddSum);
			}else{
				oddSum = Math.max(evenSum, oddSum+nums[i]);
			}
		}
		return Math.max(evenSum, oddSum);
	}
	
	public int rob2(int[] nums){
		int[][] dp = new int[nums.length+1][2];
		for(int i=1; i<=nums.length; i++){
			dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1]);
			dp[i][1] = nums[i-1] + dp[i-1][0];
		}
		return Math.max(dp[nums.length][0], dp[nums.length][1]);
	}
	
	/* ifRobbedPrev - Max Money accumulated by robbing the prev house 
	 * ifNotRobbedPrev - Max Money accumulated by not robbing the prev house
	 * currentRob - If current is robbed, the prev house should not be robbed
	 * currentNotRob - Get the max till the prev aggregate
	 */
	public int rob3(int[] nums){
		int ifRobbedPrev = 0, ifNotRobbedPrev = 0;
		
		// We go through all the values, we maintain two counts, 1) if we rob this cell, 2) if we didn't rob this cell
		for(int i=0; i< nums.length;i++){
			
			// If we don't rob current cell, then the count should be max of the previous cell robbed and not robbed
			int currentNotRob = Math.max(ifRobbedPrev, ifNotRobbedPrev);
			
			// If we rob current cell, previous cell shouldn't be robbed. So, add the current value to previous one.
			int currentRob = ifNotRobbedPrev + nums[i];
			
			// Update values for the next round
			ifNotRobbedPrev = currentNotRob;
			ifRobbedPrev = currentRob;
		}
		return Math.max(ifRobbedPrev, ifNotRobbedPrev);
	}

}
