package exercios_curso_java_repetitiva;

import java.util.Scanner;

public class Exercio_2 {
	
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		int cordenadaX, cordenadaY;
		
		 System.out.print("Digite a cordenada X: ");
		 cordenadaX = leitura.nextInt();
		 System.out.print("Digite a cordenada Y: ");
		 cordenadaY = leitura.nextInt();
		
		while(cordenadaX != 0 && cordenadaY != 0) {
			if(cordenadaX > 0 && cordenadaY > 0) {
				System.out.println("Primeiro");
			}else if (cordenadaX > 0 && cordenadaY < 0) {
				System.out.println("Quarto");
			}else if (cordenadaX < 0 && cordenadaY < 0) {
				System.out.println("Terceiro");
			}else { // Não precisa testa a lógica... Se todas as 3 acima foram testada, a última será a verdadeira :);
				System.out.println("Segunto");
			}
			
			 System.out.print("Digite a cordenada X: ");
			 cordenadaX = leitura.nextInt();
			 System.out.print("Digite a cordenada Y: ");
			 cordenadaY = leitura.nextInt();
		}
		
		System.out.println("NULO.");
		
		leitura.close();
		
	}

}
