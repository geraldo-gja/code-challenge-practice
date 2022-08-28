package hackerRank.kit_03_months_preparation.week_02.q02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.toList;
import java.util.List;

public class Exe02 {

	/*
	 * INPUT 1          OUTPUT 1
	 * 4				75
	 * 73				67
	 * 67				40
	 * 38				33
	 * 33
	 * 
   	 * OBS 5:30 preparar ambiente
   	 *     5:30 para leitura e entendimento
     *     12:30 para resolver a logica
     *     Sem erros
	 */
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));      
        
        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }).map(String::trim).map(Integer::parseInt).collect(toList());

        GrasingStudents.gradingStudents(grades);
        
        bufferedReader.close();
    }

}
