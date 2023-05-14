package aubay;

public class Q01 {

	public static int closestToZero(int[] ints) {
		
		int num = 0;
		int nP = Integer.MAX_VALUE;    //Positive number
		int nN = Integer.MIN_VALUE;    //Nagative number
		
		if( ints.length > 0 ) {
			
			for (int i = 0; i < ints.length; i++) {
				int n = ints[i];
				if( n < 0 && n > nN )
					nN = n;
				if( n > 0 && n < nP )
					nP = n;
			}
			if( Math.abs(nP) > Math.abs(nN) )
				num = nN;
			else if( Math.abs(nP) < Math.abs(nN) )
				num = nP;
			else
				num = nP;
		}
		
		return num;
	}
	
	
	public static int infNetworkEndpoint
	    (int startNodeId, int[] fromIds, int[] toIds) {		
		
		for (int i = 0; i < fromIds.length; i++) {
			int id = fromIds[i];
			if( startNodeId == id ) { 
				startNodeId = toIds[i]; 
			}
		}
		
		return startNodeId;
	}
	
}
