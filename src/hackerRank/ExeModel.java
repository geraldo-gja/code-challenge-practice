package hackerRank;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;


public class ExeModel {

	/*
	 * INPUT 1          OUTPUT 1
	 * 3				15			
	 * 
	 * 
   	 * OBS 4:20 para leitura e entendimento
     *     17:45 para resolver a logica
     *     Sem erros
	 */
    public static void main(String[] args) throws IOException {
    	
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt).collect(toList());

        Result.exeInputList(arr);

        bufferedReader.close();
    }
}


class Result {

    public static List<Integer> exeInputList(List<Integer> arr) {
    	return null;
    }

}
