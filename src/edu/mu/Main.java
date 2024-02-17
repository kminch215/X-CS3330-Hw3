package edu.mu;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {  
	public static void main(String[] args) {
	// Call the method to read from the CSV file
	    StockManagerSingleton.getInstance();
	    
	    boolean error = StockManagerSingleton.getInstance().intializeStock();
	    
	}

}