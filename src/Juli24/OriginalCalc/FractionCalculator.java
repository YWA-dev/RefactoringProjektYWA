
package Juli24.OriginalCalc;
import java.util.Scanner;
public class FractionCalculator
{
    public static int ergebnisEins, ergebnisZwei;
    public static void main(String[] args)
    {
        ergebnisEins = 0;
        ergebnisZwei = 0;
        boolean jUnit = false;
        if( args.length > 0 )
        {
            jUnit = true;
        }
        Scanner scanner = new Scanner(System.in);
         /*
         while( true ) Wenn Junit test true ist, (das Programm mit übergebenen Argumenten gestartet wurde)
          hört die Schleife nach einem Durchgang auf.
           */
        {
            System.out.println("Hauptmenü:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraktion");
            System.out.println("3. Multiplikation");
            System.out.println("4. Division");
            System.out.println("5. Programm beenden");
            System.out.print("Wähle eine Option: ");
            int option = 5;
            if( !jUnit )
            {
                option = scanner.nextInt();
            }
            else
            {
                option = Integer.parseInt(args[0]);
                System.out.println(option);
            }
            if( option == 5 )
            {
                System.out.println("Programm beendet.");
   //             break;
            }
            int zaehlerErsterBruch, nennerZweiterBruch, zaehlerZweiterBruch, nennerErsterBruch = 0;
            if( !jUnit )
            {
                System.out.print("Gib den Zähler des ersten Bruchs ein: ");
                zaehlerErsterBruch = scanner.nextInt();
                System.out.print("Gib den Nenner des ersten Bruchs ein: ");
                nennerErsterBruch = scanner.nextInt();
                System.out.print("Gib den Zähler des zweiten Bruchs ein: ");
                zaehlerZweiterBruch = scanner.nextInt();
                System.out.print("Gib den Nenner des zweiten Bruchs ein: ");
                nennerZweiterBruch = scanner.nextInt();
            }
            else
            {
                zaehlerErsterBruch = Integer.parseInt(args[1]);
                nennerErsterBruch = Integer.parseInt(args[2]);
                zaehlerZweiterBruch = Integer.parseInt(args[3]);
                nennerZweiterBruch = Integer.parseInt(args[4]);
            }
            int c1, c2, gemNenner, kreuzprodukt, e2 = 0;
            switch( option )
            {






                case 1:
                    System.out.println("Addition:");
                    if( (nennerZweiterBruch == 0) || (nennerErsterBruch == 0) )
                    {
                        System.out.println("Ungültige Division. Nenner darf nicht null sein.");
                        break;
                    }
                    System.out.print(zaehlerErsterBruch + "/" + nennerErsterBruch + " + " + zaehlerZweiterBruch + "/" + nennerZweiterBruch + " = ");
                    c1 = zaehlerErsterBruch * nennerZweiterBruch;
                    c2 = nennerErsterBruch * zaehlerZweiterBruch;
                    gemNenner = nennerErsterBruch * nennerZweiterBruch;

                    System.out.print(c1 + "/" + gemNenner + " + " + c2 + "/" + gemNenner + " = ");
                    kreuzprodukt = c1 + c2;
                    e2 = gemNenner;
                    ergebnisEins = kreuzprodukt;
                    ergebnisZwei = e2;
                    System.out.print(ergebnisEins + "/" + ergebnisZwei);
                    while( e2 != 0 )
                    {
                        int temp = e2;
                        e2 = kreuzprodukt % e2;
                        kreuzprodukt = temp;
                    }
                    if( kreuzprodukt > 1 )
                    {
                        ergebnisEins /= kreuzprodukt;
                        ergebnisZwei /= kreuzprodukt;
                        System.out.println(" = " + ergebnisEins + "/" + ergebnisZwei);
                    }
                    System.out.println("");
                    System.out.println("");
                    break;







                case 2:
                    System.out.println("Subtraktion:");
                    if( (nennerZweiterBruch == 0) || (nennerErsterBruch == 0) )
                    {
                        System.out.println("Ungültige Division. Nenner darf nicht null sein.");
                        break;
                    }
                    System.out.print(zaehlerErsterBruch + "/" + nennerErsterBruch + " - " + zaehlerZweiterBruch + "/" + nennerZweiterBruch + " = ");
                    c1 = zaehlerErsterBruch * nennerZweiterBruch;
                    c2 = nennerErsterBruch * zaehlerZweiterBruch;
                    gemNenner = nennerErsterBruch * nennerZweiterBruch;
                    gemNenner = nennerZweiterBruch * nennerErsterBruch;
                    System.out.print(c1 + "/" + gemNenner + " - " + c2 + "/" + gemNenner + " = ");
                    kreuzprodukt = c1 - c2;
                    e2 = gemNenner;
                    ergebnisEins = kreuzprodukt;
                    ergebnisZwei = e2;
                    System.out.print(kreuzprodukt + "/" + e2);
                    while( e2 != 0 )
                    {
                        int temp = e2;
                        e2 = kreuzprodukt % e2;
                        kreuzprodukt = temp;
                    }
                    if( kreuzprodukt > 1 )
                    {
                        ergebnisEins /= kreuzprodukt;
                        ergebnisZwei /= kreuzprodukt;
                        System.out.println(" = " + ergebnisEins + "/" + ergebnisZwei);
                    }
                    System.out.println("");
                    System.out.println("");
                    break;







                case 3:
                    System.out.println("Multiplikation:");
                    if( (nennerZweiterBruch == 0) || (nennerErsterBruch == 0) )
                    {
                        System.out.println("Ungültige Division. Nenner darf nicht null sein.");
                        break;
                    }
                    System.out.print(zaehlerErsterBruch + "/" + nennerErsterBruch + " * " + zaehlerZweiterBruch + "/" + nennerZweiterBruch + " = ");
                    kreuzprodukt = zaehlerErsterBruch * zaehlerZweiterBruch;
                    e2 = nennerErsterBruch * nennerZweiterBruch;
                    ergebnisEins = kreuzprodukt;
                    ergebnisZwei = e2;
                    System.out.print(kreuzprodukt + "/" + e2);
                    while( e2 != 0 )
                    {
                        int temp = e2;
                        e2 = kreuzprodukt % e2;
                        kreuzprodukt = temp;
                    }
                    if( kreuzprodukt > 1 )
                    {
                        ergebnisEins /= kreuzprodukt;
                        ergebnisZwei /= kreuzprodukt;
                        System.out.println(" = " + ergebnisEins + "/" + ergebnisZwei);
                    }
                    System.out.println("");
                    System.out.println("");
                    break;








                case 4:
                    System.out.println("Division:");
                    if( (nennerZweiterBruch == 0) || (nennerErsterBruch == 0) )
                    {
                        System.out.println("Ungültige Division. Nenner darf nicht null sein.");
                        break;
                    }
                    System.out.print(zaehlerErsterBruch + "/" + nennerErsterBruch + " : " + zaehlerZweiterBruch + "/" + nennerZweiterBruch + " = ");
                    c1 = zaehlerZweiterBruch;
                    c2 = nennerZweiterBruch;
                    System.out.print(zaehlerErsterBruch + "/" + nennerErsterBruch + " * " + c2 + "/" + c1 + " = ");
                    kreuzprodukt = zaehlerErsterBruch * c2;
                    e2 = nennerErsterBruch * c1;
                    ergebnisEins = kreuzprodukt;
                    ergebnisZwei = e2;
                    if( ergebnisZwei == 0 )
                    {
                        System.out.println("Ungültige Division. Nenner darf nicht null sein.");
                    }
                    else
                    {
                        System.out.print(kreuzprodukt + "/" + e2);
                        while( e2 != 0 )
                        {
                            int temp = e2;
                            e2 = kreuzprodukt % e2;
                            kreuzprodukt = temp;
                        }
                        if( kreuzprodukt > 1 )
                        {
                            ergebnisEins /= kreuzprodukt;
                            ergebnisZwei /= kreuzprodukt;
                            System.out.println(" = " + ergebnisEins + "/" + ergebnisZwei);
                        }
                    }
                    System.out.println("");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Ungültige Option. Bitte wähle erneut.");
            }
            if( jUnit )
            {
     //           break;
            }
        }
        scanner.close();
    }
}