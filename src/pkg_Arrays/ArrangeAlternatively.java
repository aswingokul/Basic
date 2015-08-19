/**
 * 
 */
package pkg_Arrays;

/**
 * @author aswin
 *
 */
public class ArrangeAlternatively {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrangeAlternatively aa = new ArrangeAlternatively();
		int[] ip = {1,2,2};
		aa.arrange(ip);

	}
	
	void arrange(int[] nums) {
		int odd = 0, even = 0;
		for(int i =0; i<nums.length; i++) {
			if(nums[i]%2 == 0)
				even++;
			else
				odd++;
		}
		
		int[] odda = new int[odd];
		int[] evena = new int[even];
		int oc = 0, ec = 0;
		for(int i=0; i<nums.length ;i++) {
			if(nums[i] %2 == 0) {
				evena[ec] = nums[i];
				ec++;
			}else {
				odda[oc] = nums[i];
				oc++;
			}
		}
		oc = 0;
		for(int i=0; i<nums.length && oc < odd; i+=2, oc++) {
			nums[i] = odda[oc];  
		}
		ec = 0;
		for(int i = 1; i < nums.length && ec < even; i+=2, ec++) {
			nums[i] = evena[ec];
		}
		
		for(int j = 0; j<nums.length; j++) {
			System.out.print(nums[j] + " ");
		}
	}

}
