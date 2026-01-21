package exercios_curso_java_repetitiva;

import java.util.Scanner;

public class Exercio_6 {
	
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		int qdDeVezes;
		double valor1, valor2, valor3, mediaPonderada;
		
		System.out.print("Quantidade vezes: ");
		qdDeVezes = leitura.nextInt();
		
		for(int i = 0; i < qdDeVezes; i++) {
			System.out.print("Digite o primeiro valor: ");
			valor1 = leitura.nextDouble() * 2.0;
			System.out.print("Digite o segundo valor: ");
			valor2 = leitura.nextDouble() * 3.0;
			System.out.print("Digite o terceiro valor: ");
			valor3 = leitura.nextDouble() * 5.0;
			
			mediaPonderada = (valor1 + valor2 + valor3) / 10;
			
			System.out.printf("A media ponderada do indici %d é: %.1f\n" , (i+1), mediaPonderada);
			
			valor1 = limpa();
			valor2 = limpa();
			valor3 = limpa();
			mediaPonderada = limpa();	
		}
		leitura.close();
	}
	
	public static double limpa() { // Fiz o metado só para testar.
		return 0.00;
	}
}

	
