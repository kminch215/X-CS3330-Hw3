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
	
	public String title;

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
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
Implement a base class MediaProduct with protected attributes/fields title(String),				X
price(double), year(int) and genre(Genre). The genre should be represented using an enum.		X
• Create subclasses VinylRecordProduct, CDRecordProduct, and TapeRecordProduct, each			_
represenHng a different type of media product. Ensure these classes inherit from MediaProduct	Z
and contain a constructor that uses the super keyword to iniHalize the attributes.				_
• Implement copy constructors for each media product to prevent informaHon leaks.				_
*/
