/**
 * 
 */
package pkg_DP;

/**
 * @author Aswin
 *
 */
public class BuySellStockMedium {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] prices = {10,12,11,9,10,13,12};
		int profit = 0, buy = prices[0];
		
		for(int i=1; i<prices.length; i++){
			if(prices[i] > buy){
				profit = Math.max(profit, prices[i]-buy);				
			}else if(prices[i]<buy){
				buy = prices[i];
			}
		}
		System.out.println("profit: " + profit);
	}
}
