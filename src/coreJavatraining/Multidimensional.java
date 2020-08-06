package coreJavatraining;

import java.util.Arrays;

public class Multidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int a[][] = new int[2][3];

		// a[0][0] = 2;
		// a[0][1] = 4;
		// a[0][2] = 5;
		// a[1][0] = 8;
		// a[1][1] = 3;
		// a[1][2] = 7;

		// for (int i = 0; i < a.length; i++) {
		// for (int j = 0; j < a[i].length; j++) {
		// System.out.print(a[i][j] + " ");
		// }
		// System.out.println();
		// }

		// System.out.println("************************");

		int b[][] = { { 2, 4, 5 }, { 3, 8, 7 }, { 5, 2, 1 } };
		int[] arr = new int[9];
		int x = 0;
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + " ");
				int c = b[i][j];
				arr[x] = c;
				x++;
			}
			System.out.println();
		}
		Arrays.sort(arr);
        int y = 0;
		int[] arr2 = new int[b.length];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				if (b[i][j] == arr[0]) {
					y = j;
					int x2 = 0;
					for (int m = 0; m < b.length; m++) {
						int max_colum = b[m][y];
						arr2[x2] = max_colum;
						x2++;
					}
				}
			}
		}
		Arrays.sort(arr2);
		System.out.println("El valor minimo del array es:" + " " + arr[0]);
		System.out.println("La columna es la siguiente:" + " " + y);
		System.out.println("El valor maximo de la columna con el minimo es:" + " " + arr2[arr2.length - 1]);
		// System.out.println("El valor maximo del array es:" + " " +
		// arr[arr.length-1]);
	}
}
