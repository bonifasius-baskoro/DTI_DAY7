package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
//        CalculateNumber test1 = new CalculateNumber();
//
//        try {
//            System.out.println("Average number you input: " + test1.calculateAverage());
//        }catch (DivideZeroException e){
//            System.out.println("You doesn't input any number");
//        }

        CSVReaderTest test23 = new CSVReaderTest();
        test23.CSVRead("/Users/jerr/codey/purwadhika/week1/Day7/src/main/resources/File/product_sales_data.csv");
//        System.out.println(test23.getMapCSV().get("Product_1").getTotalSold());
        System.out.print("Total Sales: ");
        System.out.printf("%.2f",test23.getTotalSales());

        System.out.println("\n");

        System.out.println("Total Product Sold: "+ test23.getTotalProductSold());

        System.out.println("Most bought product is " + test23.getMostBoughtProduct());
        System.out.println("Least bought product is " + test23.getLeastBoughtProduct());
//        System.out.println(test23.getMapCSV().get("Product_1").getSales());

        String a= "Ayam";
        System.out.println(a);
        a= "maya";
        System.out.println(a);

    }
}