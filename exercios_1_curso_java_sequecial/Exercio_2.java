package exercios_1_curso_java_sequecial;

import java.util.Scanner;

public class Exercio_2 {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		double PI = 3.14159;
		double dadoUserRaio;
		double areaCalculado;
		
		System.out.print("Digite o valor do raio:  ");
		dadoUserRaio = leitura.nextDouble();
		
		areaCalculado = PI * (dadoUserRaio * dadoUserRaio);
		
		System.out.println("O valor da área é: " + areaCalculado);
		
		
		leitura.close();
	}

}
