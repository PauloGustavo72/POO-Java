package lista2;

public class Exercicio2 {
	
	public void Ex2(int a, int b){
		System.out.println(a + b);
		media(a, b);
		ordemCrescente(a, b);
		
	}
	
	public void media(int a, int b){
		System.out.println((a + b) / 2);
	}
	
	public void ordemCrescente(int a, int b){
		if(a > b){
			System.out.print(a);
			System.out.print(b);
		}
		else{
			System.out.print(b);
			System.out.print(a);
		}
	}

}
