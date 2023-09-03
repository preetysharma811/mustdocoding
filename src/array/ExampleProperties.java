package array;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ExampleProperties {

	void method1()
	{
		final File propsFile = new File("C:\\QA3.5\\example\\config.properties");
		try {
	        FileInputStream fileName=new FileInputStream(propsFile);
	        Properties props = new Properties();
	        props.load(fileName);
	        props.setProperty("id", "333");
	        fileName.close();
	        FileOutputStream outFileName=new FileOutputStream(propsFile);
	        props.store(outFileName, "");
	        outFileName.close();
	  
	        } catch (IOException io) {

	            io.printStackTrace();
	        } 	
	}
	
	public static void main(String[] args) {
	ExampleProperties t=new ExampleProperties();
	t.method1();
	}

}
