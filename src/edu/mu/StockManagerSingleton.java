package edu.mu;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StockManagerSingleton {

	private final static String fileName = "inventory.csv";
	
	private static StockManagerSingleton mInstance;
    private ArrayList<MediaProduct> inventory = null;
	
	public static StockManagerSingleton getInstance() {
        if(mInstance == null)
            mInstance = new StockManagerSingleton();

        return mInstance;
    }
	
	 private StockManagerSingleton() {
        inventory = new ArrayList<MediaProduct>();
      }
	 
    public ArrayList<MediaProduct> getArray() {
       return this.inventory;
     }
	
	    public boolean intializeStock() {
	    	MediaProduct product = null;
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
		            //System.out.println("Item: " + itemName + ", Price: " + price + ", Year: " + year + ", Genre: " + genre + ", Enum: " + enumGenre);
		            
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
		            
		            StockManagerSingleton.getInstance().addItem(product);
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
			if(newPrice > 0) {
				product.setPrice(newPrice);
				return true;
			}
			return false;
		}

		public boolean addItem(MediaProduct product) {
			if (!inventory.contains(product)) {
				inventory.add(product);
				return true;
			}
			return false;
		}
		
		public boolean removeItem(MediaProduct product) {
			if (inventory.contains(product)) {
				inventory.remove(product);
				return true;
			}
			return false;
		}
	
		//Saves the updated inventory back to the CSV file located at inventoryFilePath.
		//Overwrites the existing file with the updated inventory data.
		//Returns true if the saving is successful, false otherwise (file does not exist, or file empty).
		public boolean saveStock() {
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, false));
				//System.out.println("I'm good here");
				for(MediaProduct products: StockManagerSingleton.getInstance().getArray()) {
					
					if(products instanceof VinylRecordProduct) {
						String type = "Vinyl";
						bw.write(type + "," + products.getTitle() + "," + products.getPrice() + "," + products.getYear() + "," + products.getGenre());
					}
					else if(products instanceof CDRecordProduct) {
						//System.out.println("I'm good here too");
						String type = "CD";
						bw.write(type + "," + products.getTitle() + "," + products.getPrice() + "," + products.getYear() + "," + products.getGenre());
					}
					else if(products instanceof TapeRecordProduct) {
						String type = "Tape";
						bw.write(type + "," + products.getTitle() + "," + products.getPrice() + "," + products.getYear() + "," + products.getGenre());
					}	
				}
				bw.flush();
				bw.close();
				} catch (IOException e) {
					e.printStackTrace();
					return false;
				}
			return true;
		}
		
		//Gets the media products that are below the given maxPrice.
		//This creates a new ArrayList of media products that is below the maxPrice.
	    public ArrayList<MediaProduct> getMediaProductBelowPrice(int maxPrice) {
	    	ArrayList<MediaProduct> list = new ArrayList<MediaProduct>();
			for(MediaProduct products: StockManagerSingleton.getInstance().getArray()) {
				if(products.getPrice() < maxPrice) {
					list.add(products);
				}
			}
			//printListOfMediaProduct(list);
			return list;
		}
		
	    //Prints the given media product list.
		public void printListOfMediaProduct(ArrayList<MediaProduct> productList) {
			for(MediaProduct products: productList) {
				System.out.println(products.toString());
			}
		}
		
		//Gets the media products as an ArrayList.
		//This creates a new ArrayList of VinylRecordProduct that filters the vinyl records and returns the ArrayList.
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
		//This creates a new ArrayList of CDRecordProduct that filters the CD records and returns the ArrayList.
		public ArrayList<CDRecordProduct> getCDRecordsList(ArrayList<MediaProduct> productList) {
			ArrayList<CDRecordProduct> cdProductList = new  ArrayList<CDRecordProduct>();
			for(MediaProduct product : productList)
			{
				if(product instanceof CDRecordProduct) {
					cdProductList.add((CDRecordProduct)product);
				}
			}
			return cdProductList;
		}
	
		
		//Gets the media products as an ArrayList.
		//This creates a new ArrayList of TapeRecordProduct that filters the tape records and
		//returns the ArrayList.
		public ArrayList<TapeRecordProduct> getTapeRecordList(ArrayList<MediaProduct> productList) {
			ArrayList<TapeRecordProduct> tapeProductList = new  ArrayList<TapeRecordProduct>();
			for(MediaProduct product : productList)
			{
				if(product instanceof TapeRecordProduct) {
					tapeProductList.add((TapeRecordProduct)product);
				}
			}
			return tapeProductList;
		}
}
