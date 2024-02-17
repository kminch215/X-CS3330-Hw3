package edu.mu;

import java.util.ArrayList;

public class Main {  
	public static void main(String[] args) {
	// Call the method to read from the CSV file
		
	    StockManagerSingleton.getInstance();
	    
	    boolean error = StockManagerSingleton.getInstance().intializeStock();
	    
	    ArrayList<VinylRecordProduct> name = StockManagerSingleton.getInstance().getVinylRecordList(StockManagerSingleton.getInstance().getArray());
	    
	    for(VinylRecordProduct products: name) {
			System.out.println(products.toString());
		}
	    
	    System.out.println();
	    
	    ArrayList<CDRecordProduct> cdName = StockManagerSingleton.getInstance().getCDRecordsList(StockManagerSingleton.getInstance().getArray());
	    
	    for(CDRecordProduct products: cdName) {
			System.out.println(products.toString());
		}
	    
	    System.out.println();
	    
	    ArrayList<TapeRecordProduct> tapeName = StockManagerSingleton.getInstance().getTapeRecordList(StockManagerSingleton.getInstance().getArray());
	    
	    for(TapeRecordProduct products: tapeName) {
			System.out.println(products.toString());
		}
	    
	}

}