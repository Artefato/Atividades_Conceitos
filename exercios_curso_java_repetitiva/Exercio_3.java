package exercios_curso_java_repetitiva;

import java.util.Scanner;

public class Exercio_3 {

	public static void main(String[] args) {
		
		System.out.println();
		System.out.println("    |-----------------------------------|");
		System.out.println("    |      Tabela de de combustivel     |");
		System.out.println("    |                                   |");
		System.out.println("    |   1.  Alcool                      |");
		System.out.println("    |   2.  Gasolina                    |");
		System.out.println("    |   3.  Diesel                      |");
		System.out.println("    |   4.  Para finalizar Programa     |");
		System.out.println("    |                                   |");
		System.out.println("    |                                   |");
		System.out.println("    |-----------------------------------|");
		System.out.println();
		
		Scanner leitura = new Scanner(System.in);
		
		int qdAlcool = 0, qdGasolina = 0, qdDiesel = 0, cdCombustivelDigitado;
		
		System.out.print("Digite o código: ");
		cdCombustivelDigitado = leitura.nextInt();
		
		while(cdCombustivelDigitado != 4) {
			if(cdCombustivelDigitado == 1) {
				qdAlcool += 1;
			}else if (cdCombustivelDigitado == 2) {
				qdGasolina += 1;
			}else if (cdCombustivelDigitado == 3){
				qdDiesel += 1;
			}	
			
			System.out.print("Digite o código: ");
			cdCombustivelDigitado = leitura.nextInt();
		}
		leitura.close();
		
		System.out.println("MUITO OBRIGADO!\n");
		
		System.out.println("1.Alcool: " + qdAlcool);
		System.out.println("2.Gasolina: " + qdGasolina);
		System.out.println("3.Diesel : " + qdDiesel);
		
		
		
		
	}
}
