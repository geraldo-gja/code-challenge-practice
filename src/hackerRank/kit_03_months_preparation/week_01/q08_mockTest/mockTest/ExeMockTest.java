package hackerRank.kit_03_months_preparation.week_01.q08_mockTest.mockTest;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

public class ExeMockTest {
	
	/*
	 * INPUT 
	 * 7
	 * 0 1 2 4 6 5 3
	 * 
	 * OUTPUT 
	 * 3
	 * 
	 * OBS 4:00 para leitura e entendimento
	 *     8:00 para resolver a logica
	 */
	public static void main(String[] args) throws IOException {
	   
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt).collect(toList());

        FindMedian.findMedian(arr);

        bufferedReader.close();
    }

}
