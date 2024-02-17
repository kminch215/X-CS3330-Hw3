package edu.mu;

public class MediaProduct {
	protected String type;
    protected String title;
    protected double price;
    protected int year;
    protected Genre genre;

    public MediaProduct(String type, String title, double price, int year, Genre genre) {
        this.type = type;
        this.title = title;
        this.price = price;
        this.year = year;
        this.genre = genre;
    }

    public static void main(String[] args) {
    }
	public String getType() {
        return type;
    }
	public void setType() {
		System.out.println(type);
	}
    public String getTitle() {
        return title;
    }
    public void setTitle() {
		System.out.println(title);
    }
    public double getPrice() {
        return price;
    }
    public void setPrice() {
		System.out.println(price);
    }
    public int getYear() {
        return year;
    }
    public void setYear() {
		System.out.println(year);
    }
    public Genre getGenre() {
        return genre;
    }
    public void setGenre() {
		System.out.println(genre);
    }

}
