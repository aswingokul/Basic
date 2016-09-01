/**
 * 
 */
package pkgBasic;

/**
 * @author Aswin
 *
 */
public class NumToWords {

	/**
	 * @param args
	 */
	public static final String[] spNames = {
		"",
		"Thousand",
		"Million",
		"Billion",
		"Trillion"		
	};
	
	public static final String[] tensNames = {
		"",
		"Ten",
		"Twenty",
		"Thirty",
		"Forty",
		"Fifty",
		"Sixty",
		"Seventy",
		"Eighty",
		"Ninety"		
	};
	
	public static final String[] numNames = {
		"",
		"One",
		"Two",
		"Three",
		"Four",
		"Five",
		"Six",
		"Seven",
		"Eight",
		"Nine",
		"Ten",
		"Eleven",
		"Twelve",
		"Thirteen",
		"Fourteen",
		"Fifteen",
		"Sixteen",
		"Seventeen",
		"Eighteen",
		"Nineteen"
	};
	
	public String convert(int number){
		String curr = "";
		String prefix = "";
		if(number == 0)
			return "Zero";
		
		if(number < 0 ){
			number = -number;
			prefix = "negative";
		}
		
		int place = 0;
		do{
			int n = number%1000;
			if(n!=0){
				String s = convertLessThanThousand(n);
				curr = s + spNames[place] + curr;
			}
			place++;
			number /= 1000;
		}while(number>0);
		
		return (prefix+curr).trim();
	}
	
	public String convertLessThanThousand(int num){
		String curr;
		if(num%100 < 20){
			curr = numNames[num%100];
			num /= 100;
		}else{
			curr = numNames[num%10];
			num /= 10;
			
			curr = tensNames[num%10] + curr;
			num /= 10;
		}
		if(num == 0)
			return curr;
		return numNames[num] + "Hundred" + curr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumToWords ob = new NumToWords();
		String res = ob.convert(5738239);
		System.out.println(res);

	}

}
