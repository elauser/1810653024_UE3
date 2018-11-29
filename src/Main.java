import javax.swing.*;

public class Main {
    public static void main(String[] args){
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
