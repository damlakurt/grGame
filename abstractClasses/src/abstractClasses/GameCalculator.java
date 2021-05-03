package abstractClasses;

public abstract class GameCalculator { // abstract sýnýflar asla new'lenemez
	
	public abstract void hesapla();
	
	
	public final void gameOver() {
		System.out.println("Oyun Bitti");
	}

}
