/**
 * 
 */
package pkgBasic;

/**
 * @author Aswin
 *
 */
public class PowerXN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PowerXN px = new PowerXN();
		System.out.println(px.pow(2, 4));

	}
	
	double power(double num, int exp){
		if(exp == 0) return 1.0;
		if(num == 1) return num;
		
		int posExp = (exp>0)?exp:(-exp);
		int posExpVar = posExp;
		
		double posNum = (num>0)?num:(-num);
		double result = posNum;
		
		int k = 1;
		
		while(posExp/2 > 0){
			result = result * result;
			posExp = posExp/2;
			k = k*2;
		}
		
		result = result*power(posNum, posExpVar-k);
		
		if(num < 0 && exp%2 == 1){
			result = -result;
		}
		
		if(exp < 0)
			result = 1/result;
		
		return result;
	}
	
	double pow(double num, int exp){
		if(exp < 0)
			return (1/power2(num, -exp));
		else
			return power2(num,exp);
	}
	
	double power2(double num, int exp){
		if(exp == 0)
			return 1;
		
		double res = power2(num,exp/2);
		
		if(exp%2 == 0)
			return res*res;
		else
			return res*res*num;
	}

}
