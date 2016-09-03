/**
 * 
 */
package pkgBasic;

/**
 * @author Aswin
 *
 */
public class HourAngleProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HourAngleProblem hap = new HourAngleProblem();
		System.out.println(hap.hourAngle(12, 35));
	}
	
	public int hourAngle(int hour, int min){
		//int angle = 0;
		if(hour < 0 || min < 0 || hour > 12 || min > 60 ){
			System.out.println("Invalid time");
			return -1;
		}
		
		if(hour == 12){
			hour = 0;
		}
		
		if(min == 60){
			min = 0;
		}
		
		int angle = (int) Math.abs(0.5*(hour * 60 - 11 * min));
		
		//return angle;
		return Math.min(360-angle, angle);
	}

}
