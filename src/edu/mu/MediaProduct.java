package edu.mu;

public class MediaProduct {
	private String title;
	private double price;
	private int year;
	private Genre genre;
}
/*
Implement a base class MediaProduct with protected aLributes/fields !tle(String),
price(double), year(int) and genre(Genre). The genre should be represented using an enum.
• Create subclasses VinylRecordProduct, CDRecordProduct, and TapeRecordProduct, each
represenHng a different type of media product. Ensure these classes inherit from MediaProduct
and contain a constructor that uses the super keyword to iniHalize the aLributes.
• Implement copy constructors for each media product to prevent informaHon leaks.
*/