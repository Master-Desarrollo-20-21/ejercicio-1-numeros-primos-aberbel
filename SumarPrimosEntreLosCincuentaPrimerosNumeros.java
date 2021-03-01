import java.util.logging.Logger;

public class SumaPrimosEntreLosCincuentaPrimerosNumeros {
		
	private static final Logger LOG = Logger.getLogger(SumaPrimosEntreLosCincuentaPrimerosNumeros.class.getName());

	public static void main(String[] args) {
		int suma=0;
		for(int i=1;i<=50;i++) {
			int numerosDivididos=0;
			for(int y=2;numerosDivididos<2 && y<=i;y++) {
				if (i % y == 0) {
					numerosDivididos++;
				}
			}
			if (numerosDivididos == 1) {
				suma += i;
			}
		}
		LOG.info("Suma: "+String.valueOf(suma));

	}