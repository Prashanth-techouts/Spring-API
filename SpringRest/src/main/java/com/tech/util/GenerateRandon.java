package com.tech.util;

import java.util.Random;


public class GenerateRandon {
	
	public Long generateRandom() {
		
		Random random = new Random();
	    char[] digits = new char[12];
	    digits[0] = (char) (random.nextInt(9) + '1');
	    for (int i = 1; i < 12; i++) {
	        digits[i] = (char) (random.nextInt(10) + '0');
	    }
	    
	   
	    return Long.parseLong(new String(digits));
	}

}
