
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int mat1 [][] = { {1,2, 3 }, {4, 5,6}, {2, 3, 1} };// new int[n][n];
		int mat2 [][] = { {1, 2, 1}, {3, 4, 3}, {5, 6, 2} };//new int[n][n];
		int mat3 [][] = new int[n][n];
		
//		for (int i = 0; i < mat1.length; i++) {
//			for (int j = 0; j < mat1.length; j++) {
//				mat1[i][j] = (20)+i;
//			}
//		}
//		for (int i = 0; i < mat2.length; i++) {
//			for (int j = 0; j < mat2.length; j++) {
//				mat2[i][j] = (10)+i;
//			}
//		}
		///ddd 
		for (int i = 0; i < mat2.length; i++) {
			for (int j = 0; j < mat2.length; j++) {
				System.out.print(mat2[i][j] + " ");
			}
			System.out.println("");	
		}
		System.out.println("---------------");
		
		for (int i = 0; i < mat2.length; i++) {
			for (int j = 0; j < mat2.length; j++) {
				System.out.print(mat1[i][j] + " ");
			}
			System.out.println("");	
		}
		
		//----------------------
		
		for (int i = 0; i < mat3.length; i++) {
			int soma =0;
			for (int j = 0; j < mat3.length; j++) {
				soma = mat1[i][j] * mat2[i][j];
				for (int k = 0; k < mat3.length; k++) {
					mat3[i][j] += mat1[i][k] * mat2[k][j];
				}
			}
		}
		System.out.println("---------------------------------");
		for (int i = 0; i < mat3.length; i++) {
			for (int j = 0; j < mat3.length; j++) {
				System.out.print(mat3[i][j] + " ");
			}
			System.out.println("");	
		}
	}
	

}
