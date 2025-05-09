public class Matrix {

	public static void main(String[] args) {
		int[][] matrix = {
				{1,0,1},
				{1,1,0},
				{0,0,1}
		};
		int count=0;
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix.length;j++) {
				if(i!=j)
					matrix[i][j]=0;
					count=1;
				else 
					count=0;
			}
		}
		if(count==1) {
			System.out.println("It is not a diagonal matrix");
		}
		else {
			System.out.println("It is a diagonal matrix"); 
		}
	}

}
