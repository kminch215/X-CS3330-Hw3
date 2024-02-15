package edu.mu;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StockManagerSingleton {

	public static void main(String[] args) {

	    //initializeStock
	}
	    public boolean intializeStock() {
	    	//read initial inventory data from a csv file located in src 
	    	//consider using the split() method for tokenization
	    	//parses the csv file to create media product objects and adds them to the inventory
	    	//return true if the initialization is successful else false <- catch
	    	System.out.println("false!");
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
			return null;
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
