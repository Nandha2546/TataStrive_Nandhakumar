package day11;

public class ReversePyramidPattern {

	public static void main(String[] args) {
		int n = 6;
		int i, j;
		for (i = n; i >= 1; i--) {
			for (j = 1; j <= i; j++) {
				System.out.print(j + "");
			}
			System.out.println();
		}

	}

}
