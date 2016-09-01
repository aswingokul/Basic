/**
 * 
 */
package pkg_DP;

/**
 * @author Aswin
 *
 */
public class GasStation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] gas = {4,1,2,6};
		int[] cost = {3,2,4,3};
		
		GasStation gs = new GasStation();
		System.out.println(gs.canFinishCircuit(gas, cost));

	}
	
	public int canFinishCircuit(int[] gas, int[] cost){
		int capacity = 0, start = 0, total = 0;		
		for(int i=0; i<gas.length; i++){
			capacity = capacity + gas[i];
			capacity = capacity - cost[i];
			if(capacity < 0){				
				start = i+1;
				total = total + capacity;
				capacity = 0;
			}			
		}		
		return ((capacity+total) < 0)? -1 : start;
	}
	
	

}
