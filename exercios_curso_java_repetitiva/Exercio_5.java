package exercios_curso_java_repetitiva;

import java.util.Scanner;

public class Exercio_5 {
	
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		int in = 0, out = 0, qdDeVezes, testeUser;
		
		System.out.print("Digite uma quantidada de vezes que será testado [10] e [20]: ");
		qdDeVezes = leitura.nextInt();
		
		for(int i = 0; i < qdDeVezes; i++) {
			System.out.print("Digite um número [10] e [20]: ");
			testeUser = leitura.nextInt();
			if(testeUser >= 10 && testeUser <= 20) {
				in += 1;
			}else {
				out += 1;
			}
		}
		
		System.out.println("\nQuantidade que estão entre [10] e [20]: " + in);
		System.out.println("Quantidade que não estão entre [10] e [20]: " + out);
		
		leitura.close();
	}

}
