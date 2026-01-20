package exercios_curso_java_condicional;

import java.util.Scanner;

public class Exercio_1 {
	
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		double numeroDigitado;
		
		System.out.print("Digite um número: ");
		numeroDigitado = leitura.nextDouble();
		
		leitura.close();
		
		if(numeroDigitado > 0) {
			System.out.println("Positivo");
		}else if (numeroDigitado < 0) {
			System.out.println("Negativo");
		}else {
			System.out.println("0 é neutro :/");
		}
	}

}
