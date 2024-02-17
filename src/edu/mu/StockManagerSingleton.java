package edu.mu;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import edu.mu.MediaProduct.Genre;

public class StockManagerSingleton {

	private String fileName = "inventory.csv";
	private ArrayList<MediaProduct> inventory = new ArrayList<MediaProduct>();
	
	    public boolean intializeStock() {
	    	MediaProduct product;
	    	try {
		        File file = new File(fileName);
		        Scanner scanner = new Scanner(file);
	            // Skip the header if present
		        if (scanner.hasNextLine()) {
		            scanner.nextLine(); // Assuming the first line is a header, if not remove this line
		        }

		        // Read the data
		        while (scanner.hasNextLine()) {
		            String line = scanner.nextLine();
		            String[] parts = line.split(","); // Assuming the CSV is comma-separated

		            // Access each part of the CSV row
		            String mediaType = parts[0];
		            String itemName = parts[1];
		            double price = Double.parseDouble(parts[2]);
		            int year = Integer.parseInt(parts[3]);
		            String genre = parts[4];
		            Genre enumGenre = Genre.valueOf(genre);
		            // Add more variables as needed

		            // Do something with the data, for example, print it
		            System.out.println("Item: " + itemName + ", Price: " + price + ", Year: " + year + ", Genre: " + genre + ", Enum: " + enumGenre);
		            
		            if(mediaType.equals("CD")) {
	                	product = new CDRecordProduct(itemName, price, year, enumGenre);
	                }
	                else if(mediaType.equals("Vinyl"))
	                {
	                	product = new VinylRecordProduct(itemName, price, year, enumGenre);
	                }
	                else if(mediaType.equals("Tape"))
	                {
	                	product = new TapeRecordProduct(itemName, price, year, enumGenre);
	                }
		        }

		        scanner.close();
		    } catch (FileNotFoundException e) {
		        System.out.println("File not found: " + fileName);
		        e.printStackTrace();
		        return false;
		    }
	    	return true;
	    }
	    
		public boolean updateItemPrice(MediaProduct product, double newPrice) {
			return false;
		}
		//Updates the price of the given media product to the newPrice.
		//Returns true if the update is successful, false otherwise
		public boolean addItem(MediaProduct product) {
			return false;
		}
		//Adds a new media product to the inventory.
		//Returns true if the addiHon is successful, false otherwise.
		public boolean removeItem(MediaProduct product) {
			return false;
		}
		//Removes the given media product from the inventory.
		//Returns true if the removal is successful, false otherwise.
		public boolean saveStock() {
			return false;
		}
		//Saves the updated inventory back to the CSV file located at inventoryFilePath.
		//Overwrites the exisHng file with the updated inventory data.
		//Returns true if the saving is successful, false otherwise (file does not exist, or file empty).
		
		public ArrayList<MediaProduct> getMediaProductBelowPrice(int maxPrice) {
			return null;
		}
		//Gets the media products that are below the given maxPrice.
		//This creates a new ArrayList of media products that is below the maxPrice.
			//scanner.close();
		public void printListOfMediaProduct(ArrayList<MediaProduct> productList) {
		}
		//Prints the given media product list.
		
		public ArrayList<VinylRecordProduct> getVinylRecordList(ArrayList<MediaProduct> productList) {
			ArrayList<VinylRecordProduct> vinylProductList = new  ArrayList<VinylRecordProduct>();
			for(MediaProduct product : productList)
			{
				if(product instanceof VinylRecordProduct) {
					vinylProductList.add((VinylRecordProduct)product);
				}
			}
			return vinylProductList;
		}
		//Gets the media products as an ArrayList.
		//This creates a new ArrayList of VinylRecordProduct that filters the vinyl records and returns the ArrayList.
		//scanner.close();
		
		public ArrayList<CDRecordProduct> getCDRecordsList(ArrayList<MediaProduct> productList) {
			return null;
		}
		//Gets the media products as an ArrayList.
		//This creates a new ArrayList of CDRecordProduct that filters the CD records and returns the ArrayList.
		//scanner.close();
		public ArrayList<TapeRecordProduct> getTapeRecordList(ArrayList<MediaProduct> productList) {
			return null;
		}
		//Gets the media products as an ArrayList.
		//This creates a new ArrayList of TapeRecordProduct that filters the tape records and
		//returns the ArrayList.
		//scanner.close();
}
