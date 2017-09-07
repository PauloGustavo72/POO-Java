package lista2;

import java.util.Scanner;

public class Exercicio7 {
	private Scanner entrada = new Scanner(System.in);
	private double horasTrabalhada;
	private double valorDaHora;
	private double salarioBruto = 1000;
	
	public void calculaSalario(){
		System.out.println("Digite quantidade de horas trabalhadas: ");
		horasTrabalhada = entrada.nextDouble();
		System.out.println("Digite o valor da hora");
		valorDaHora = entrada.nextDouble();
		
		if(horasTrabalhada > 40){
			salarioBruto +=( ( horasTrabalhada - 40) * (valorDaHora / 2) );
		}
		
		System.out.println("salario bruto: " + salarioBruto);
		
		
	}

}
