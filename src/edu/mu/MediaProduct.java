package edu.mu;

public class MediaProduct {
	
	protected double price;
	protected int year;
	protected Genre genre;
	
	public enum Genre {
		ROCK,
		POP,
		JAZZ,
		CLASSICAL,
		HIP_HOP,
		ELECTRONIC,
		CHILDREN
	}
	
	private String title;

	private String getTitle() {
		return title;
	}
	private void setTitle(String title) {
		this.title = title;
	}
	private double getPrice() {
		return price;
	}
	private void setPrice(double price) {
		this.price = price;
	}
	private int getYear() {
		return year;
	}
	private void setYear(int year) {
		this.year = year;
	}
	private Genre getGenre() {
		return genre;
	}
	private void setGenre(Genre genre) {
		this.genre = genre;
	}
	
	public MediaProduct(String title, double price, int year, Genre genre) {
		this.title = title;
		this.price = price;
		this.year = year;
		this.genre = genre;
	}
}
/*
Implement a base class MediaProduct with protected atributes/fields title(String),
price(double), year(int) and genre(Genre). The genre should be represented using an enum.
• Create subclasses VinylRecordProduct, CDRecordProduct, and TapeRecordProduct, each
represenHng a different type of media product. Ensure these classes inherit from MediaProduct
and contain a constructor that uses the super keyword to iniHalize the aLributes.
• Implement copy constructors for each media product to prevent informaHon leaks.
*/
