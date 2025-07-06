import calc.CalculadoraDiferente;

public class Main {
	public static void main(String[] args) {
		
		CalculadoraDiferente calc = new CalculadoraDiferente();
		
        // Exemplo de uso dos métodos
        int invertido = calc.inverteNumero(1234);
        System.out.println("Número invertido: " + invertido);

        int fat = calc.fatorial(5);
        System.out.println("Fatorial de 5: " + fat);

        int soma = calc.somaDobro(3, 4);
        System.out.println("Soma com dobro: " + soma);
	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}

}