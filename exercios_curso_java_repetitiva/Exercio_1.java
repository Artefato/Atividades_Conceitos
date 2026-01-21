package exercios_curso_java_repetitiva;

import java.util.Scanner;

public class Exercio_1 {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		int senha = 2002;
		int senhaDigitada;
		
		System.out.print("Digite a senha: ");
		senhaDigitada = leitura.nextInt();
		
		while(senhaDigitada != senha) {
			System.out.println("Senha incorreta!");
			System.out.print("Digite novamente a senha: ");
			senhaDigitada = leitura.nextInt();
		}
		
		leitura.close();
		
		System.out.println("Senha correta.");
		
	}

}
