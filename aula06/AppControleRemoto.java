package br.com.unit.aula06;

public class AppControleRemoto {

	static ControleRemoto controleRemoto;
	
	public static void main(String[] args) {
		
		controleRemoto = new ControleRemoto(123, "Novo", 10, 30);
		mostrarDadosControle();
		
		controleRemoto.ligarDesligar();
		System.out.println("\n\nO ventilador esta ligado? " + controleRemoto.isLigado());
		System.out.printf("Temperatura atual: %d", controleRemoto.getTemperaturaAtual());
		System.out.printf("\nVelocidade atual.: %d", controleRemoto.getVelocidade());
		
		System.out.println(" ");
		
		aumentarTemperatura();
		
		ajustarVelocidade();
		
		System.out.println(" ");
		
		diminuirTemperatura();
		
		controleRemoto.ligarDesligar();
		
		if (controleRemoto.getTemperaturaAtual() == 0) {
			System.out.println("\nEquipamento desligado!!");
		}
			else {
				System.out.printf("\nTemperatura atual: %d", controleRemoto.getTemperaturaAtual());
			}
	}
	
	public static void mostrarDadosControle() {
		System.out.print("----------DADOS AR CONDICIONADO----------");
		System.out.printf("\nCódigo............: %d", controleRemoto.getIdControle());
		System.out.printf("\nModelo............: %s", controleRemoto.getModelo());
		System.out.printf("\nTemperatura minima: %d", controleRemoto.getTemperaturaMinima());
		System.out.printf("\nTemperatura maxima: %d", controleRemoto.getTemperaturaMaxima());
		System.out.println("\n-----------------------------------------");
	}
	
	public static void aumentarTemperatura() {		
		System.out.print("\n----------AUMENTAR TEMPERATURA----------");
		for(int i = 1; i <= 6; i++ ) {		
			if(controleRemoto.aumentarTemperatura(4) == true) {
				System.out.printf("\nTemperatura atual: %d", controleRemoto.getTemperaturaAtual());			
			}
			else {
				System.out.println("\n\nCondicionador de ar já está na temperatura máxima!!");
			}
		}
		System.out.println("-----------------------------------------");
	}
	
	public static void ajustarVelocidade() {
		System.out.print("\n----------AJUSTAR VELOCIDADE----------");
		for (int i = 1; i <= 5; i++) {
			controleRemoto.ajustarVelocidade();
			System.out.printf("\nVelocidade atual: %d ", controleRemoto.getVelocidade());			
		}
		System.out.println("\n-----------------------------------------");
	}
	
	public static void diminuirTemperatura() {		
		System.out.print("\n----------DIMINUIR TEMPERATURA----------");
		for(int i = 1; i <= 6; i++ ) {		
			if(controleRemoto.diminuirTemperatura(4) == true) {
				System.out.printf("\nTemperatura atual: %d", controleRemoto.getTemperaturaAtual());			
			}
			else {
				System.out.println("\n\nCondicionador de ar já está na temperatura minima!!");
			}
		}
		System.out.println("-----------------------------------------");
	}
}
