package exercios_curso_java_condicional;

import java.util.Scanner;

public class Exercio_5 {
	
	public static void main(String[] args) {
		
		double intervaloDigitado;
		Scanner leitura = new Scanner(System.in);
		System.out.print("Digite um número: ");
		intervaloDigitado = leitura.nextDouble();
		leitura.close();
		
		if(intervaloDigitado >= 0.00 && intervaloDigitado <= 25.00) {
			System.out.println("INTERVALO  DE [0,25].");
		}else if(intervaloDigitado > 25.00 && intervaloDigitado <= 50.00) {
			System.out.println("INTERVALO DE [25,50]");
		}else if(intervaloDigitado >= 75.00 &&  intervaloDigitado <= 100.00) {
			System.out.println("INTERVALO DE [75,100]");
		}else {
			System.out.println("Fora do RANGE");
		}
	}
}
