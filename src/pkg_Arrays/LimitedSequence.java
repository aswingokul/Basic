<<<<<<< HEAD
/**
 * 
 */
package pkg_Arrays;

/**
 * @author Aswin
 *
 */
public class LimitedSequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LimitedSequence ob = new LimitedSequence();
		ob.starter(3, 2);

	}
	
	public void fillSeq(int k, int n, int len, int a[]){
		if(len == k){
			printArr(a);
			return;
		}
		System.out.println("len: "+len);
		int i = (len==0)? 1 : a[len-1]+1;
		System.out.println("i: "+i);
		len++;
		
		while(i<=n){
			a[len-1] = i;
			System.out.println("a["+(len-1)+"]: "+a[len-1]);
			fillSeq(k, n, len, a);
			i++;
		}
		len--;
	}
	
	public void starter(int n, int k){
		int[] a = new int[k];
		int len = 0;
		fillSeq(k, n, len, a);
	}
	
	public void printArr(int a[]){
		for(int i=0; i<a.length;i++){
			System.out.print(a[i]+" ");
	}
	System.out.println();
}}
=======
/**
 * 
 */
package pkg_Arrays;

/**
 * @author Aswin
 *
 */
public class LimitedSequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LimitedSequence ob = new LimitedSequence();
		ob.starter(3, 2);

	}
	
	public void fillSeq(int k, int n, int len, int a[]){
		if(len == k){
			printArr(a);
			return;
		}
		System.out.println("len: "+len);
		int i = (len==0)? 1 : a[len-1]+1;
		System.out.println("i: "+i);
		len++;
		
		while(i<=n){
			a[len-1] = i;
			System.out.println("a["+(len-1)+"]: "+a[len-1]);
			fillSeq(k, n, len, a);
			i++;
		}
		len--;
	}
	
	public void starter(int n, int k){
		int[] a = new int[k];
		int len = 0;
		fillSeq(k, n, len, a);
	}
	
	public void printArr(int a[]){
		for(int i=0; i<a.length;i++){
			System.out.print(a[i]+" ");
	}
	System.out.println();
}}
>>>>>>> e1183d48c51150798e555e5c155c1abae0f1ee10
