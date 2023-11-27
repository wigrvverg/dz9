package by.simpelestapp.main.dz10;

public class Main14 {

	public static void main(String[] args) {
		int[][] mas = new int[6][6];
		int k = 1;
		int z = 1;

		for (int i = 0; i < mas.length; i++) {
			mas[i][mas[i].length - k] = z;
			k++;
			z++;
			for (int j = 0; j < mas[i].length; j++) {

			}

		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();

		}

	}

}
