package br.com.unit.aula04;

public class AppMedidorEnergia {

	public static void main(String[] args) {
		MedidorEnergia medidorEnergia = new MedidorEnergia(11, "ljm", 'C', 56);
	
		medidorEnergia.registrarLeitura(456);
		
		System.out.printf("\nConsumo: %d", medidorEnergia.getConsumo());
		System.out.printf("\nValor conta: %.2f", medidorEnergia.getValorConta());
	
	}
}
