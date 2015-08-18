/**
 * 
 */
package pkg_Arrays;

/**
 * @author aswin
 *
 */
public class SearchRotatedSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,3,5};
		SearchRotatedSortedArray srsa = new SearchRotatedSortedArray();
		System.out.println(srsa.search(a, 0, a.length-1, 5));

	}
	
	int search(int[] array, int left, int right, int x) {
		int mid = (left+right)/2;
		
		if(array[mid] == x) {
			return mid;
		}
		
		if(right < left)
			return -1;
		
		if(array[left] < array[mid]) { //Left half is properly ordered
			if(x >= array[left] && x <= array[mid])
				return search(array,left,mid-1,x);
			else
				return search(array,mid+1,right,x); 
		}else if(array[mid] < array[left]) {
			if(x >= array[mid] && x <= array[right])
				return search(array,mid+1,right,x);
			else
				return search(array,left,mid-1,x);
		}else if(array[left] == array[mid]) {
			if(array[mid] != array[right]) 
				return search(array,mid+1,right,x);
			else {
				int result = search(array,left,mid-1,x);
				if(result == -1)
					return search(array,mid+1,right,x);
				else
					return result;
			}			
		}
		return -1;
	}

}
