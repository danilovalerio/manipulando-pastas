package aplicacao;

import java.io.File;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um caminho que cont�m pasta>");
		String strCaminho = sc.nextLine();
		
		File caminho = new File(strCaminho);
		
		// Cria um vetor que lista os diretorios(pastas) existentes
		//File::isDirectory � respons�vel por encontrar os diret�rios
		File[] diretorios = caminho.listFiles(File::isDirectory);
		System.out.println("Pastas:");
		for(File pasta : diretorios) {
			System.out.println(pasta);
		}
		
		//Lista os arquivos existentes no diret�rio informado pelo usu�rio
		File[] arquivos = caminho.listFiles(File::isFile);
		System.out.println("\nArquivos:");
		for(File arquivo : arquivos) {
			System.out.println(arquivo);
		}
		
		//Criar uma subpasta no caminho informado pelo usu�rio
		boolean sucesso = new File(strCaminho + "\\subdir").mkdir();
		System.out.println("Diret�rio criado com sucesso: "+sucesso);
		
		
		sc.close();
		

	}

}
