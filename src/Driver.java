
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
			//r.lines()
			//.map(line -> line.split(","))
			//.flatMap(k -> Arrays.asList(k).stream())
			//.forEach(word -> System.out.println(word));
			
			
			
								
			return  (ArrayList<String>) r.lines()
					.map(line -> line.split(","))
					.flatMap(k -> Arrays.asList(k).stream())
					.collect(Collectors.toList());
			
		}
		
		
	}
	
	public static void main(String[] args) throws IOException{
		ArrayList<String> newList = streamParser();
		newList.forEach(s -> System.out.println(s));	
		//System.out.println(newList.size() + " arralist size");
	}
}
