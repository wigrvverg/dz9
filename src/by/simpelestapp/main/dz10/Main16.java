package by.simpelestapp.main.dz10;

public class Main16 {
	public static void main(String[] args) {
		int[][] mas = new int[6][6];
	
		int z = 1;
		int k=z+1;

		for (int i = 0; i < mas.length; i++) {
			mas[i][i] = z*k;
			z++;
			k++;
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
