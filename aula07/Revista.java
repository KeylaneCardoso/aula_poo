package br.com.unit.aula07;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Revista {

	private int codigo;
	private String titulo;
	private int reciclagemProduzida;
	private List<Edicao> listaEdicoes;
	
	public Revista(int codigo, String titulo) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.reciclagemProduzida = 0;
		this.listaEdicoes = new ArrayList<Edicao>();
	}
	
	public boolean adicionarEdicao(Date data, int tiragem, int qtdeVendida) {
		//Edicao edicaoEncontrada = pesquisarEdicaoPorId(nrEdicao);
		//if (edicaoEncontrada == null) {
			listaEdicoes.add(new Edicao(data, tiragem, qtdeVendida));
			return true;
		//}
		//return false;
	}
	
	public boolean adicionarEdicao(int tiragem, int qtdeVendida) {
		//Edicao edicaoEncontrada = pesquisarEdicaoPorId(nrEdicao);
		//if (edicaoEncontrada == null) {
			listaEdicoes.add(new Edicao(tiragem, qtdeVendida));
			return true;
		//}
		//return false;
	}

	public boolean removerEdicao(Edicao edicao) {
		Edicao edicaoEncontrada = pesquisarEdicaoPorId(edicao.getNumero());
		if (edicaoEncontrada != null) {
			listaEdicoes.remove(edicao);
			return true;
		}
		return false;
	}
	
	public String reciclarEdicao(int nrEdicao) {
		Edicao edicaoEncontrada = pesquisarEdicaoPorId(nrEdicao);
		if (edicaoEncontrada == null) {
			return "Edição não encontrada";
		}
		else if (edicaoEncontrada.obterQtdeReciclagem()==0) {
			return "Não houve exemplares para reciclar";			
		}
		else if (edicaoEncontrada.isReciclou()) {
			return "Edição já reciclada";
		}
		else {
			this.reciclagemProduzida+=edicaoEncontrada.obterQtdeReciclagem();
			edicaoEncontrada.reciclarExemplares();
			return "Reciclagem realizada";
		}
	}

	private Edicao pesquisarEdicaoPorId(int nrEdicao) {
		for (Edicao edicao: listaEdicoes) {
			if (edicao.getNumero() == nrEdicao) {
				return edicao;
			}
		}
		return null;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getCodigo() {
		return codigo;
	}

	public int getReciclagemProduzida() {
		return reciclagemProduzida;
	}

	public List<Edicao> getListaEdicoes() {
		return listaEdicoes;
	}

	@Override
	public String toString() {
		return "Revista [Código: " + codigo + ", titulo: " + titulo + ", reciclagemProduzida: "
				+ reciclagemProduzida + ", listaEdicoes: " + listaEdicoes + "]";
	}
}
