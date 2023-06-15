package br.com.unit.aula07;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Edicao {
	
	static private int contEdicao = 52;
	
	private int numero;
	private Date data;
	private int tiragem;
	private int qtdeVendida;
	private boolean reciclou;

	public Edicao(Date data, int tiragem, int qtdeVendida) {
		super();
		this.numero = ++contEdicao;
		this.data = data;
		this.tiragem = tiragem;
		this.qtdeVendida = qtdeVendida;
		this.reciclou = false;
	}
	
	public Edicao(int tiragem, int qtdeVendida) {
		super();
		this.numero = ++contEdicao;
		this.data = new Date();
		this.tiragem = tiragem;
		this.qtdeVendida = qtdeVendida;
		this.reciclou = false;
	}

	public Edicao() {	
	}
	
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getTiragem() {
		return tiragem;
	}

	public void setTiragem(int tiragem) {
		this.tiragem = tiragem;
	}

	public int getQtdeVendida() {
		return qtdeVendida;
	}

	public void setQtdeVendida(int qtdeVendida) {
		this.qtdeVendida = qtdeVendida;
	}

	public int getNumero() {
		return numero;
	}

	public boolean isReciclou() {
		return reciclou;
	}

	public void reciclarExemplares() {
		this.reciclou = true;
	}
	
	public int obterQtdeReciclagem() {
		return this.tiragem - this.qtdeVendida;
	}

	@Override
	public String toString() {
		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yy");
		return "Edicao "+
	           "\n[numero: " + numero + 
	           "\n data: " + formatoData.format(data) + 
	           "\n tiragem: " + tiragem + 
	           "\n qtdeVendida: " + qtdeVendida + 
	           "\n reciclou: " + reciclou + "]";
	}
}
