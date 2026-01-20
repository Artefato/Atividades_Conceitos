package exercios_1_curso_java_sequecial;

import java.util.Scanner;

public class Exercio_5 {
	
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		@SuppressWarnings("unused")
		int codigoPeca1,codigoPeca2, numeroPeca1, numeroPeca2;
		double valorPeca1, valorPeca2, totalPagar;
		
		codigoPeca1 = leitura.nextInt();
		numeroPeca1 = leitura.nextInt();
		valorPeca1 = leitura.nextDouble();
		System.out.print("\n");
		codigoPeca2 = leitura.nextInt();
		numeroPeca2 = leitura.nextInt();
		valorPeca2 = leitura.nextDouble();
		
		leitura.close();
		
		totalPagar = (numeroPeca1 * valorPeca1) + (numeroPeca2 * valorPeca2);
		
		System.out.printf("O total a pagar é: R$ %.2f " , totalPagar);
		
		
	}

}
