package luxoft.interview01;

public class CodeChallenge {

    public static void main(final String[] args) {
    	
        final String message = "Welcome to this interview!"
                + " What is the MOST frequent non-whitespace character in this String?"
                + " HINT: The return should be the character 'E' (guaranteed result)."
                + " HINT 2: This exercise is not case sensitive";
      
        final CharacterCounter characterCounter = new MostFrequentCharacterCounter(message);
        
        
        
        System.out.println(characterCounter.getCharacter());
    }

}
