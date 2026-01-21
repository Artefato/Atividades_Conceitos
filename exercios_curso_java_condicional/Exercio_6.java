package exercios_curso_java_condicional;

import java.util.Scanner;

public class Exercio_6 {
	
	public static void main(String[] args) {
		
		System.out.println("\n");
		System.out.println("      Plano Cartesiano     ");
		System.out.println();
		System.out.println("|___________________________|");
		System.out.println("|             Y             |");
		System.out.println("|                           |");
		System.out.println("|             |             |");
		System.out.println("|    Q2       |      Q1     |");
		System.out.println("|             |             |");
		System.out.println("|             |             |");
		System.out.println("|    -------------------"+" X  |");
		System.out.println("|             |             |");
		System.out.println("|             |             |");
		System.out.println("|    Q3       |       Q4    |");
		System.out.println("|             |             |");
		System.out.println("|___________________________|");
		System.out.println();
		
		double x = 0 , y =0;
		Scanner leitura = new Scanner(System.in);

		try {
			System.out.print("Digite a posição X: ");
			x = leitura.nextDouble();
			System.out.print("Digite a posição y: ");
			y = leitura.nextDouble();
			leitura.close();
		} catch (Exception e) {
			System.out.println("Somente valores númericos podem ser digitados");
			System.out.println(e + "Lembrar que tem ");
		}
		
		if(x > 0 && y > 0) {
			System.out.println("Q1");
		}else if (x < 0 && y > 0) {
			System.out.println("Q2");
		}else if (x < 0 && y < 0) {
			System.out.println("Q3");
		}else if (x > 0 && y < 0) {
			System.out.println("Q4");
		}else if (x == 0 && y == 0) {
			System.out.println("“Origem”");
		}else {
			System.out.println("Erro desconhecido");
		}
	}
}
