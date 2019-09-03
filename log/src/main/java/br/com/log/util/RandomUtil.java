package br.com.log.util;

public class RandomUtil {

	public static String randomString(Integer stringSize) {
		Integer size = 10;
		
		if(stringSize != null) {
			size = stringSize;
		}
		
		String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        
        String retorno = "";
		
        for(int i = 0; i < size ; i++) {
        	int position = (int) Math.round(Math.random() * 35);

            int stringCase = (int) Math.round(Math.random() * 10);
            
            if(stringCase == 0 || stringCase % 2 == 0) {
            	retorno += letras[position];
            } else {
            	retorno += letras[position].toUpperCase();
            }
        }
		
		return retorno;
	}
}
