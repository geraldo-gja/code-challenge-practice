package hackerRank.kit_03_months_preparation.week_02.q03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Exe03 {
	
	/*
	 * INPUT 1          OUTPUT 1
	 * 3				2147483648
	 * 2147483647		4294967294
	 * 1				4294967295
	 * 0
	 * 
	 * INPUT 2          OUTPUT 2
	 * 2				4294967291
	 * 4				4294843839	
	 * 123456			
	 * 
	 * INPUT 3          OUTPUT 3
	 * 3				4294967295
	 * 0				3492223820
	 * 802743475		4259365872
	 * 35601423
	 * 
	 * OBS 4:00 preparar ambiente
   	 *     2:50 para leitura e entendimento
     *     37:40 para resolver a logica
     *     Problema, demorei pq tive que pesquisar os métodos  Long.toBinaryString(n) e Long.parseUnsignedLong(n, Character.MIN_RADIX)
     */     
    public static void main(String[] args) throws IOException {
        
    	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                long n = Long.parseLong(bufferedReader.readLine().trim());

                FlippingBits.flippingBits(n);

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
    
}
