/**
 * 
 */
package pkgBasic;

/**
 * @author Aswin
 *
 */
public class ReplaceSpace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		replaceSpace("Thus God created stupid people");

	}
	
	public static void replaceSpace(String str){
		String[] sar = str.split(" ");
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<sar.length; i++){
			sb.append(sar[i]);
			if(i!=sar.length-1)
				sb.append("%20");
		}
		System.out.println(sb.toString());
	}

}
