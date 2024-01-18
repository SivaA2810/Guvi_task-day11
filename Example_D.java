package javaTask_E_day12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Example_D {

	
public void function_one() {
	
	try { 
//		actual file location - "C:\\Users\\HP\\Eclipse workspace new\\Guvi_daily_Tasks\\exampleFileon"
		File file = new File("C:\\Users\\HP\\Eclipse workspace new\\Guvi_daily_Tasks\\exampleFile"); 
		FileReader read = new FileReader(file);
		BufferedReader reader = new BufferedReader(read); 
	
		String line;
		while ((line=reader.readLine())!=null){
		System.out.println(line);
		 
		}
		reader.close();
		}
		catch(IOException f) {
		System.out.println("FileNotFoundException - there is no file where you mentioned");
		} 

}	
	
	public static void main(String[] args) {
		Example_D ec = new Example_D();
		ec.function_one();
	}
	
	
	
}
