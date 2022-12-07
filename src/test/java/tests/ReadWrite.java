package tests;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadWrite {

  public static void main(String[] args) throws IOException{
		@SuppressWarnings("unused")
		Properties properties = new Properties();
		@SuppressWarnings({ "unused", "resource" })
		FileInputStream inputstream =new FileInputStream("C:\\Users\\vyeduvaka\\eclipse-workspace\\Demo\\src\\test\\resources\\Properties\\testdata.properties");
	properties.load(inputstream);
	System.out.println(properties.getProperty("browser"));
	System.out.println(properties.getProperty("url"));

	@SuppressWarnings({ "unused", "resource" })
	FileOutputStream outputstream =new FileOutputStream("C:\\Users\\vyeduvaka\\eclipse-workspace\\Demo\\src\\test\\resources\\Properties\\testdata.properties");
    
	properties.setProperty("testdata","7095820630");
	properties.store(outputstream, "This is customer data from miracle");
	

	

	}

}
