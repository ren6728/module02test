package javainputoutput;

import java.io.FileReader;
import java.io.IOException;

public class DataReader {
	public void readFile() throws IOException {
		String filePath="/Users/renxing/module02test/src/main/resources/Key-To-Success";
		FileReader fileReader=new FileReader(filePath);

		int i;
		while((i=fileReader.read()) != -1){
			System.out.print((char) i);
		}
	}
	public static void main(String[] args) throws IOException {

		/**
		 * Use API to read the below textFile and print to console.
		 * /src/main/resources/Key-To-Success
		 * Use FileReader class, no need to store in buffer
		 * Use try....catch block to handle Exception.
		 * Use ForEach loop/while loop/Iterator to retrieve data.
		 */
		DataReader dataReader=new DataReader();
		dataReader.readFile();
	}


}
