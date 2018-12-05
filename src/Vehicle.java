import javax.swing.*;

public class Vehicle {
    int power;
    double weight;
    String name;
    /*Hier setze ich meine Attribute welche ein Vehicle haben soll*/
    /*Wenn diese Static wären hätte jede Instanz diese Attribute*/



    public static String printName(String name)
    {
        return name;
        /*Gibt meinen festgelegten Namen bei a.name oder b.name wieder aus*/
    }

    public static void calculatePower (int power)
    {
        JOptionPane.showMessageDialog(null, + power +  " kw das entspricht " + power*1.36 + " PS" );
        /*Ich habe direkt meinem Ausgabefeld übergeben das es die power*1.36 rechnen soll*/
    }
}
