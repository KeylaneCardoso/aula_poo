package br.com.unit.aula03;

public class Fonte {
	
	private int codigo;
	private String descricao;
	private int estoque;
	private double precoCusto;
	
	public String getDescricao() {
		return descricao;
	}	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getPrecoCusto() {
		return precoCusto;
	}
	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public int getEstoque() {
		return estoque;
	}

	public Fonte(int codigo, String descricao, double precoCusto){

		this.codigo = codigo;
		this.descricao = descricao;
		this.precoCusto = precoCusto;
	}
	
	public void registrarProducao(int quantProduzida) {
		estoque += quantProduzida;
	}
	
	public boolean registrarEscoamento(int quantEscoada) {		
		if (quantEscoada > estoque){
			return true;		
		} else {
			return false;
			}
		
	}

	public double obterValorEstoque() {
		return estoque * precoCusto;
	}	
}

