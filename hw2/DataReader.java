import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {
	
	public static Datum[] loadData(){
		Datum[] dataArray = new Datum[10000];
		
		try{
			BufferedReader bf = new BufferedReader(new FileReader("words.csv"));
			int count = 0;
			while(count < dataArray.length){
				dataArray[count] = parseLine(bf.readLine());
				count++;
			}
			bf.close();
		}
		catch(IOException e){
			System.out.println("File 'words.csv' not found.");
		}
		
		return dataArray;
	}
	
	private static Datum parseLine(String line){
		if(line == null)
			return null;
		
		String[] strPair = line.split(",");
		if(strPair.length == 2)
			return new Datum(new Word(strPair[0]), Integer.parseInt(strPair[1]));
		else
			return null;
	}
}