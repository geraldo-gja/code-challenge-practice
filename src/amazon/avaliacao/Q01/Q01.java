package amazon.avaliacao.Q01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q01 {

	public static void main(String[] args) {
		// Auto-generated method stub

		Q01 q01 = new Q01();
		q01.test();
	}
	
	private void test(){	
	/*	
		List<Integer> p1 = new ArrayList<Integer>();
		p1.add(2);
		p1.add(2);
		p1.add(1);
		p1.add(5);
		p1.add(3);
		int c = 2;
		System.out.println("exemplo 1");
		System.out.println( maximumQuality(p1, c) );
		System.out.println(" ");
	*/	
		List<Integer> p2 = new ArrayList<Integer>();
		p2.add(89);
		p2.add(48);
		p2.add(14);
		int c2 = 3;
		System.out.println("exemplo 2");
		System.out.println( maximumQuality(p2, c2) );
		System.out.println(" ");
	/*	
		List<Integer> p3 = new ArrayList<Integer>();
		p3.add(1);
		int c3 = 1;
		System.out.println("exemplo 1");
		System.out.println( maximumQuality(p3, c3) );
		System.out.println(" ");
		*/
	}
	
	@SuppressWarnings("unchecked")
	public static long maximumQuality(List<Integer> packets, int channels) {
	    
		packets = sortArray(1, packets);  //ascending order
		int count = packets.size() - 1;
		
		int[][] arrayChannels = new int[channels][packets.size()];
		List<Integer> numElements = new ArrayList<Integer>();
		List<Integer> average = new ArrayList<Integer>();
		
		for (int i = 0; i < channels; i++) {
			
			
			if( i+1 == channels ) {
				int c = 0;
				for (int j = count; j >= 0; j--) {
					arrayChannels[i][c] =  packets.get(count);
					c++;
					count--;
				}
				numElements.add(c);
			}else {
				arrayChannels[i][i] = packets.get(count);
				count--;
				numElements.add(1);
			}
			
			int m = median( numElements.get(i), i, arrayChannels);
			average.add(m);
		}
		
		int sum = 0;
		for (int i = 0; i < average.size(); i++) {
			sum = sum + average.get(i);
		}
		
		return sum;
	}
	
	private static int median( int numElements, int k, int[][] list) {
		
		int median;
		int ind = (numElements / 2) - 1;
		
		//if it's even
		if( numElements == 1) {
			median = list[k][0];
		}
		else if( list.length % 2 == 0 && ind > 0) {
			median = (list[k][ind-1] + list[k][ind]) / 2;
		}
		else { //if not, it's odd
			median = list[k][ind-1];
		}
		
		return median;
	}
	
	
	/**
	 * Receives a generic list (integer, String, etc) unsorted 
	 * and returns sorted in ascending or descending order.
	 * 
	 * @param orderType - 1 = ascending order or 2 = descending order
	 * @param list - disordered list
	 * 
	 * @return list - ordered list.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static List sortArray( int orderType, List list ) {
		
		Collections.sort( list ); //ascending order 
		
		if( orderType == 2 ) {	  //descending order
			List descendingList = new ArrayList();
			for (int i = list.size() - 1; i >= 0; i--) {
				descendingList.add( list.get(i) );
			}
			list = descendingList;
		}		
		return list;
	}
	
}
