package model;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class CasillaTest {

	@Test
	void test() {
		Casilla casilla = new Casilla();
		assertFalse(casilla.isMarcada());
		assertTrue(casilla.marcarDesmarcar());
		assertFalse(casilla.marcarDesmarcar());
		assertTrue(casilla.marcarDesmarcar());
	}

}
