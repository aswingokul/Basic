/**
 * 
 */
package pkg_Arrays;

/**
 * @author Aswin
 *
 */
public class RemoveDuplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicate ob = new RemoveDuplicate();
		int[] A = {1,2,2,3,3};
		int ret = ob.removeDup(A);
		System.out.println("ret: "+ret);
		System.out.println("Now the array looks like");
		for(int a=0; a<A.length;a++){
			System.out.print(A[a]+" ");
		}
		System.out.println();
	}
	
	public int removeDup(int[] A){
		if(A.length < 2)
			return A.length;
		
		int j = 0, i = 1;
		while(i<A.length){
			System.out.println("Comparing "+A[i]+" "+A[j]);
			if(A[i] == A[j]){				
				i++;
				System.out.println("i: "+i+".....j: "+j);
			}else{
				j++;
				System.out.println("i: "+i+".....j: "+j);
				A[j] = A[i];
				System.out.println("Now the array looks like");
				for(int a=0; a<A.length;a++){
					System.out.print(A[a]+" ");
				}
				System.out.println();
				i++;
				System.out.println("i: "+i+".....j: "+j);
			}
		}
		return j+1;
	}

}
