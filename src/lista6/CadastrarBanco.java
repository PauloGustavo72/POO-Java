package lista6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.sun.org.apache.xml.internal.utils.Hashtree2Node;

public abstract class CadastrarBanco {

	private static final String caminho = "/home/guh72/Github/POO-Java/teste.txt";
	static File file = new File(caminho);
	

	public static void leitor() throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(caminho));
		String linha = "";
		while (true) {
			if (linha != null) {
				System.out.println(linha);

			} else
				break;
			linha = buffRead.readLine();
		}
		buffRead.close();
	}

	public static void escritor(String a, int quantidade) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));

		writer.write(a);
		writer.write("\t\t" + quantidade);
		writer.newLine();
		writer.flush();
		writer.close();

	}

	
}
