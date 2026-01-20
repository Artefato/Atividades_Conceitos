package exercios_curso_java_condicional;

import java.util.Scanner;

public class Exercio_2 {
	
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		double numeroDigitado;
		
		System.out.print("Digite um número: ");
		numeroDigitado = leitura.nextDouble();
		
		if(numeroDigitado % 2 == 0) {
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}
	
		leitura.close();
	}

}
