package lista5.exercicio2;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		int l = 0, l2, l3, l4;
		Scanner input = new Scanner(System.in);
		while (l < 1 || l > 20) {
			System.out
					.print("Informe o lado do quadrado (comprimento de 1 a 20): ");
			l = input.nextInt();
		}
		l2 = l;
		l3 = l;
		l4 = l;
		while (l2 != 0) {
			System.out.print("*");
			--l2;
		}
		while (l3 != 1) {
			System.out.print("\n*");
			if (l3 != 2) {
				for (int i = 0; i < l - 2; i++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			--l3;
		}
		while (l4 != 1) {
			System.out.print("*");
			--l4;
		}
		System.out.println();
	}

}
