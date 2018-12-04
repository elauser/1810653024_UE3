import javax.swing.*;

public class Aufruf {
    public static void main(String[] args){
        Vehicle Auto1 = new Vehicle();
        Auto1.name = "Mazda";
        Auto1.power = 100;
        Auto1.weight = 1600;

        Vehicle Auto2 = new Vehicle();
        Auto2.name = "Legacy";
        Auto2.power = 160;
        Auto2.weight = 1700;
        JOptionPane.showMessageDialog(null, Auto2.printName());
        Auto1.calculatePower();
    }
}
