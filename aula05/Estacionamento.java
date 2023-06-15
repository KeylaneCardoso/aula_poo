package br.com.unit.aula05;

public class Estacionamento {
	
	int codigo;
	String nome;
	String cidade;
	int qtdeVagas;
	String situacao;
	int horasFranquiaInicial;
	double valorFranquiaInicial;
	double valorAdicionalHora;
	
	public Estacionamento(int codigo, String nome, String cidade, int qtdeVagas,
			int horasFranquiaInicial, double valorFranquiaInicial, double valorAdicionalHora) {
		
		this.codigo = codigo;
		this.nome = nome;
		this.cidade = cidade;
		this.qtdeVagas = qtdeVagas;
		this.horasFranquiaInicial = horasFranquiaInicial;
		this.valorFranquiaInicial = valorFranquiaInicial;
		this.valorAdicionalHora = valorAdicionalHora;
		situacao = "Desativado";
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public int getQtdeVagas() {
		return qtdeVagas;
	}
	
	public String getSituacao() {
		return situacao;
	}
	
	public int getHorasFranquiaInicial() {
		return horasFranquiaInicial;
	}
	
	public double getValorFranquiaInicial() {
		return valorFranquiaInicial;
	}
	
	public double getValorAdicionalHora() {
		return valorAdicionalHora;
	}
	
	public void ativar() {
		situacao = "Ativado";
	}
	
	public void desativar() {
		situacao = "Desativado";
	}
	
	public double calcularEstacionamento(double horas) {
		double valorEstacionamento = 0;
		double tempoPermanencia = 0;
		
		if(situacao.equalsIgnoreCase("Ativado")) {
			tempoPermanencia = Math.ceil(horas);
			if(tempoPermanencia <= horasFranquiaInicial) {
				valorEstacionamento = valorFranquiaInicial;
			}
			else {
				valorEstacionamento = ((tempoPermanencia - horasFranquiaInicial) * valorAdicionalHora) + valorFranquiaInicial ;
			}			
		}
		return valorEstacionamento;
	}
}
