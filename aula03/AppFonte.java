package br.com.unit.aula03;

import java.util.Scanner;
public class AppFonte {
	
	static Fonte[] vetorFontes = new Fonte[3];

	public static void main(String[] args) {
		Scanner lerTeclado = new Scanner(System.in);
			
		for (int i = 0; i < vetorFontes.length; i++) {
			System.out.printf("\n---- CADASTRO %dº FONTE ----", i+1);

			int codigo;
			do {
				System.out.print("\nCódigo........: ");
				codigo = lerTeclado.nextInt();
				if (codigo <= 0) {
					System.out.print("Código invalido digite novamente!");
					continue;
				} else {
					break;
					}			
			} while (true);	
			
			lerTeclado.nextLine();
			System.out.print("Descrição.....: ");
			String descricao = lerTeclado.nextLine();
		
			double preco;
			do {
				System.out.print("Preço de Custo: ");
				preco = lerTeclado.nextDouble();	
				if (preco <= 0) {
					System.out.print("Preço invalido digite novamente!\n");
					continue;
				} else {
					break;
					}			
			} while (true);	
			
			Fonte fonte = new Fonte(codigo, descricao, preco);

			vetorFontes[i] = fonte;			
		}
		
		for (int i = 0; i < vetorFontes.length; i++) {
		System.out.printf("\n\n---- DADOS %dº FONTE ----", i+1);
		System.out.printf("\nCódigo........: %d", vetorFontes[i].getCodigo());
		System.out.printf("\nDescrição.....: %s", vetorFontes[i].getDescricao());
		System.out.printf("\nPreço de Custo: %.2f", vetorFontes[i].getPrecoCusto());		
		}	
	}
}
