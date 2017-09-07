package lista2;

import java.util.ArrayList;

public class Exercicio8 {
	
	ArrayList<Integer> lista = new ArrayList<>();
	
	
	
	public void fazTudo(int a){
		retornaListaNumero(a);
		
	}
	
	public void retornaListaNumero(int a){
		String c = Integer.toString(a);
		int aux = 0;
		for (int i = 0; i < c.length(); i++) {
			aux = (Integer.parseInt(c) + 7) % 10;
			lista.add(Integer.parseInt(c));
			
		}
		
		
	}
	
	
	
	

	
	
	
	
}

