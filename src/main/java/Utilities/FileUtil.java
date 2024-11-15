package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtil {

	public String getkeyandvaluepair(String Key) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\kiran\\eclipse-workspace\\Project1\\src\\main\\resources\\Commondata");
		Properties pro=new Properties();
		pro.load(fis);
		String Value=pro.getProperty(Key);
		return Value;
		
	}
}

