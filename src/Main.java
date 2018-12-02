import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {



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
