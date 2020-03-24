package Control;

import model.Coordenada;
import model.Tablero;

public class DesveladorController {
	Tablero tablero;

	public DesveladorController(Tablero tablero) {
		super();
		this.tablero = tablero;
	}

	// El Controller tambien hace de Adaptador
	// entre el UI que me da x, y
	// y el tablero que usa Coordenada
	public boolean desvelarCasilla(int x, int y) {
		return tablero.desvelarCasilla(new Coordenada(x, y));
	}
}
