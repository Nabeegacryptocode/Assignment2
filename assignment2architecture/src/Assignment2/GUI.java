package Assignment2;
//IMPORT JAVA SWING

import javax.swing.*;

public class GUI {
    public GUI() {

    }
    public static void main(String[] args) throws Exception {
        CashRegister  cashRegister = new CashRegister();
        FileReader fileReader = new FileReader();
        Display display = new Display();
        Keyboard keyboard = new Keyboard();



        JFrame frame = new JFrame("Cash Register");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
        JOptionPane.showMessageDialog(frame, "Welcome to the Cash Register");
        String name = JOptionPane.showInputDialog(frame, "What is your name?");
        String phone = JOptionPane.showInputDialog(frame, "What is your phone number?");
        String productcd = JOptionPane.showInputDialog(frame ,"Enter Product Code: ");
        fileReader.read(productcd);

        JOptionPane.showMessageDialog(frame, "Product Code: " + productcd+" \nName:  " + fileReader.name + " \nprice: "+ fileReader.price + "\n Do you want to add to cart?");
        cashRegister.Scancart(fileReader.name,fileReader.price);
        JOptionPane.showMessageDialog(frame,"Do you want to add more items to cart?");
        String productcd2 = JOptionPane.showInputDialog(frame ,"Enter Product Code: ");
        fileReader.read(productcd2);
        JOptionPane.showMessageDialog(frame, "Product Code: " + productcd2+" \nName:  " + fileReader.name + " \nprice: "+ fileReader.price + "\n Do you want to add to cart?");
        cashRegister.Scancart(fileReader.name,fileReader.price);
        JOptionPane.showMessageDialog(frame,"Do you want to add more items to cart?");
        String productcd3 = JOptionPane.showInputDialog(frame ,"Enter Product Code: ");
        fileReader.read(productcd3);
        JOptionPane.showMessageDialog(frame, "Product Code: " + productcd3+" \nName:  " + fileReader.name + " \nprice: "+ fileReader.price + "\n Do you want to add to cart?");
        cashRegister.Scancart(fileReader.name,fileReader.price);
        JOptionPane.showMessageDialog(frame,"Do you want to add more items to cart?");
        String productcd4 = JOptionPane.showInputDialog(frame ,"Enter Product Code: ");
        fileReader.read(productcd4);
        JOptionPane.showMessageDialog(frame, "Product Code: " + productcd4+" \nName:  " + fileReader.name + " \nprice: "+ fileReader.price + "\n Do you want to add to cart?");
        cashRegister.Scancart(fileReader.name,fileReader.price);
        JOptionPane.showMessageDialog(frame,"Total items\n"+CashRegister.Receipt + "\n Total: " + cashRegister.total);
        String amountPaid = JOptionPane.showInputDialog(frame ,"Enter Amount Paid: ");
        JOptionPane.showMessageDialog(frame,"Receipt" + CashRegister.Receipt + "\nChange: " + keyboard.pay(cashRegister.total,amountPaid)+ "\n Name: " + name + "\n Phone: " + phone);
        JOptionPane.showMessageDialog(frame,"Thank you for shopping with us , " + name);
        display.display(name,"this is your total"+cashRegister.total);





    }
}
