/**
 * 
 */
package pkg_Arrays;

/**
 * @author Aswin
 *
 */
public class MedianOf2SortedArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MedianOf2SortedArrays mosa = new MedianOf2SortedArrays();
		int[] A = {1,3,5,7,9};
		int[] B = {2,4,6,8};
		double median = mosa.findkth(A, B);
		System.out.println("median: "+median);

	}
	/*
	 * 
	 * WRONG CODE !!! NOT WORKING
	 * 
	 */
	public double findkth(int[] A, int[] B){
        int m = A.length;
        int n = B.length;
        
        if((m+n)%2 != 0)
           return findkth(A,B,(m+n)/2,0,m-1,0,n-1);
       else{
           return ((findkth(A,B,(m+n)/2,0,m-1,0,n-1) + findkth(A,B,(m+n)/2-1,0,m-1,0,n-1))*0.5);
       }
    }
	
	public int findkth(int[] A, int[] B, int k, int aStart, int aEnd, int bStart, int bEnd){
        int aLen = aEnd - aStart+1;
        int bLen = bEnd  - bStart +1;
        
        if(aLen == 0)
        	return B[bStart+k];
        if(bLen == 0)
        	return A[aStart+k];
        if(k==0)
        	return A[aStart] < B[bStart]?A[aStart]:B[bStart];
        
        int aMid = (aLen * k)/(aLen + bLen); //a's middle count
        System.out.println("aLen * k: "+(aLen*k));
        System.out.println("aMid: "+aMid);
        
        int bMid = k-aLen-1; //b's middle count
        
        aMid = aStart + aMid;
        bMid = bStart + bMid;
        
        if(A[aMid] > B[bMid]){
        	k = k - (bMid - bStart +1);
        	aEnd = aMid;
        	bStart = bMid +1;
        }else{
        	k = k- (aMid - aStart + 1);
        	bEnd = bMid;
        	aStart = aMid + 1;
        }
        
        return findkth(A,B,k,aStart,aEnd,bStart,bEnd);
    }

}
