package model;

public class Tablero {

	private Casilla[][] casillas;

	public Tablero(int lado, int numeroBombas) {
		super();
		crearTablero(lado);
		colocarMinas(lado,numeroBombas);
		establecerMinasAlrededor();
	}
	
	private void establecerMinasAlrededor() {
		// TODO Auto-generated method stub
		
	}

	private void colocarMinas(int lado, int numeroBombas) {
		// TODO Auto-generated method stub
		
	}
	
	private void crearTablero(int lado) {
		this.casillas=new Casilla[lado][lado];
		// ahora hay que crear los objetos casilla
	}

	//TODO antes era private
	public Casilla getCasilla(Coordenada posicion) {
		return casillas[posicion.getPosX()][posicion.getPosY()];
	}
	
	private void setMina(Coordenada posicion, boolean bandera) {
		getCasilla(posicion).setMina(bandera);
	}

	private boolean isMina(Coordenada posicion) {
		return getCasilla(posicion).isMina();
	}

	
	
}
