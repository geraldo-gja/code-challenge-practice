package luxoft.interview02;

import java.util.HashMap;

public class CharacterCounter {

	protected String message;
	private Character mostFrequent;
	private int bigN;
	
	CharacterCounter(String message){
		this.message = message;
	}
	
	public Character getCharacter() {
			
		HashMap<Character, Integer> lettersCount = new HashMap<Character, Integer>();
		message = message.toUpperCase();
		
		for (int i = 0; i < message.length(); i++) {		
			Character c = message.charAt(i);
			if( c ==  ' ' )
				continue;	
			if( lettersCount.containsKey(c) )
				lettersCount.replace(c, lettersCount.get(c) + 1 );
			else
				lettersCount.put(c, 1);
		}
		lettersCount.forEach( (key,value)->{		
			if( value > bigN ) {
				mostFrequent = key;
				bigN = value;
			}
		});	
		
		return mostFrequent;
	}
	
	
	
}
