package wallethub.prova2;

import java.util.HashMap;

public class Exam {

	//tentar refazer usando uma solução melhor
	public static int SimpleMode(int[] arr) {

        // Contagem dos números
        HashMap<Integer, Integer> numberCount = new HashMap<>();
        for (int num : arr) 
        	numberCount.put(num, numberCount.getOrDefault(num, 0) + 1);
           
        // Encontrar o número mais frequente e o índice de ocorrência mais cedo
        int mostFrequent = arr[0];
        int maxCount = 0;
        int firstIndex = arr.length;   
        
        for (int i = 0; i < arr.length; i++) {
        	int num = arr[i];
            int count = numberCount.get(num);
            if (count > maxCount || (count == maxCount && i < firstIndex)) {   
                mostFrequent = num;
                maxCount = count;
                firstIndex = i;
            }
        }
        
        return maxCount > 1 ? mostFrequent : -1;        
	 }
}
