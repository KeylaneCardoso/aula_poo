package br.com.unit.aula01;

public class ProducaoFonte {

	double precoProduto;
	int estoque;
	String descricao;
	int codigo;
	double valorEstoque;

	void cadastroFonte(int codigo, String descricao, double precoProduto) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.precoProduto = precoProduto;
	}
	
	void produtoProduzido(int quantidadeProduzida) {
		estoque = estoque + quantidadeProduzida;
		valorEstoque = valorEstoque + (precoProduto * quantidadeProduzida);
	}
	
	void produtoEscoado(int quantidadeEscoada) {
		estoque = estoque - quantidadeEscoada;
		valorEstoque = valorEstoque - (precoProduto * quantidadeEscoada);
	}
	
	int consultaEstoque() {
		return estoque;
	}
	
	double consultaValorEstoque() {
		return valorEstoque;
	}
}
