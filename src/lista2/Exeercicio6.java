package lista2;

import java.util.Scanner;

public class Exeercicio6 {
	private int valorSemanal = 200;
	private double comissao = 9 / 100;
	
	private Scanner entrada = new Scanner(System.in);
	
	
	public void calcula(){
		double precoVendas = entrada.nextDouble();
		System.out.println("O salario foi de: " + valorSemanal + (precoVendas * comissao) );
	}
}
