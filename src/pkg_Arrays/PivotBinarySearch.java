<<<<<<< HEAD
/**
 * 
 */
package pkg_Arrays;

/**
 * @author Aswin
 *
 */
public class PivotBinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {5,6,7,8,9,10,1,2,3};
		

	}
	
	int findPivot(int in[],int low, int high){		
		if(high<low)
			return -1;
		if(high==low)
			return low;		
		int mid = (low+high)/2;
		
		if(mid < high && in[mid] > in[mid+1])
			return mid;
		if(mid > low && in[mid] < in[mid-1])
			return mid-1;
		if(in[low]>=in[mid])
			return findPivot(in, low, mid-1);
		else
			return findPivot(in, mid+1, high);		
	}
	
	int binarySearch(int in[],int low, int high, int no){
		if(high < low) return -1;
		int mid = (low+high)/2;
		if(in[mid] == no)
			return mid;
		else if(no > in[mid])
			return binarySearch(in, mid+1, high, no);
		else
			return binarySearch(in, low, mid-1, no);
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
public class PivotBinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {5,6,7,8,9,10,1,2,3};
		

	}
	
	int findPivot(int in[],int low, int high){		
		if(high<low)
			return -1;
		if(high==low)
			return low;		
		int mid = (low+high)/2;
		
		if(mid < high && in[mid] > in[mid+1])
			return mid;
		if(mid > low && in[mid] < in[mid-1])
			return mid-1;
		if(in[low]>=in[mid])
			return findPivot(in, low, mid-1);
		else
			return findPivot(in, mid+1, high);		
	}
	
	int binarySearch(int in[],int low, int high, int no){
		if(high < low) return -1;
		int mid = (low+high)/2;
		if(in[mid] == no)
			return mid;
		else if(no > in[mid])
			return binarySearch(in, mid+1, high, no);
		else
			return binarySearch(in, low, mid-1, no);
	}

}
>>>>>>> e1183d48c51150798e555e5c155c1abae0f1ee10
