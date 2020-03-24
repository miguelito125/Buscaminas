package model;

public class Tablero {

	private Casilla[][] casillas;

	public Tablero(int lado, int numeroBombas) {
		super();
		crearTablero(lado);
		colocarMinas(lado,numeroBombas);
	}
	
	private void establecerMinasAlrededor(Coordenada posicionMinaCoordenada) {
		// TODO Auto-generated method stub
	}

	private void colocarMinas(int lado, int numeroBombas) {
		// TODO Auto-generated method stub
		//Una vez colocada la mina
		//Tendremos una posicion que yo llamo 0,0 pero que será aleatoria
		//en vuestro programa
		Coordenada posicionMinaCoordenada=new Coordenada(0, 0);
		establecerMinasAlrededor(posicionMinaCoordenada);
	}
	
	private void crearTablero(int lado) {
		this.casillas=new Casilla[lado][lado];
		// ahora hay que crear los objetos casilla
	}

	//TODO antes todo esto era private
	public Casilla getCasilla(Coordenada posicion) {
		return casillas[posicion.getPosX()][posicion.getPosY()];
	}
	
	private void setMina(Coordenada posicion, boolean bandera) {
		getCasilla(posicion).setMina(bandera);
	}

	private boolean isMina(Coordenada posicion) {
		return getCasilla(posicion).isMina();
	}

	public boolean desvelarCasilla(Coordenada coordenada) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
