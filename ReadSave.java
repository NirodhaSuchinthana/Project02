	/* Author : Suchinthana A.P.N.
				suchinthanaapn@gmail.com

		task : Read the content in tock.csv and save in a hashmap

		Created : 26/09/2017
					15:15:00

					<<<< compiles fine and runs for TestReadSave.java >>>>
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class ReadSave{
	Map<String,ItemDetails> stockList = new HashMap<String,ItemDetails>();

	BufferedReader reader;
	String line;

	String[] tokens;

	double price;
	double value;

	
	//read the given csv file
	public void readFile(){
		try{
			
			BufferedReader reader = new BufferedReader(new FileReader("stocks.csv"));

			String line = reader.readLine();
			line = reader.readLine();
			
			
			while(line!=null){

				tokens = line.split(",");

				String symbol = tokens[0];

				String details[] = {tokens[1],tokens[2],tokens[3],tokens[4],tokens[5]};

				if(tokens[5].equals("100")){
					value = Double.parseDouble(tokens[6]);
					price = value/100;
				}else if((tokens[6].equals("100"))&&(!tokens.equals("100"))){
					
					value = Double.parseDouble(tokens[7]);
					price = value/100;
					
				}else{
					value = Double.parseDouble(tokens[8]);
					price = value/100;
				}


				stockList.put(symbol,new ItemDetails(details,price));

				System.out.println(tokens[2]);
				line = reader.readLine();
			}

			reader.close();

		}catch(IOException e){
			System.out.println("File Not found");
		}
	}

	public Map<String,ItemDetails> getMap(){
		return stockList;
	}
	

}
