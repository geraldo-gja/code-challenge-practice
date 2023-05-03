package hackerRank.kit_03_months_preparation.week_03.q06;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

public class Exe06 {

	/*
	 * INPUT 1				OUTPUT 1          
	 * 5					1 3 3
	 * 1 1 1 3 3						
	 * 
	 * INPUT 2				OUTPUT 2     
	 * 3					-1
	 * 1 2 3
	 * 
	 * INPUT 3				OUTPUT 3   
	 * 6					1 1 1
	 * 1 1 1 2 3 5
	 * 
   	 * OBS 11:40 para leitura e entendimento
   	 *     05:00 pesquisa e entendimento do que é triangulo degenerativo 
     *     46:40 para resolver a logica        
     *     Tive que ajustar alguns erros no deubg, lógica um pouco extensa
     *     
     *     Só irá existir um triângulo se, somente se, os seus lados obedeceram à seguinte regra: 
     *     - um de seus lados deve ser maior que o valor absoluto (módulo) da diferença dos outros dois lados 
     *     - e menor que a soma dos outros dois lados.  
	 */
	public static void main(String[] args) throws IOException {
		
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> sticks = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt).collect(toList());

        MaximumPerimeterTriangle.maximumPerimeterTriangle(sticks);

        bufferedReader.close();
	}

}
