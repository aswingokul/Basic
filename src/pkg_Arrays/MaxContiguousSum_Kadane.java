<<<<<<< HEAD
/**
 * 
 */
package pkg_Arrays;

/**
 * @author Aswin
 *
 */
public class MaxContiguousSum_Kadane {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {-2,3,-4,1,-4,6,-8,7,2};
		MaxContiguousSum_Kadane obj = new MaxContiguousSum_Kadane();
		System.out.println("Kadane's Algorithm: ");
		obj.kadane(input);
		System.out.println("Mohit way: ");
		obj.mohitWay(input);
	}
	
	void mohitWay(int input[]){
		int maxHere = input[0], maxSoFar = input[0];
		for(int i = 1; i<input.length; i++){
			maxHere = max(input[i],maxHere+input[i]);
			maxSoFar = max(maxHere,maxSoFar);
		}
		System.out.println("Max sum: "+maxSoFar);
	}
	
	int max(int i,int j){
		return ((i>j)?i:j);
	}
	
	void kadane(int input[]){
		int maxSoFar = 0, maxHere = 0;
		for(int i=0; i<input.length;i++){
			maxHere = maxHere+input[i];
			if(maxHere < 0)
				maxHere = 0;
			else if(maxSoFar < maxHere)
				maxSoFar = maxHere;				
		}
		System.out.println("Max sum: "+maxSoFar);
	}

}
=======
/**
 * 
 */
package pkg_Arrays;

/**
 * @author Aswin
 *
 */
public class MaxContiguousSum_Kadane {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {-2,3,-4,1,-4,6,-8,7,2};
		MaxContiguousSum_Kadane obj = new MaxContiguousSum_Kadane();
		System.out.println("Kadane's Algorithm: ");
		obj.kadane(input);
		System.out.println("Mohit way: ");
		obj.mohitWay(input);
	}
	
	void mohitWay(int input[]){
		int maxHere = input[0], maxSoFar = input[0];
		for(int i = 1; i<input.length; i++){
			maxHere = max(input[i],maxHere+input[i]);
			maxSoFar = max(maxHere,maxSoFar);
		}
		System.out.println("Max sum: "+maxSoFar);
	}
	
	int max(int i,int j){
		return ((i>j)?i:j);
	}
	
	void kadane(int input[]){
		int maxSoFar = 0, maxHere = 0;
		for(int i=0; i<input.length;i++){
			maxHere = maxHere+input[i];
			if(maxHere < 0)
				maxHere = 0;
			else if(maxSoFar < maxHere)
				maxSoFar = maxHere;				
		}
		System.out.println("Max sum: "+maxSoFar);
	}

}
>>>>>>> e1183d48c51150798e555e5c155c1abae0f1ee10
