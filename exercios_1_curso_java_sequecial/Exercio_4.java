package exercios_1_curso_java_sequecial;

import java.util.Scanner;

public class Exercio_4 {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		int nubFuncionario, horasTrabalhadas;
		double valorHoras, salario;
		
		System.out.print("Digite o nub do Funcionário: ");
		nubFuncionario = leitura.nextInt();
		System.out.print("Digite as horas trabalhadas: ");
		horasTrabalhadas = leitura.nextInt();
		System.out.print("Digite o valor da hora: ");
		valorHoras = leitura.nextDouble();
		
		salario = (double) horasTrabalhadas * valorHoras;
		
		System.out.println("\nO número do funcionario é: " + nubFuncionario + ".\n" +
				           "O salario dele é: R$" + salario);
		
		leitura.close();
		
	}

}
