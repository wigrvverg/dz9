package by.simpelestapp.main.dz10;

public class Main13 {

	public static void main(String[] args) {

		int mas[][] = new int[6][6];

		for (int i = 0; i < mas.length; i++) {
			if (i % 2 == 0) {

				for (int j = 0; j < mas[i].length; j++) {
					mas[i][j] = j + 1;
				}
			}

			else {

				for (int j = 0; j < mas[i].length; j++) {
					mas[i][j] = mas[i].length - j;
				}
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

