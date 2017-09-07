package lista3.exercicio5;

import java.util.ArrayList;

public class Primo {
	
	ArrayList<Integer> lista = new ArrayList<>();
	
	
	public void retornPrimo(){
		calculaPrimo();
		imprimiPrimos(lista);
	}


	private ArrayList<Integer> calculaPrimo() {
		
		for (int i = 2; i < 1001; i++) {
			int aux = 0;
			for (int j = 1; j <= i; j++) {
				if(i % j == 0)
					aux++;
				
			}
			if(aux == 2)
				lista.add(i);
		}
		return lista;
	}
	
	private void imprimiPrimos(ArrayList<Integer> a){
		for (int i = 0; i < lista.size(); i++) {
			System.out.print(lista.get(i) + ", ");
			
		}
	}
}
