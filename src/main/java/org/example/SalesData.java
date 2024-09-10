package org.example;

public class SalesData {

    String id;
    int totalSold;
    double itemPrice;

    public SalesData(String id, int totalSold, double itemPrice) {
        this.id = id;
        this.totalSold = totalSold;
        this.itemPrice = itemPrice;
    }

    public String getId() {
        return id;
    }

    public int getTotalSold() {
        return totalSold;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public double getSales(){
        return totalSold*itemPrice;
    }
}
