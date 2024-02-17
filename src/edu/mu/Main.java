package edu.mu;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {  
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
