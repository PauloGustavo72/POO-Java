package lista3.exercicio2;

import java.util.Scanner;

public class Produto {
		private Scanner scanner;
		private int qtdade;
		private int codigoProduto;
		private double total = 0;
		
		private double p1 =1;
		private double p2 = 2.98;
		private double p3 = 9.98;
		private double p4 = 4.49;
		private double p5 = 6.87;
		
		public void retornaTudo(){
			scanner = new Scanner(System.in);
			System.out.println("Quantos produtos foram vendidos?");
			int totalVendas = scanner.nextInt();
			
			for (int i = 0; i < totalVendas; i++) {
				System.out.println("Qual o codigo do produto?");
				codigoProduto = scanner.nextInt();
				System.out.println("Qual a quantidade?");
				qtdade = scanner.nextInt();
				calculaVenda(codigoProduto, qtdade);
			}
			
			System.out.println("foi vendido " + total + "em produtos.");
		}
		
		private double calculaVenda( int codProduto, int qtdadeProduto){
			if(codProduto == 1)
				total += qtdadeProduto * p1;
			else if(codProduto == 2)
				total += qtdadeProduto * p2;
			else if(codProduto == 3)
				total += qtdadeProduto * p3;
			else if(codProduto == 4)
				total += qtdadeProduto * p4;
			else if(codProduto == 5)
				total += qtdadeProduto * p5;
				
			return total;
		}
}
