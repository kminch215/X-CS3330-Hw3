# X-Homework_3

The assignment is to create a Java program for n inventory management system for a media product shop. There are two classes that are implemented: `MediaProduct` and `StockManagerSingleton`. 

**MediaProduct Class**: 
   - A class with protected fields for student attributes: title(String),price(double), year(int) and genre(Genre).
   - Has parameterized constructor, getter/setter methods, and a toString() method to display student information.

  **StockManagerSingleton Class**: 
   - A class uses the Singleton design pattern to ensure the the `StockManagerSingleton` class has one instance and evry other class has one global access point to the instance.
   - The `StockManagerSingleton` Class has one string field called inventoryFilePath
   - read the initial inventory from a CSV file (inventory.csv) during initialization, update existing items, add new items, remove items, and save the updated inventory back to the CSV file.
   - Additionally, we have our getMediaProductBelowPrice, printListOfMediaProduct, getVinylRecordList, getCDRecordsList, and getTapeRecordList methods implemented here.

### How to run:
1. First make sure to have a way to compile and run Java files. It also might help to have an IDE like Eclipse to run the code.
2. Implement a syntactically and logically correct program to put in the main() method in the Main Class. This method is going to be accessing the `StockManagerSingleton` class and calling the different methods to manage the media product shop.
   - To access the methods, use the syntax structure `StockManagerSingleton.getInstance()` followed by the method name you want to call.
   - To access the instance, use the syntax structure `StockManagerSingleton.getInstance().getArray()`
4. After saving the Main Class file, then run the code using your desired method. For this assignment we used the Run feature in the Eclipse IDE
