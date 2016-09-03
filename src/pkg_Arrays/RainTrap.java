/**
 * 
 */
package pkg_Arrays;

/**
 * @author aswin
 *
 */
public class RainTrap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = { 0,1,0,2,1,0,1,3,2,1,2,1 };
		RainTrap rt = new RainTrap();
		System.out.println(rt.rainTrap(height));
	}
	
	int rainTrap(int[] height) {
		int sum = 0, h = 0, i = 0, j = height.length -1 ;
		while(i < j) {
			if(height[i] < height[j]) {
				h = Math.max(h, height[i]);
				sum = sum + h - height[i];
				i++;
				
			}else {
				h = Math.max(h, height[j]);
				sum = sum + h - height[j];
				j--;
			}
			System.out.println(i + "," + height[i] + "\t" + j + "," + height[j] + "\t" + h + "\t" + sum);
		}
		return sum;
	}
<<<<<<< HEAD
	
	public int TrappingRain(int[] bin){
		int left = 0, right = bin.length-1, maxLeftHeight = bin[left], maxRightHeight = bin[right];
		int sum = 0;
		while(left < right){
			if(bin[left] <= bin[right]){
				if(maxLeftHeight <= bin[left])
					maxLeftHeight = bin[left];
				else
					sum = sum + maxLeftHeight - bin[left];
				left++;
			}else{
				if(maxRightHeight < bin[right])
					maxRightHeight = bin[right];
				else
					sum = sum + maxRightHeight - bin[right];
				right--;
			}
		}
		return sum;
		
	}
=======
>>>>>>> e1183d48c51150798e555e5c155c1abae0f1ee10

}
