
public class TwoDimensionDemo {
	public static void main(String args[]) {
//		int[][] matrixA;
//		matrixA = new int[4][2];
		int[][] matrixA = new int[4][2];
		
		matrixA[0][0] = 1;
		matrixA[0][1] = 2;
		matrixA[1][0] = 3;
		matrixA[1][1] = 4;
		matrixA[2][0] = 5;
		matrixA[2][1] = 6;
		matrixA[3][0] = 7;
		matrixA[3][1] = 8;
	
		for(int i=0;i<matrixA.length;i++) {
			for(int j=0;j<matrixA[i].length;j++) {
				System.out.print(matrixA[i][j] + "\t");
			}
			System.out.println();
		}
		
		int[][] matrixB = {{10,20},{30,40},{50,60}};
		
		int[][] irr2D = new int[3][];
		irr2D[0] = new int[5];
		irr2D[1] = new int[1];
		irr2D[2] = new int[3];
		
		Object obj = matrixA;
		int[] mat1 = matrixA[2];
		System.out.println(mat1[0]);
		System.out.println(mat1[1]);
	}
}
