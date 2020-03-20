package Control;

import model.Tablero;

public class DesveladorController {
	Tablero tablero;

	public DesveladorController(Tablero tablero) {
		super();
		this.tablero = tablero;
	}

	public boolean desvelarController(int x, int y) {
		return tablero.desvelarCasilla(x, y);
	}
}
