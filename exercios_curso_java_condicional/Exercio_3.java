package exercios_curso_java_condicional;

import java.util.Scanner;

public class Exercio_3 {
	
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		int x, y;
		
		x = leitura.nextInt();
		y = leitura.nextInt();
		
		if(y > x ) {
			if(y % x == 0) {
				System.out.println("É Multiplos");
			}else {
				System.out.println("Não é Multiplos");
			}
		}else {
			if(x % y == 0) {
				System.out.println("É Multiplos");
			}else {
				System.out.println("Não é Multiplos");
			}
		}
		
		
	
		leitura.close();
		
	}

}
