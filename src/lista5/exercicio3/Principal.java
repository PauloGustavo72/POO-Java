package lista5.exercicio3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		VerificaTriangulo vf = new VerificaTriangulo();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int a = entrada.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int b = entrada.nextInt();
		
		System.out.println("Digite o terceiro numero: ");
		int c = entrada.nextInt();
		
		vf.verificaHipotenusa(a, b, c);
	}

}
