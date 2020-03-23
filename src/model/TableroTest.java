package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import utiles.Utiles;

class TableroTest {

	@Test
	void testTableroColocarMinas() {
		int lado=4;
		int porcentaje=10;
		int minas=Utiles.calculaMinas(lado, porcentaje);
		//Al crear el tablero se colocaran las minas
		Tablero tablero=new  Tablero(lado, minas);
		//si todo ha salido bien cuando recorra el tablero 
		//me encontrare un numero minas de minas
		int contadorMinas=0;
		//Aqui nos vemos obligados a crear tanto codigo porque los resultados
		//son aleatorios
		for (int i = 0; i < lado; i++) {
			for (int j = 0; j < lado; j++) {
				if(tablero.getCasilla(new Coordenada(i, j)).isMina()) {
					contadorMinas++;
				}
			}
		}
		assertEquals(minas, contadorMinas);
	}

}
