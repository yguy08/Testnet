package io.github.yguy08.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class YugeFileReader {
	/* 
	 * Stack Overflow Q&A:
	 * https://stackoverflow.com/questions/5868369/how-to-read-a-large-text-file-line-by-line-using-java/5868528#5868528
	 * I need to read a large text file of around 5-6 GB line by line using Java.
	 * How can I do this quickly?
	 */
	
	//A common pattern is to use
	//You can read the data faster if you assume there is no character encoding. e.g. ASCII-7 but it won't make much difference. 
	//It is highly likely that what you do with the data will take much longer.
	public static void commonBufferedReader(File file) throws FileNotFoundException, IOException{
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			String line;
			while ((line = br.readLine()) != null){
				System.out.println(line);
			}
		}
	}
	
	//A less common pattern to use which avoids the scope of line leaking:
	public static void lessCommonBufferedReader(File file) throws FileNotFoundException, IOException{
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			for(String line; (line = br.readLine()) != null; ){
				System.out.println(line);
			}
			//line is not visible here.
		}
	}
	
	//Java 8
	public static void streamExample(String fileName) throws IOException{
		try (Stream<String> stream = Files.lines(Paths.get(fileName))){
			stream.forEach(System.out::println);
		}
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		File file = new File(YugeFileReader.class.getResource("markets.csv").getFile());
		commonBufferedReader(file);
		lessCommonBufferedReader(file);
		streamExample(file.getAbsolutePath());
		System.out.println("Done!");
	}
}
