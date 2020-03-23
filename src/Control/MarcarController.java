package Control;

import model.Casilla;

public class MarcarController {

	Casilla casilla;

	public MarcarController(Casilla casilla) {
		super();
		this.casilla = casilla;
	}

	public boolean marcarDesmarcarCasilla() {
		return casilla.marcarDesmarcar();
	}

}
