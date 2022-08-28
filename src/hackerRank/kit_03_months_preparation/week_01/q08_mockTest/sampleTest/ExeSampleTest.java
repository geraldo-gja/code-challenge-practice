package hackerRank.kit_03_months_preparation.week_01.q08_mockTest.sampleTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ExeSampleTest {
	
	/*
	 * INPUT 
	 * 15
	 * 
	 * OUTPUT 
	 * 1
     * 2
     * Fizz
     * 4
     * Buzz
     * Fizz
     * 7
     * 8
     * Fizz
     * Buzz
     * 11
     * Fizz
     * 13
     * 14
     * FizzBuzz
     * 
	 * OBS 5:00 para leitura e entendimento
	 *     8:00 para resolver a logica
	 */
	public static void main(String[] args) throws IOException {
		
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        FizzBuzz.fizzBuzz(n);

        bufferedReader.close();
    }

}
