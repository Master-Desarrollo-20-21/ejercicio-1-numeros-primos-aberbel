import java.util.logging.Logger;

public class SumaPrimos {

	private static final int TOTAL_NUMEROS_A_BUSCAR_PRIMOS = 50;
	private static final int CANTIDAD_NUMEROS_PRIMOS_A_SUMAR = 50;
	private static final Logger LOG = Logger.getLogger(SumaPrimos.class.getName());

	public static void main(String[] args) {
		sumarPrimosEntreLosCincuentaPrimerosNumeros();
		sumarPrimerosCincuentaNumerosPrimos();
	}

	private static void sumarPrimosEntreLosCincuentaPrimerosNumeros() {
		int suma=0;
		for(int i=2;i<=TOTAL_NUMEROS_A_BUSCAR_PRIMOS;i++) {
			if (isPrime(i)) {
				suma += i;
			}	
		}
		LOG.info("Suma: "+String.valueOf(suma));
	}

	private static void sumarPrimerosCincuentaNumerosPrimos() {
		int numero=2;
		int suma=0;
		for (int i=1;i<=CANTIDAD_NUMEROS_PRIMOS_A_SUMAR;) {
			if (isPrime(numero)) {
				suma += numero;
				i++;
			}
			numero++;
		}

		LOG.info("Suma: "+String.valueOf(suma));

	}

	private static boolean isPrime(int i) {
		for(int y=2;y<i;y++) {
			if (i % y == 0) {
				return false;
			}
		}
		return true;
	}

}

