package edu.mu;

public class TapeRecordProduct extends MediaProduct {
    public TapeRecordProduct(String type, String title, double price, int year, Genre genre) {
        super(type, title, price, year, genre);
    }
public TapeRecordProduct(VinylRecordProduct other) {
    super(other.type, other.title, other.price, other.year, other.genre);
	}
}
