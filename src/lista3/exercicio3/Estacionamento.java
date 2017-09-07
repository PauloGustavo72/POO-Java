package lista3.exercicio3;

import java.util.Scanner;

public class Estacionamento {
	Scanner scanner;
	
	public void calculaEstacionamento(double tempo){
		double valor = 2;
		if(tempo > 3 && tempo < 4){
			valor += 0.50;
		}
		else if(tempo > 3){
			valor += (int) (tempo - 3);
		}
		
		System.out.println("Tempo estacionado: " + tempo + " minutos.\n"
				+ "Valor: " + valor + " reais.");
	}
	
	
	
}
