package lista2;

public class Contas {
	
	public void executa(int a, int b){
		soma(a, b);
		subtracao(a, b);
		multi(a, b);
		div(a, b);
	}
	
	public void soma(int a, int b){
		 System.out.println(a + b);
	}
	
	public  void subtracao(int a, int b){
		System.out.println(a-b);
	}
	
	public void multi(int a, int b){
		System.out.println(a* b);
	}
	
	public void div(int a, int b){
		System.out.println(a / b);
	}

}
