package com.horstmann.places;

/*

javac -p ../automods/commons-csv-1.9.0.jar \
    ch12.sec08/module-info.java \
    ch12.sec08/com/horstmann/places/CSVDemo.java
    
java -p ../automods/commons-csv-1.9.0.jar:ch12.sec08 \
    -m ch12.sec08/com.horstmann.places.CSVDemo

Or more concisely:

javac -p ../automods --module-source-path . -d . -m ch12.sec08 
java -p ../automods:. -m ch12.sec08/com.horstmann.places.CSVDemo

*/

import java.io.*;
import org.apache.commons.csv.*;

public class CSVDemo {
   public static void main(String[] args) throws IOException {
      var in = new FileReader("countries.csv");
      Iterable<CSVRecord> records = CSVFormat.EXCEL.withDelimiter(';').withHeader().parse(in);
      for (CSVRecord record : records) {
         String name = record.get("Name");
         double area = Double.parseDouble(record.get("Area"));
         System.out.println(name + " has area " + area);
      }
   }
}
