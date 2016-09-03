/**
 * 
 */
package pkg_Arrays;

/**
 * @author Aswin
 *
 */
public class MoveZeros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoveZeros mz = new MoveZeros();
		int[] nums = {1,3,0,4,0,5};
		mz.moveZeros(nums);

	}
	
	public void moveZeros(int[] nums){
		int p1=0, p2=0;
		while(p2<nums.length){
			if(p1 == p2){
				if(nums[p1]!=0)
					p1++;
			}else{
				if(nums[p2]!=0){
					nums[p1++] = nums[p2];
					nums[p2] = 0;
				}
			}
			p2++;
		}
		
		for(int i=0; i<nums.length;i++){
			System.out.print(nums[i]+" ");
		}
	}		

}
