package hackerRank.kit_03_months_preparation.week_01.q03;

public class TimeConversion {

	/*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */
    public static String timeConversion(String s) {
      	
    	String hour = s.substring(0, 2);;
    	String minuteSecond = s.substring(2, 8);
    	String shift = s.substring(8, 10);   //turno
    	int h = Integer.parseInt(hour);
    	
    	if( shift.equals("AM") && h == 12 ) {
    		hour = "00";
    		//hour = String.valueOf( h - 12 );  dessa forma, eu esperava uma String "00", mas as vezes retornava "0" - testar com o input 12:40:22AM
    	}else if( shift.equals("PM") && h < 12 ) {
    		hour = String.valueOf( h + 12 );
    	}
	
    	String hour24format = hour + minuteSecond;
    	System.out.println(hour24format);
    	
    	return hour24format;
    }
}
