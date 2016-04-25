
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;


public class Driver {
	
	private static ArrayList streamParser() throws FileNotFoundException, IOException{
		try(BufferedReader r = new BufferedReader(new FileReader("AssetsImportCompleteSample.csv")))
		{
			return  (ArrayList) r.lines()
					.map(line -> Arrays.asList(line.split(",")))
					.collect(Collectors.toList());
		
		
		}
		
	}
	
	public static void main(String[] args) throws IOException{
		ArrayList newList = streamParser();
		Arrays.asList(newList).forEach(s -> System.out.println(s));	
		System.out.println(newList.size() + " arralist size");
	}
}
