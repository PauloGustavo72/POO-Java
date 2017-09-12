package lista5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.sun.org.apache.xml.internal.utils.Hashtree2Node;

public abstract class CadastrarBanco {

	private static final String caminho = "C:\\Users\\Gustavo\\Desktop\\teste.txt";
	static File file = new File(caminho);
	static File professor = new File("C:\\Users\\Gustavo\\Desktop\\professor.txt");

	public static void leitorAluno() throws IOException {
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

	public static void escritorAluno(String a) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));

		writer.write(a);
		writer.newLine();
		writer.flush();
		writer.close();

	}

	public static void escritorProfessor(String a) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(professor, true));

		writer.write(a);
		writer.newLine();
		writer.flush();
		writer.close();

	}

	public static void leitorProfessor() throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(professor));
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
	
	public static void alteraLinha(String palavraAntiga, String palavraNova) throws IOException {
	    String arquivo = "C:\\Users\\Gustavo\\Desktop\\teste.txt";
	    String arquivoTmp = "C:\\Users\\Gustavo\\Desktop\\teste1.txt";

	    BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoTmp, true));
	    BufferedReader reader = new BufferedReader(new FileReader(arquivo));

	    String linha;
	    while ((linha = reader.readLine()) != null) {
	        if (linha.contains(palavraAntiga)) {
	            linha = linha.replace(palavraAntiga, palavraNova);
	        }
	        writer.write(linha + "\n");
	    }

	    writer.close();        
	    reader.close();

	    new File(arquivo).delete();
	    new File(arquivoTmp).renameTo(new File(arquivo));
	}
}
