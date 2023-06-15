package br.com.unit.aula01;

import java.util.Scanner;

public class AppProducaoFonte {

		public static void main(String[] args) {
			Scanner lerTeclado = new Scanner(System.in);
			
			ProducaoFonte producaoFonte = new ProducaoFonte();
			
			double valorEstoque = 0;
			int estoque = 0;
			
			System.out.println("--------Produção Fonte--------");
			
			System.out.print("Digite o preço do produto....: ");
			double preco = lerTeclado.nextDouble();
			producaoFonte.precoProduto = preco;
			
			System.out.print("Digite o código do produto...: ");
			int codigoProduto = lerTeclado.nextInt();
			producaoFonte.codigo = codigoProduto;
			
			System.out.print("Digite a descrição do produto: ");
			String descricaoProduto = lerTeclado.next();
			producaoFonte.descricao = descricaoProduto;
			
			System.out.print("\n");
			
			for (int i = 1; i <= 3; i++) {
				System.out.print("Insira a quantidade de produto produzida: ");
				int quantidadeProduzida = lerTeclado.nextInt();
				producaoFonte.produtoProduzido(quantidadeProduzida);
			}
			
			for (int i = 1; i <= 2; i++) {
				System.out.print("Insira a quantidade de produto escoado: ");
				int quantidadeEscoada = lerTeclado.nextInt();
				producaoFonte.produtoEscoado(quantidadeEscoada);
			}
			
			System.out.println("O estoque atual é de " + producaoFonte.consultaEstoque() + " produtos");		
			System.out.println("O valor do estoque atual é: R$" + producaoFonte.consultaValorEstoque());
			
			

	}

	
	
}
