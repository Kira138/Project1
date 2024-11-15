package Utilities;

import java.util.Random;

public class JavaUtil {
	
	public int getrandomnum() {
		Random ran=new Random();
		int random=ran.nextInt(1000);
		return random;
		
	}

}
