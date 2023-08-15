package wallethub.prova1.q05;

public class Q05 {

	public static String gasStation(String[] strArr) {
	    
		String str = "";
		double gas = 0.0;
		
		int arraySize = Integer.parseInt(strArr[0]);
		int countRound = 1;
		while ( countRound <= arraySize ) {
			
			str = String.valueOf(countRound);  //get index of the starting gas station
			int k = countRound;
			for (int i = 1; i <= arraySize; i++) {
				
				String gasStation = strArr[k];
				String num = "";
				double g = 0.0;
				for (int j = 0; j < gasStation.length(); j++) {
					char c = gasStation.charAt(j);
					if( c == ':' ) {
						g = Double.parseDouble(num);
						num = "";
					}else 
						num += c;						
				}
				double c = Double.parseDouble(num);
				
				gas += (g - c);
				if( gas < 0 ) { 
					str = "impossible";	
					gas = 0.0;
					break;
				}
				if( k == arraySize )
					k = 1;
				else
					k++;
			}
			countRound++;
			if( ! str.equals("impossible") )
				break;			
		}
			
		return str;
	}
	
}
