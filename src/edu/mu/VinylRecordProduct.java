package edu.mu;

public class VinylRecordProduct extends MediaProduct {
    public VinylRecordProduct(String type, String title, double price, int year, Genre genre) {
        super(type, title, price, year, genre);
    }

    public VinylRecordProduct(VinylRecordProduct other) {
        super(other.type, other.title, other.price, other.year, other.genre);
    }
}
