package Assignment2;

import java.io. * ;
import java.util.Scanner;
public class FileReader {

    String name;
    String price;



    public FileReader() {
    }
    public void read(String productid) throws Exception {
        ;String [] products;

        File file = new File( "/Users/new/Desktop/assignment2architecture/src/Assignment2/products.txt");
        int i = 0;
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
             products = line.split(",");

            if (products[0].equalsIgnoreCase(productid)) {
                name = products[1];
                price = products[2];
        }


        }
    }
 public void main(String[] args) {
     FileReader fileReader = new FileReader();
     try {
         fileReader.read("1");
     } catch (Exception e) {
         e.printStackTrace();

     }
        System.out.println(fileReader.name);
        System.out.println(fileReader.price);
 }
}
