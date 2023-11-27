package by.simpelestapp.main.dz10;

public class Main15 {
	public static void main(String[] args) {
		int[][] mas = new int[6][6];
	
		int z = 6;

		for (int i = 0; i < mas.length; i++) {
			mas[i][i] = z;
			
			z--;
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
