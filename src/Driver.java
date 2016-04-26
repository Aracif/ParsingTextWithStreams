
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Driver {
	
	private static ArrayList<String> streamParser() throws FileNotFoundException, IOException{
		try(BufferedReader r = new BufferedReader(new FileReader("AssetsImportCompleteSample.csv")))
		{
			Function<String, String[]> sp = x -> x.split(",");
			
//			Splits via comma seperated value
//			r.lines()
//			.map(line -> Arrays.asList(line.split(",")))
//			.flatMap(k -> k.stream()).forEach(k->System.out.println(k));
			
			//Splits via comma seperated value AND takes out blanks
//			r.lines()
//			.map(line -> Arrays.asList(line.split(",")))
//			.flatMap(k -> k.stream())
//			.filter((blank) -> !blank.equals(""))
//			.forEach(nonBlank -> System.out.println(nonBlank));
			
			//Splits via comma seperated value
//			r.lines()
//			.map(line -> line.split(","))
//			.flatMap(k -> Arrays.asList(k).stream())
//			.forEach(word -> System.out.println(word));
			
			//Print the first 10 elements in stream
//			 r.lines()
//			.map(line -> line.split(","))
//			.flatMap(k -> Arrays.asList(k).stream())
//			.limit(10).forEach(s -> System.out.println(s));
			
			//add something to beginning and ending of every single csv val then
			//add it to an arraylist
//			ArrayList<String> f = new ArrayList<>();
//			 r.lines()
//			.map(line -> line.split(","))
//			.flatMap(k -> Arrays.asList(k).stream())
//			.forEach(word -> f.add(word = "****" + word + "*****"));			 
//			 f.forEach(word -> System.out.println(word));
			
			//Find all words that contain the word "CHANGE"
//			r.lines()
//			.map(line -> line.split(","))
//			.flatMap(k -> Arrays.asList(k).parallelStream())
//			.filter((aString) -> aString.contains("CHANGE"))
//			.forEach(word -> System.out.println(word));
					
													
			return  (ArrayList<String>) r.lines()
					.map(line -> line.split(","))
					.flatMap(k -> Arrays.asList(k).stream())
					.collect(Collectors.toList());
			
		}
		
		
	}
	
	public static void main(String[] args) throws IOException{
		ArrayList<String> newList = streamParser();
		//newList.forEach(s -> System.out.println(s));	
		
		
	}
}
