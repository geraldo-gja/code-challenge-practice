package wallethub.q01;

public class Q01 {

	public static String LongestWord(String sen) {
	   
		char[] letters = new char[52];
		int countArray = 0;
		for (char ch = 'a'; ch <= 'z'; ch++) {
			letters[countArray] = ch;
			countArray++;
		}
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			letters[countArray] = ch;
			countArray++;
		}	
		String largestWord = "";
		String word = "";
		
		for (int i = 0; i < sen.length(); i++) {
			char c = sen.charAt(i);
			
			B: for (int j = 0; j < letters.length; j++) {
				char c2 = letters[j];
				
				if( c == c2 ) {
					word += c;
					break B;
				}
			}	
			if( c == ' ' || i == sen.length() - 1 ) {   //if is a space or is the last char of the word
				if( word.length() > largestWord.length() )  //set the longes word
					largestWord = word;		
				word = "";	
			}		
		}
		
	    return largestWord;
	}
	
}
