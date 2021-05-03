package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
		
		GameCalculator gameCalculator = new WomanGameCalculator();
		gameCalculator.hesapla();
		gameCalculator.gameOver();
		
		
		ManGameCalculator manGameCalculator = new ManGameCalculator();
		manGameCalculator.hesapla();
		manGameCalculator.gameOver();
		
		
		
		KidsGameCalculator kidsGameCalculator= new KidsGameCalculator();
		kidsGameCalculator.hesapla();
		kidsGameCalculator.gameOver();
		
		
		
	
		
		
	
		
		
	
			
		
		
	

	}

}
