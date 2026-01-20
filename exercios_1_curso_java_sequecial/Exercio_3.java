package exercios_1_curso_java_sequecial;

import java.util.Scanner;

public class Exercio_3 {
	
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int a,b,c,d, DIFERENCA;
		
		System.out.print("Digite A: ");
		a = leitura.nextInt();
		
		System.out.print("Digite B: ");
		b = leitura.nextInt();
		
		System.out.print("Digite C: ");
		c = leitura.nextInt();
		
		System.out.print("Digite D: ");
		d = leitura.nextInt();
		
		DIFERENCA = (a * b-c * d);
		
		System.out.println("Diferença é: " + DIFERENCA);
		
		
		
		
		leitura.close();
		
	}

}
