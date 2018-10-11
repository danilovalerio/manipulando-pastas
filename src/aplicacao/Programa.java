package aplicacao;

import java.io.File;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um caminho que contém pasta>");
		String strCaminho = sc.nextLine();
		
		File caminho = new File(strCaminho);
		
		// Cria um vetor que lista os diretorios(pastas) existentes
		//File::isDirectory é responsável por encontrar os diretórios
		File[] diretorios = caminho.listFiles(File::isDirectory);
		System.out.println("Pastas:");
		for(File pasta : diretorios) {
			System.out.println(pasta);
		}
		
		//Lista os arquivos existentes no diretório informado pelo usuário
		File[] arquivos = caminho.listFiles(File::isFile);
		System.out.println("\nArquivos:");
		for(File arquivo : arquivos) {
			System.out.println(arquivo);
		}
		
		//Criar uma subpasta no caminho informado pelo usuário
		boolean sucesso = new File(strCaminho + "\\subdir").mkdir();
		System.out.println("Diretório criado com sucesso: "+sucesso);
		
		
		sc.close();
		

	}

}
