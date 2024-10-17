package day11;

public class ZeroOneTriangle {
	public static void main(String[] args) {
		int n = 6;
		int i, j;
		for (i = 0; i <= n; i++) {
			for (j = 0; j <= i; j++) {
				if ((i + j) % 2 == 0) {
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}
	}

}
