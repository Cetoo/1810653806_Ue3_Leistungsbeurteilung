import javax.swing.*;

public class Aufruf
{
    public static void main(String[] args)
    {
     Vehicle a = new Vehicle();
     Vehicle b = new Vehicle();

     /*Hier erstelle ich eine neue Instanz a und b*/

     a.name = ("Audi");
     b.name = ("BMW");
     /*a.name ist meine Namenszuweisung für diese Instanz*/

        JOptionPane.showMessageDialog(null, "Ein " + a.name + " hat...");
        Vehicle.calculatePower(128);


        JOptionPane.showMessageDialog(null, "Ein " + b.name + " hat...");
        Vehicle.calculatePower(247);

        /*Bei calculatePower übergebe ich ihm in () den PS wert*/

    }
}
