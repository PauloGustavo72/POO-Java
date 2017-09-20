package lista5.exercicio3;

public class VerificaTriangulo {
	
	public void verificaHipotenusa(int a, int b, int c){
		if(a > b && a > c) {
			if(a*a == b*b + c*c)
				System.out.println("Triangulo retangulo");
			else
				System.out.println("Não é triangulo retângulo");
		}else if(b > a && b > c) {
			if(b*b == a*a + c*c)
				System.out.println("Triangulo retangulo");
			else
				System.out.println("Não é triangulo retângulo");
		}else if(c > a && c > b) {
			if(c*c == a*a + b*b)
				System.out.println("Triangulo retangulo");
			else
				System.out.println("Não é triangulo retângulo");
		}else {
			System.out.println("não ha possibilidade de ser triangulo retangulo.");
		}
	}

}
