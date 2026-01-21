package exercios_curso_java_condicional;

public class Exercio_7 {
	
	public static void main(String[] args) {
		
		double desconto = 23;
		double preco = 5.23;
		double valor;
		
		valor = (preco <= desconto) ?  10  : 23; // Operação ternaria
		
		System.out.println(valor);
		
	}

}
