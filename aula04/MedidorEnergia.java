package br.com.unit.aula04;

public class MedidorEnergia {
	
	private int idMedidor;
	private String nrSerie;
	private char tipoUcInstalado;
	private int leituraAnterior;
	private int leituraAtual;
	private int consumo;
	private double valorConta;
	
	public int getIdMedidor() {
		return idMedidor;
	}	
	
	public String getNrSerie() {
		return nrSerie;
	}
	
	public char getTipoUcInstalado() {
		return tipoUcInstalado;
	}
	public void setTipoUcInstalado(char tipoUcInstalado) {
		this.tipoUcInstalado = tipoUcInstalado;
	}
	
	public int getLeituraAnterior() {
		return leituraAnterior;
	}
	public void setLeituraAnterior(int leituraAnterior) {
		this.leituraAnterior = leituraAnterior;
	}
	
	public int getLeituraAtual() {
		return leituraAtual;
	}
	public void setLeituraAtual(int leituraAtual) {
		this.leituraAtual = leituraAtual;
	}
	
	public int getConsumo() {
		return consumo;
	}	
	
	public double getValorConta() {
		return valorConta;
	}	
	
	public MedidorEnergia(int idMedidor, String nrSerie, char tipoUcInstalado, int leituraAtual) {
		this.idMedidor = idMedidor;
		this.nrSerie = nrSerie;
		this.tipoUcInstalado = tipoUcInstalado;
		this.leituraAtual = leituraAtual;
	}
	
	public void registrarLeitura(int leitura) {
		
		leituraAnterior = leituraAtual;
		leituraAtual = leitura;		
		consumo = leituraAtual - leituraAnterior;
		calcularConta();
		
	}
	
	private void calcularConta() {
		if(tipoUcInstalado == 'C' ) {
			valorConta = consumo * 0.70;
		}
		else if(tipoUcInstalado == 'I') {
			valorConta = consumo * 0.50;
		}
		else if(tipoUcInstalado == 'R')
			valorConta = consumo * 0.60;
		}
}
