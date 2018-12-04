import javax.swing.*;

public class Vehicle {
    int power;
    double weight;
    String name;

    protected String printName(){
        return name;
    }
    protected void calculatePower(){
        JOptionPane.showMessageDialog(null, power*1.36 + " PS");
    }
}
