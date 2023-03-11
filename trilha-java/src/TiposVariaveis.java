
public class TiposVariaveis {

	public static void main(String[] args) throws Exception {
		double salarioMinimo = 2500;
		short numeroCurto = 1;
		int numeroNormal = numeroCurto;
		short numeroCurto2 = (short) numeroNormal;
		
		System.out.println("Valor do Salario: " +salarioMinimo);
		System.out.println("Valor do numero curto 2: " +numeroCurto2);
	}

}
