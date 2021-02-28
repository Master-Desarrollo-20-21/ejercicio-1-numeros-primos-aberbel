import java.util.logging.Logger;

public class SumaPrimerosCincuentaNumerosPrimos {
	
	private static final Logger LOG = Logger.getLogger(SumaPrimosEntreLosCincuentaPrimerosNumeros.class.getName());

	public static void main(String[] args) {
		int numero=1;
		int suma=0;
		int numerosSumados=0;
		do {
			int numerosDivididos=0;
			for(int y=2;y<=numero;y++) {
				if (numero % y == 0) {
					numerosDivididos++;
				}
			}
			if (numerosDivididos == 1) {
				suma += numero;
				numerosSumados++;
			}
			numero++;			
		} while (numerosSumados<50);
		
		LOG.info("Suma: "+String.valueOf(suma));
	}

}