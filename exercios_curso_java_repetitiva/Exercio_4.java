package exercios_curso_java_repetitiva;

import java.util.Scanner;

public class Exercio_4 {
	
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Digite um número para ver o impáres de 1 até ele: ");
		int nubDigitado = leitura.nextInt();
		System.out.println();
		
		for(int i = 1; i <= nubDigitado; i++) {
			if(i % 2 == 1) {
				System.out.println(i);
			}
		}
			
		leitura.close();
		
		
		
	}

}
