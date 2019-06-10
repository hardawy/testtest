import java.util.Scanner;

public class CheckWord {
	
	
	private static Scanner input;

	public static void checkWord(String Arr[], int ind) {
		Display display = new Display();

		int missedwordnum=0,correctwordnumber=0;
		String Missed = "";
		char in;
		int length = Arr[ind].length();
		char guessword[] = new char[length];
		
		input = new Scanner(System.in);
		

		for(int y=0;y<length;y++) {
			guessword[y]='-';
		}
		
		display.displayWord(length);
		
		while(missedwordnum < 8 && correctwordnumber < (Arr[ind].length())) {
			int flag =0;
			display.displayMissed(Missed);
			display.displayGuess();
			in = input.next().charAt(0);

			for(int y=0;y<Arr[ind].length();y++) {

				if (in == Arr[ind].charAt(y)) { 
	
					for(int z=0;z<Arr[ind].length();z++) { 
						if(z == y) {
							guessword[z]=in;
							++correctwordnumber;
						}
					}
					flag++;
				}
			}
			if(flag ==0) {
				Missed = Missed + in; 
				++missedwordnum; 
				
			}
			display.line();
			for(int v=0;v<guessword.length;v++) {
				System.out.print(guessword[v]);
			}
			System.out.print("\n");
			
			if(correctwordnumber == guessword.length ) {
				for (int w=0;w<guessword.length;w++) {
					if ('-' == guessword[w]) {
						--correctwordnumber;
					}
				}
			}
			
		}
		
		display.message(correctwordnumber, length);
	}
}