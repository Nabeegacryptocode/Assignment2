package Assignment2;
import java.util.ArrayList;

public class CashRegister {
    double total;
     static ArrayList<String> Receipt = new ArrayList<String>();
    public void Scancart(String name ,String price){
    total = total + Double.parseDouble(price);
    Receipt.add("Name:" + name + "\n Price:" + price);

    }

}
