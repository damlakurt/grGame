package abstractClasses;

public abstract class GameCalculator { // abstract s�n�flar asla new'lenemez
	
	public abstract void hesapla();
	
	
	public final void gameOver() {
		System.out.println("Oyun Bitti");
	}

}
