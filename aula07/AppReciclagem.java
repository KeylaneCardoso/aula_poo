package br.com.unit.aula07;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class AppReciclagem {

	static Scanner lerTeclado = new Scanner(System.in);
	static SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yy");

	static Revista revista = new Revista(1, "SQL Magazine");
	
	public static void main(String[] args) {
		
		//System.out.println(revista);

		Date data;
		do {
			try {
				System.out.print("Data: ");
				String dataString = lerTeclado.nextLine();
				// Criticas para data válida
				data = formatoData.parse(dataString);													
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println("Data inválida");
				continue;
			}
			break;
		} while (true);
		
		System.out.println(formatoData.format(data));

		

		revista.adicionarEdicao(data, 1000,  800);
		revista.adicionarEdicao(900,  900);
		revista.adicionarEdicao(data, 1200, 1000);

		mostrarEdicoes();
		
		/*
		System.out.println(revista.reciclarEdicao(53));
		mostrarEdicao(53);

		System.out.println(revista.reciclarEdicao(54));
		mostrarEdicao(54);

		System.out.println(revista.reciclarEdicao(54));
		mostrarEdicao(54);

		System.out.println(revista.reciclarEdicao(99));
		mostrarEdicao(99);
		*/
	}
	
	private static void mostrarEdicoes() {
		for (Edicao edicao: revista.getListaEdicoes()) {
			System.out.println(edicao);
		}
	}

	private static void mostrarEdicao(int id) {
		for (Edicao edicao: revista.getListaEdicoes()) {
			if (edicao.getNumero() == id) {
				System.out.println(edicao);
			}
		}
	}
}
