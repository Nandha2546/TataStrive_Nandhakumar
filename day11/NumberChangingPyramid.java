package day11;

public class NumberChangingPyramid {
	public static void main(String[] args) {
		int n = 6;
		int i, j;
		int num = 1;

		for (i = 1; i <= n; i++) {

			for (j = 1; j <= i; j++) {

				System.out.print(num + " ");

				num++;
			}

			System.out.println();
		}
	}

}
