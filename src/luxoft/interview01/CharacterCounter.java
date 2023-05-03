package luxoft.interview01;

public class CharacterCounter {

	protected String message;
	
	CharacterCounter(String message){
		this.message = message;
	}
	
	public Integer getCharacter() {
		
		int count = 0;
		
		for (int i = 0; i < message.length(); i++) {
			Character c = message.charAt(i);
			if( c != ' ' )
				count++;
		}
		
		return count;
	}
}
