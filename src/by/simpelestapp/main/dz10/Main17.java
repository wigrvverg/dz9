package by.simpelestapp.main.dz10;

public class Main17 {
	public static void main(String[] args) {
		int[][] mas = new int[6][6];
		

		for (int i = 0; i < mas.length; i++) {
			
			for (int j = 0; j < mas[i].length; j++) {
				mas[0][j]=1;
				mas[i][0]=1;
				mas[mas[i].length-1][j]=1;
				mas[i][mas.length-1]=1;
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
