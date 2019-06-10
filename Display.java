public class Display {
	
	public void line() {
		System.out.println("=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=");
		System.out.print("Word: ");
	}
	
	public void displayWord(int length) {
		
		line();
		String guess = "";
		
		for(int x=0;x<length;x++) {
			guess +="-";
		}
		
		System.out.print(guess);
		System.out.print("\n");
		
	}
	
	public void displayMissed(String missed) {
		System.out.println("Misses:" + missed);
	}

	public void displayGuess() {
		System.out.println("Guess: ");
	}

	public void message(int num,int arrLen) {
		if(num >= arrLen) {
			System.out.print("YOU GOT IT!");
		}
		else {
			System.out.println("GAME OVER!");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |          _|_");
			System.out.println("   |         / | \\");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
			
		}
	}

}
