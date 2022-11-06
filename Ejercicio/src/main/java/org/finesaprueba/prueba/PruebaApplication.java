package org.finesaprueba.prueba;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PruebaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PruebaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		int[] numeros = new int[] { 2, 7, 6, 3, 2, 10, 8, 6, 13, 4, 1 };
		TipoOrdenamiento tipo = TipoOrdenamiento.MENORAMAYOR;
		Ordenamiento ordenamiento = new Ordenamiento(tipo, numeros);

	}

}
