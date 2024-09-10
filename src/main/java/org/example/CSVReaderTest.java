package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class CSVReaderTest {

    HashMap<String, SalesData> mapCSV;
    double totalSales = 0;
    int totalProductSold = 0;
    String mostBoughtProduct ;
    String leastBoughtProduct ;
    int numberMostBoughtProduct;
    int numberLeastBoughtProduct ;


    public CSVReaderTest() {
        this.mapCSV = new HashMap<>();
        this.mostBoughtProduct = "";
        this.leastBoughtProduct = "";
        this.numberMostBoughtProduct = 0;
        this.numberLeastBoughtProduct = 1000000;
    }

    public HashMap<String, SalesData> getMapCSV() {
        return mapCSV;
    }

    public String getMostBoughtProduct() {
        return mostBoughtProduct;
    }

    public String getLeastBoughtProduct() {
        return leastBoughtProduct;
    }

    public void CSVRead(String fileName) {
        try {
            File myFile = new File(fileName);
            Scanner reader = new Scanner(myFile);
//            int checkColumn = reader.nextLine().split(",").length;
            String readLine = reader.nextLine();
            while (reader.hasNextLine()) {
                readLine = reader.nextLine();
                System.out.println(readLine);
                this.inputLineToArray(readLine);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");

        }
        ;
    }

    public static void testPrint(String fileName) {
        try {
            File myFile = new File(fileName);
            Scanner reader = new Scanner(myFile);
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");

        }
    }

    private void inputLineToArray(String lineData) {
        String[] arrOfStr = lineData.split(",");
        System.out.println(Arrays.toString(Arrays.stream(arrOfStr).toArray()));
        this.mapCSV.put(arrOfStr[0], new SalesData(arrOfStr[0],
                Integer.parseInt(arrOfStr[1]),
                Double.parseDouble(arrOfStr[2])));
        if(Integer.parseInt(arrOfStr[1])> this.numberMostBoughtProduct){
            this.mostBoughtProduct= arrOfStr[0];
            this.numberMostBoughtProduct= Integer.parseInt(arrOfStr[1]);
        }
        if(Integer.parseInt(arrOfStr[1])< this.numberLeastBoughtProduct){
            this.leastBoughtProduct= arrOfStr[0];
            this.numberLeastBoughtProduct= Integer.parseInt(arrOfStr[1]);
        }
    }

    public double getTotalSales() {
//        AtomicReference<Double> totalSales = new AtomicReference<>((double) 0);
//        this.mapCSV.Double.forEach((key, value)-> {
//            totalSales.updateAndGet(v -> new Double((double) (v + this.mapCSV.get(key).getTotalSold() * this.mapCSV.get(key).getItemPrice())));
//        });
        return this.mapCSV.values().stream().mapToDouble(SalesData::getSales).sum(); //[class.getsales, class2.getsales].sum()
    }

    public int getTotalProductSold() {
        return this.mapCSV.values().stream().mapToInt(SalesData::getTotalSold).sum();
    }

}


