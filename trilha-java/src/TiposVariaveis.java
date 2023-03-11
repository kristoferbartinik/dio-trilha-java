
public class TiposVariaveis {

	public static void main(String[] args) throws Exception {
		double salarioMinimo = 2500;
		short numeroCurto = 1;
		int numeroNormal = numeroCurto;
		short numeroCurto2 = (short) numeroNormal;
		
		System.out.println("Valor do Salario: " +salarioMinimo);
		System.out.println("Valor do numero curto 2: " +numeroCurto2);
		
		int numero = 5;
		numero = 10;
		System.out.println("Mudando valor 5 da variavel para: " +numero);
		
		final double VALOR_DE_PI = 3.14;
		System.out.println("Valor da constante Pi: " +VALOR_DE_PI);
	}

}
