package exercios_curso_java_condicional;

import java.util.Scanner;

public class Exercio_4 {
	
	public static void main(String[] args) {
		
		System.out.println("|CODIGO ||    ESPECIFICAÇÃO   ||  PREÇO  |" + "\n" +
						   "|----------------------------------------|");
		System.out.println("|1      ||   Cachorro quente  || R$: 4,00|");
		System.out.println("|2      ||   X-salada         || R$: 4,50|");
		System.out.println("|3      ||   X-Bancon         || R$: 5,00|");
		System.out.println("|4      ||   Torrada simples  || R$: 2,00|");
		System.out.println("|5      ||   Refrigerante     || R$: 1,50|");
		System.out.println("|----------------------------------------|");
		System.out.println("");
		
		int codigoDigitado, unidadeDigitadas;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Digite o código do produto: " );
		codigoDigitado = leitura.nextInt();
		System.out.print("Digite a quantidade UNIDADE do produto: " );
		unidadeDigitadas = leitura.nextInt();
		
		leitura.close();
		
		if(codigoDigitado == 1) {
			System.out.println("Total: R$" + unidadeDigitadas * 4.00);
		}else if(codigoDigitado == 2) {
			System.out.println("Total: R$" + unidadeDigitadas * 4.50);
		}else if(codigoDigitado == 3) {
			System.out.println("Total: R$" + unidadeDigitadas * 5.00);
		}else if(codigoDigitado == 4) {
			System.out.println("Total: R$" + unidadeDigitadas * 2.00);
		}else if(codigoDigitado == 5) {
			System.out.println("Total: R$" + unidadeDigitadas * 1.50);
		}else {
			System.out.println("Não tem esse código na tabela.");
		}
	}
}
