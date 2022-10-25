package pacote;

import java.util.Scanner;
public class AppFrequenciaAlunos {
	
	static int[] dias = new int[5]; 

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
				
		System.out.println   ("-------------- Frequência Alunos --------------");		
		for (int i = 0; i < dias.length; i++) {
			System.out.printf("Insira a quantidade de alunos que vieram no %dº: ", i+1);
			dias[i] = teclado.nextInt();			
		}		
		System.out.println("\n------------ Resultados ------------");		
		System.out.printf("\nFrequencia total.........: %d", acharTotalFrequencia());
		System.out.printf("\nMedia das frequencias....: %.1f", mediaFrequencia());
		System.out.printf("\nMaior frequencia.........: %d", maiorFrequencia());
		System.out.printf("\nMenor frequencia.........: %d", menorFrequencia());
		System.out.printf("\nDia como maior frequencia: %d", diaMaiorFrequencia()+1);
		System.out.printf("\nDia como menor frequencia: %d", diaMenorFrequencia()+1);	
		System.out.printf("\nPercentual da diferença entre a maior e a menor frequência: %.2f%s", acharPercentualDiferenca(), "%");		
		System.out.printf("\nQuantidade de dias com frequência acima da média..........: %d", acharFrequenciaAcimaMedia());		
		System.out.printf("\nQuantidade de frequência pares............................: %d", acharFrequenciaPar());				
	}
	
	public static int acharTotalFrequencia() {
		int total = 0;
		for (int i = 0; i < dias.length; i++) {
			total += dias[i];			
		}
		return total;
	}	
	
	public static double mediaFrequencia() {
		return (double) acharTotalFrequencia()/dias.length;		
	}	
	
	public static int maiorFrequencia() {
		int maiorF = Integer.MIN_VALUE;	
		for (int i = 0; i < dias.length; i++) {
			if (dias[i] > maiorF) {
				maiorF = dias[i];
			}
		}		
		return maiorF;
	}
	
	public static int menorFrequencia() {
		int menorF = Integer.MAX_VALUE;		
		for (int i = 0; i < dias.length; i++) {
			if (dias[i] < menorF) {
				menorF = dias[i];
			}
		}		
		return menorF;
	}
	
	public static int diaMaiorFrequencia() {
		int maiorF = dias[0];
		int maiorDia = -1;
		for (int i = 0; i < dias.length; i++) {
			if (dias[i] > maiorF) {
				maiorF = dias[i];
				maiorDia = i;
			}
		}		
		return maiorDia;
	}
	
	public static int diaMenorFrequencia() {
		int menorF = dias[0];
		int menorDia = -1;
		for (int i = 0; i < dias.length; i++) {
			if (dias[i] < menorF) {
				menorF = dias[i];
				menorDia = i;
			}
		}		
		return menorDia;
	}
	
	public static double acharPercentualDiferenca() {		
		return (double) (maiorFrequencia() - menorFrequencia()) / maiorFrequencia() * 100;	
	}
		
	public static int acharFrequenciaAcimaMedia() {		
		int contadorF = 0;
		for (int i = 0; i < dias.length; i++) {
			if(dias[i] > mediaFrequencia()) {
				contadorF++;
			}
		}					
		return contadorF;	
	}
	
	public static int acharFrequenciaPar() {		
		int contador = 0;
		int resultado = 0;
		for (int i = 0; i < dias.length; i++) {			
			resultado = dias[i] % 2;			
			if(resultado == 0) {
				contador++;
			}
		}					
		return contador;	
	}
}