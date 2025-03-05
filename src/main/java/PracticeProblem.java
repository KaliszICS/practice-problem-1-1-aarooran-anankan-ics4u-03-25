public class PracticeProblem {

	public static void main(String args[]) {}

	public static int sum2D(int[][] intArray2D2) {
		int sum = 0;

		for (int row=0; row<intArray2D2.length; row++){
			for (int col=0; col<intArray2D2[row].length; col++) {
				sum = sum + intArray2D2[row][col];
			}
		}

		return sum;
	}

	public static int sumRow(int[][] intArr2D, int row) {
		int sum = 0;

		for (int col=0; col<intArr2D[row].length; col++) {
			sum = sum + intArr2D[row][col];
		}

		return sum;
	}

	public static int sumColumn(int[][] intArr2D, int col) {
		int sum = 0;

		for (int row=0; row<intArr2D.length; row++) {
			sum = sum + intArr2D[row][col];
		}

		return sum;
	}

}
