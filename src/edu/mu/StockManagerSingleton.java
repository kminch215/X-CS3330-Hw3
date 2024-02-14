package edu.mu;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StockManagerSingleton {
	public static void main(String[] args) {
	// Call the method to read from the CSV file
	    readFromCSV("inventory.csv");
	}

	public static void readFromCSV(String filename) {
	    try {
	        File file = new File(filename);
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
	            String itemName = parts[0];
	            double price = Double.parseDouble(parts[1]);
	            // Add more variables as needed

	            // Do something with the data, for example, print it
	            System.out.println("Item: " + itemName + ", Price: " + price);
	        }

	        scanner.close();
	    } catch (FileNotFoundException e) {
	        System.out.println("File not found: " + filename);
	        e.printStackTrace();
	    }
	    //public boolean intializeStock {
	    	
	    //}
	}
}

/*
Implement a singleton class StockManagerSingleton for managing the inventory of the shop.
• The StockManagerSingleton class should read the initial inventory from a CSV file
(inventory.csv) during initializaHon, update existing items, add new items, remove items, and
save the updated inventory back to the CSV file.
• The StockManagerSingleton class should have a String field called inventoryFilePath, which is
iniHalized to the relaHve path to the inventory.csv file, including the file name. However, make
sure that the field does not leak any informaHon and is closed for modificaHon.
*/

/*
public boolean initializeStock():
o 	Reads the initial inventory data from a CSV file located at inventoryFilePath.
	(Hint: Consider using the split() method for tokenizaHon.)
o 	Parses the CSV file to create media product objects and adds them to the inventory.
o 	Returns true if the iniHalizaHon is successful, false otherwise (file does not exist, or file empty).
• public boolean updateItemPrice(MediaProduct product, double newPrice):
o 	Updates the price of the given media product to the newPrice.
o	Returns true if the update is successful, false otherwise
• public boolean addItem(MediaProduct product):
o	Adds a new media product to the inventory.
o	Returns true if the addiHon is successful, false otherwise.
• public boolean removeItem(MediaProduct product):
o 	Removes the given media product from the inventory.
o 	Returns true if the removal is successful, false otherwise.
• public boolean saveStock():
o 	Saves the updated inventory back to the CSV file located at inventoryFilePath.
o 	Overwrites the exisHng file with the updated inventory data.
o 	Returns true if the saving is successful, false otherwise (file does not exist, or file empty).
• public ArrayList<MediaProduct> getMediaProductBelowPrice(int maxPrice):
o 	Gets the media products that are below the given maxPrice.
o 	This creates a new ArrayList of media products that is below the maxPrice. Beware of not leaking any informaHon.
• public void printListOfMediaProduct(ArrayList<MediaProduct> productList):
o	Prints the given media product list.
• public ArrayList<VinylRecordProduct> getVinylRecordList(ArrayList<MediaProduct> productList):
o 	Gets the media products as an ArrayList.
o	This creates a new ArrayList of VinylRecordProduct that filters the vinyl records and returns the ArrayList. Beware of not leaking any informaHon.
• public ArrayList<CDRecordProduct> getCDRecordsList(ArrayList<MediaProduct> productList):
o 	Gets the media products as an ArrayList.
o 	This creates a new ArrayList of CDRecordProduct that filters the CD records and returns the ArrayList. Beware of not leaking any informaHon.
• public ArrayList<TapeRecordProduct> getTapeRecordList(ArrayList<MediaProduct> productList):
o 	Gets the media products as an ArrayList.
o 	This creates a new ArrayList of TapeRecordProduct that filters the tape records and returns the ArrayList. Beware of not leaking any informaHon.
o 	Returns true if the iniHalizaHon is successful, false otherwise (file does not exist, or file
	empty).
• public boolean updateItemPrice(MediaProduct product, double newPrice):
o 	Updates the price of the given media product to the newPrice.
o 	Returns true if the update is successful, false otherwise
• public boolean addItem(MediaProduct product):
o 	Adds a new media product to the inventory.
o 	Returns true if the addiHon is successful, false otherwise.
• public boolean removeItem(MediaProduct product):
o 	Removes the given media product from the inventory.
o 	Returns true if the removal is successful, false otherwise.
• public boolean saveStock():
o 	Saves the updated inventory back to the CSV file located at inventoryFilePath.
o 	Overwrites the exisHng file with the updated inventory data.
o 	Returns true if the saving is successful, false otherwise (file does not exist, or file empty).
• 	public ArrayList<MediaProduct> getMediaProductBelowPrice(intmaxPrice):
o 	Gets the media products that are below the given maxPrice.
o 	This creates a new ArrayList of media products that is below the maxPrice. Beware of not leaking any informaHon.
• public void printListOfMediaProduct(ArrayList<MediaProduct> productList):
o 	Prints the given media product list.
• public ArrayList<VinylRecordProduct> getVinylRecordList(ArrayList<MediaProduct> productList):
o 	Gets the media products as an ArrayList.
o 	This creates a new ArrayList of VinylRecordProduct that filters the vinyl records and returns the ArrayList. Beware of not leaking any informaHon.
• public ArrayList<CDRecordProduct> getCDRecordsList(ArrayList<MediaProduct> productList):
o 	Gets the media products as an ArrayList.
o 	This creates a new ArrayList of CDRecordProduct that filters the CD records and returns the ArrayList. Beware of not leaking any informaHon.
• public ArrayList<TapeRecordProduct> getTapeRecordList(ArrayList<MediaProduct> productList):
o 	Gets the media products as an ArrayList.
o 	This creates a new ArrayList of TapeRecordProduct that filters the tape records and returns the ArrayList. Beware of not leaking any informaHon
*/
