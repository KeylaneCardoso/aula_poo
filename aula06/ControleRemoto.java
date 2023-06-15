package br.com.unit.aula06;

public class ControleRemoto {
	
	private int idControle;
	private String modelo;
	private int temperaturaMinima;
	private int temperaturaMaxima;
	private int temperaturaAtual;
	private int velocidade;
	private boolean ligado;
	
	public ControleRemoto(int idControle, String modelo,
			              int temperaturaMinima, int temperaturaMaxima) {
		
		this.idControle = idControle;
		this.modelo = modelo;
		this.temperaturaMinima = temperaturaMinima;
		this.temperaturaMaxima = temperaturaMaxima;
	}
	
	public void ligarDesligar() {
		if (ligado == false) {
			ligado = true;
			temperaturaAtual = (temperaturaMaxima - temperaturaMinima)/2;
			velocidade = 1;
		}
			else {
			ligado = false;
			temperaturaAtual = 0;
			}
	}
	
	public boolean diminuirTemperatura(int temperatura) {
		boolean aprovado = false;

		if(temperaturaAtual > temperaturaMinima) {
			temperaturaAtual = temperaturaAtual - temperatura;
			aprovado = true;
		}
			else {
			aprovado = false;
			}
		return aprovado;
	}
	
	public boolean aumentarTemperatura(int temperatura) {
		boolean aprovado = false;
		
		if(temperaturaAtual < temperaturaMaxima) {
			temperaturaAtual = temperaturaAtual + temperatura;
			aprovado = true;
		}
			else {
			aprovado = false;
			}
		return aprovado;
	}
		
	public void ajustarVelocidade() {
		velocidade ++;
		if(velocidade >= 4) {
			velocidade = 1;
		}		
	}
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
		
	public int getTemperaturaMinima() {
		return temperaturaMinima;
	}
	public void setTemperaturaMinima(int temperaturaMinima) {
		this.temperaturaMinima = temperaturaMinima;
	}
		
	public int getTemperaturaMaxima() {
		return temperaturaMaxima;
	}
	public void setTemperaturaMaxima(int temperaturaMaxima) {
		this.temperaturaMaxima = temperaturaMaxima;
	}	
	
	public int getIdControle() {
		return idControle;
	}	
	
	public int getTemperaturaAtual() {
		return temperaturaAtual;
	}	
	
	public int getVelocidade() {
		return velocidade;
	}
	
	public boolean isLigado() {
		return ligado;
	}	
}
