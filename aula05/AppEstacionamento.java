package br.com.unit.aula05;

public class AppEstacionamento {

	static Estacionamento  estacionamento;
	
	public static void main(String[] args) {

		estacionamento = new Estacionamento(14, "Park Center", "Recife", 120, 4, 10.00, 3.00);
		mostrarEstacionamento();

		estacionamento.ativar();
		mostrarEstacionamento();

		System.out.println("\nVeículo 1:");
		if (estacionamento.getSituacao().equalsIgnoreCase("Ativado")){
			System.out.println("Valor do estacionamento :" + estacionamento.calcularEstacionamento(4.5));			
		}
		else {
			System.out.println("Estacionamento Desativado");
		}
		
		estacionamento.desativar();
		System.out.println("\nVeículo 2:");
		if (estacionamento.getSituacao().equalsIgnoreCase("Ativado")){
			System.out.println("Valor do estacionamento :" + estacionamento.calcularEstacionamento(7.0));			
		}
		else {
			System.out.println("Estacionamento Desativado");
		}	
	}
	
	public static void mostrarEstacionamento() {
		System.out.println();
		System.out.printf("\nCódigo           : %d", estacionamento.getCodigo());
		System.out.printf("\nNome             : %s", estacionamento.getNome());
		System.out.printf("\nCidade           : %s", estacionamento.getCidade());
		System.out.printf("\nQuant. Vagas     : %d", estacionamento.getQtdeVagas());
		System.out.printf("\nSituação         : %s", estacionamento.getSituacao());
		System.out.printf("\nHoras franquiadas: %d", estacionamento.getHorasFranquiaInicial());
		System.out.printf("\nValor franquiado : %.2f", estacionamento.getValorFranquiaInicial());
		System.out.printf("\nValor adicional  : %.2f", estacionamento.getValorAdicionalHora());
	}
}
