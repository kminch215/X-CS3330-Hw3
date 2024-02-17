package edu.mu;

public class CDRecordProduct extends MediaProduct {
    public CDRecordProduct(String type, String title, double price, int year, Genre genre) {
        super(type, title, price, year, genre);
    }
    public CDRecordProduct(VinylRecordProduct other) {
        super(other.type, other.title, other.price, other.year, other.genre);
    }
}
