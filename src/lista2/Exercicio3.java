package lista2;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {
	Scanner entrada = new Scanner(System.in);
	ArrayList<Integer> numero = new ArrayList();
	
	
	public ArrayList<Integer> getNumero(){
		int a = 0;
		for (int i = 0; i < 5; i++) {
			a = entrada.nextInt();
			numero.add(a);
		}
		
		return numero;
	}
	
	public void getMaiorEMenor(){
		int x = 0, z = numero.get(0);
		for (int i = 0; i < numero.size(); i++) {
			if(numero.get(i) > x){
				x = numero.get(i);
			}
			if(numero.get(i) < z){
				z = numero.get(i);
			}
		}
		System.out.println("o maior numero é: " + x);
		System.out.println("o menor numero é: " + z);
	}


	public void executa(){
		getNumero();
		getMaiorEMenor();
		
	}
}
