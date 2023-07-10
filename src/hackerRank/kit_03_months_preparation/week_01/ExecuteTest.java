package hackerRank.kit_03_months_preparation.week_01;

import java.io.IOException;

import hackerRank.kit_03_months_preparation.week_01.q01.Exe01;
import hackerRank.kit_03_months_preparation.week_01.q02.Exe02;
import hackerRank.kit_03_months_preparation.week_01.q03.Exe03;
import hackerRank.kit_03_months_preparation.week_01.q04.Exe04;
import hackerRank.kit_03_months_preparation.week_01.q05.Exe05;
import hackerRank.kit_03_months_preparation.week_01.q06.Exe06;
import hackerRank.kit_03_months_preparation.week_01.q07.Exe07;
import hackerRank.kit_03_months_preparation.week_01.q08_mockTest.mockTest.ExeMockTest;
import hackerRank.kit_03_months_preparation.week_01.q08_mockTest.sampleTest.ExeSampleTest;

public class ExecuteTest {

	/**
	 * IMPORTATE: todas as quest�es foram resolvidas utilizando o Java 8
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Auto-generated method stub
		
		int num = 1;
		
		try {
			execute(num);
		} catch (IOException e) {
			//Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void execute( int number ) throws IOException {
		
		switch (number) {
	
		case 1:
			Exe01.main(null);
			break;
		
		case 2:
			Exe02.main(null);
			break;
		
		case 3:
			Exe03.main(null);
			break;
		
		case 4:
			Exe04.main(null);
			break;
			
		case 5:
			Exe05.main(null);
			break;	
		
		case 6:
			Exe06.main(null);
			break;
		
		case 7:
			Exe07.main(null);
			break;
			
		case 8:
			ExeSampleTest.main(null);
			break;
		
		case 9:
			ExeMockTest.main(null);
			break;

		default:
			break;
		}	
	}
	
}
