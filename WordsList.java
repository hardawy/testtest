import java.util.Random;


public class WordsList {

	public static void main(String[] args) {
		
		int guessw;
		
		String wordlist[] = {"ignite","testing","automation","hangman","testng","selenium","assignment"};
		Random r=new Random();
		guessw = r.nextInt(7);
		
		CheckWord.checkWord(wordlist, guessw);
		
	}

}