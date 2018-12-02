import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        int taschenrechnerIntA =10; /*Meine Zahl für INT a */
        int taschenrechnerIntB =20; /*Meine Zahl für INT b*/

        double taschenrechnerDoubleA =10; /*Meine Zahl für DOUBLE b*/
        double taschenrechnerDoubleB =20; /*Meine Zahl für DOUBLE b*/

        /*Meine Methode wähle ich hier mit Taschenrechner = die Klasse und die Methode mit .add an und als Übergabe
        * gebe ich die oben definierten int/double Werte mit*/

        System.out.println(Taschenrechner.add(taschenrechnerIntA, taschenrechnerIntB));
        System.out.println(Taschenrechner.sub(taschenrechnerIntA, taschenrechnerIntB));
        System.out.println(Taschenrechner.div(taschenrechnerIntA, taschenrechnerIntB));
        System.out.println(Taschenrechner.mul(taschenrechnerIntA, taschenrechnerIntB));

        System.out.println(Taschenrechner.add1(taschenrechnerDoubleA, taschenrechnerDoubleB));
        System.out.println(Taschenrechner.sub1(taschenrechnerDoubleA, taschenrechnerDoubleB));
        System.out.println(Taschenrechner.div1(taschenrechnerDoubleA, taschenrechnerDoubleB));
        System.out.println(Taschenrechner.mul1(taschenrechnerDoubleA, taschenrechnerDoubleB));


        partialString(JOptionPane.showInputDialog(null, "Setzen Sie Ihr Passwort mit mindestens 3 Zeichen"));
    }

    private static void partialString(String a) /*WARUM MACHE ICH HIER PRIVATE ?*/
    {
        int b = a.length();
        if (b<3) /*Wenn die Eingabe kleiner 3 Zeichen ist wird sout ausgegeben mit "Die Eingabe war zu kurz"*/
        {
            System.out.println("Die Eingabe war zu kurz");
        }

        else
        {
            String c = a.substring(b/2); /*Zeigt genau die Hälfte meiner Eingabe an bzw. bei 5 Zeichen zeigt es mir die letzen 3 an*/
            System.out.println(c);
        }
    }
}
