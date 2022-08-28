package hackerRank.kit_03_months_preparation.week_01.q07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Exe07 {
	
	/*
	 * Obs: digitar o Input linha por linha, se der 'ctl + c' vai vir com espaço em branco e não funciona corretamente
	 * 
	 * INPUT 1        OUTPUT 1
	 * 4              2
 	 * aba            1
	 * baba           0
	 * aba
	 * xzxb
	 * 3
	 * aba
	 * xzxb
	 * ab
	 * 
	 * INPUT 2        OUTPUT 2
	 * 3              1
	 * def            0
	 * de             1
	 * fgh
	 * 3
	 * de
	 * lmn
	 * fgh
	 * 	
	 * INPUT 3        OUTPUT 3
     * 13             1
	 * abcde          3
	 * sdaklfj        4
	 * asdjf          3
	 * na             2
	 * basdn
	 * sdaklfj
	 * asdjf
	 * na
	 * asdjf
	 * na
	 * basdn
	 * sdaklfj
	 * asdjf
	 * 5
	 * abcde
	 * sdaklfj
	 * asdjf
	 * na
	 * basdn
     *
	 * OBS 5:00 para leitura e entendimento
	 *     11:00 para resolver a logica
	 *     Sem erros
	 */
	public static void main(String[] args) throws IOException {
		
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int stringsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> strings = IntStream.range(0, stringsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }).collect(toList());

        int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> queries = IntStream.range(0, queriesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }).collect(toList());

        List<Integer> res = SparseArrays.matchingStrings(strings, queries);


        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        bufferedWriter.write(
            res.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();

    }

}
