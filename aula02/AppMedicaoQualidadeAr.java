package br.com.unit.aula02;

import java.util.Scanner;
public class AppMedicaoQualidadeAr {

	public static void main(String[] args) {
		Scanner lerTeclado = new Scanner(System.in);

		MedicaoQualidadeAr medicaoQualidadeAr = new MedicaoQualidadeAr();

		System.out.println("---Medicão da Qualidade do Ar---\n");
		System.out.print("Insira o código da medição: ");
		int codigo = lerTeclado.nextInt();
		medicaoQualidadeAr.setIdMedicao(codigo);				
		System.out.print("Insira índice atual do ar.: ");
		int indiceAr = lerTeclado.nextInt();
		medicaoQualidadeAr.setIndice(indiceAr);				
		
		System.out.printf("\nA classificação da medição (%d) é: %s", medicaoQualidadeAr.getIdMedicao(), medicaoQualidadeAr.definirClassificacao());
		
		System.out.print("\nInsira o novo índice do ar.: ");
		int novoIndice = lerTeclado.nextInt();
		medicaoQualidadeAr.setIndice(novoIndice);
		
		System.out.printf("\nA nova classificação do ar é: %s", medicaoQualidadeAr.definirClassificacao());
		
		
	}
}
