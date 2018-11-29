import javax.swing.*;

public class Main {
    public static void main(String[] args){
        double taschenrechnerA = 10;
        double taschenrechnerB = 20;
        int tIntA = 10;
        int tIntB = 20;
        System.out.println(Taschenrechner.add(taschenrechnerA, taschenrechnerB));
        System.out.println(Taschenrechner.sub(taschenrechnerA, taschenrechnerB));
        System.out.println(Taschenrechner.div(taschenrechnerA, taschenrechnerB));
        System.out.println(Taschenrechner.mul(taschenrechnerA, taschenrechnerB));

        System.out.println(Taschenrechner.add(tIntA, tIntB));
        System.out.println(Taschenrechner.sub(tIntA, tIntB));
        System.out.println(Taschenrechner.div(tIntA, tIntB));
        System.out.println(Taschenrechner.mul(tIntA, tIntB));

        partialString(JOptionPane.showInputDialog(null, "Geben Sie eine Zahl ein di mindestens 3 Zeichen lang ist"));
    }
    private static void partialString(String a){
        int b = a.length();
        if (b < 3){
            System.out.println("Fehler, Eingabe zu Kurz");
        }
        else{
            String c = a.substring(b/2);
            System.out.println(c);
        }

    }
}