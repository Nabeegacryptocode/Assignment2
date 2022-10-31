package Assignment2;//import scanner class
import java.util.Scanner;
public class Keyboard  {
    public Keyboard() {
    }
    //Get Product Code
    public String getProductCode(String productCode) {

        return productCode;
    }
    public int pay(double price,String amountPaid) {
        int change = (int) (Double.parseDouble(amountPaid) - price);
        return change;

    }


    }


