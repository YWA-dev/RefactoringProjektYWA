package Juli24.RefactoredCalc;

public class DivisionFractionCalculator extends AbstractDualFractionCalculator
{

   public DivisionFractionCalculator(Bruch[] doppelBruchArray)
   {
      setzeBruchParameter(doppelBruchArray);
      berechneBruchAusZweiBruechen(doppelBruchArray);
   }

   @Override
   public Bruch berechneBruchAusZweiBruechen(Bruch[] brueche)
   {
      if( brueche.length != 2 )
      {
         throw new IllegalArgumentException("Das Array darf nur zwei Brüche enthalten");
      }

      /** Berechnung Division **/
      int b1z = brueche[0].getZaehler();
      int b1n = brueche[0].getNenner();
      int b2z = brueche[1].getZaehler();
      int b2n = brueche[1].getNenner();

      int ergebnisZaehler = b1z * b2n;
      int ergebnisNenner = b1n * b2z;

      if( ergebnisNenner == 0 )
      {
         throw new ArithmeticException("Division durch Null ist nicht erlaubt.");
      }

      int gcd = berechneGroesstenGemNenner(ergebnisZaehler, ergebnisNenner);

      /** Kürzen des Bruchs **/
      if( gcd > 1 )
      {
         ergebnisZaehler /= gcd;
         ergebnisNenner /= gcd;
      }

      Bruch ergebnisBruch = new Bruch(ergebnisZaehler, ergebnisNenner);

      System.out.println("Division:");
      System.out.print(b1z + "/" + b1n + " : " + b2z + "/" + b2n + " = ");
      System.out.print(b1z + "/" + b1n + " * " + b2n + "/" + b2z + " = ");
      System.out.print(b1z * b2n + "/" + b1n * b2z + " = ");
      System.out.print(ergebnisZaehler + "/" + ergebnisNenner);
      return ergebnisBruch;
   }
}
