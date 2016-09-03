<<<<<<< HEAD
/**
 * 
 */
package pkg_Arrays;

/**
 * @author Aswin
 *
 */
public class RotateMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		System.out.println("Initial matrix");
		for(int l=0; l<mat.length; l++){
			for(int m=0; m<mat[0].length;m++){
				System.out.print(mat[l][m]+"  ");
			}
			System.out.println();
		}
		rotateMatrix(mat);
	}
	
	static void rotateMatrix(int[][] mat){
		int n = mat.length;
		System.out.println("n/2: "+n/2);
		System.out.println("Math.ceil((double) (n)/2): "+Math.ceil((double) (n)/2));
		for(int i=0; i<n/2; i++){
			for(int j=0; j<Math.ceil((double) (n)/2);j++){
				System.out.println("---------i:"+i+"---j: "+j+"--------");
				int temp = mat[i][j];				
				mat[i][j] = mat[n-1-j][i];
				System.out.println("mat["+(n-1-j)+","+i+"]: "+mat[n-1-j][i]);
				mat[n-1-j][i] = mat[n-1-i][n-1-j];
				System.out.println("mat["+(n-1-i)+","+(n-1-j)+"]: "+mat[n-1-i][n-1-j]);
				mat[n-1-i][n-1-j] = mat[j][n-1-i];
				System.out.println("mat["+(j)+","+(n-1-i)+"]: "+mat[j][n-1-i]);
				mat[j][n-1-i] = temp;
				System.out.println("----------------------------------------");
				for(int l=0; l<mat.length; l++){
					for(int m=0; m<mat[0].length;m++){
						System.out.print(mat[l][m]+"  ");
					}
					System.out.println();
				}
			}
			//System.out.println("After round 1");
			
		}
		
//		for(int i=0; i<mat.length; i++){
//			for(int j=0; j<mat[0].length;j++){
//				System.out.print(mat[i][j]+" ");
//			}
//			System.out.println();
//		}
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
public class RotateMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		System.out.println("Initial matrix");
		for(int l=0; l<mat.length; l++){
			for(int m=0; m<mat[0].length;m++){
				System.out.print(mat[l][m]+"  ");
			}
			System.out.println();
		}
		rotateMatrix(mat);
	}
	
	static void rotateMatrix(int[][] mat){
		int n = mat.length;
		System.out.println("n/2: "+n/2);
		System.out.println("Math.ceil((double) (n)/2): "+Math.ceil((double) (n)/2));
		for(int i=0; i<n/2; i++){
			for(int j=0; j<Math.ceil((double) (n)/2);j++){
				System.out.println("---------i:"+i+"---j: "+j+"--------");
				int temp = mat[i][j];				
				mat[i][j] = mat[n-1-j][i];
				System.out.println("mat["+(n-1-j)+","+i+"]: "+mat[n-1-j][i]);
				mat[n-1-j][i] = mat[n-1-i][n-1-j];
				System.out.println("mat["+(n-1-i)+","+(n-1-j)+"]: "+mat[n-1-i][n-1-j]);
				mat[n-1-i][n-1-j] = mat[j][n-1-i];
				System.out.println("mat["+(j)+","+(n-1-i)+"]: "+mat[j][n-1-i]);
				mat[j][n-1-i] = temp;
				System.out.println("----------------------------------------");
				for(int l=0; l<mat.length; l++){
					for(int m=0; m<mat[0].length;m++){
						System.out.print(mat[l][m]+"  ");
					}
					System.out.println();
				}
			}
			//System.out.println("After round 1");
			
		}
		
//		for(int i=0; i<mat.length; i++){
//			for(int j=0; j<mat[0].length;j++){
//				System.out.print(mat[i][j]+" ");
//			}
//			System.out.println();
//		}
	}

}
>>>>>>> e1183d48c51150798e555e5c155c1abae0f1ee10
