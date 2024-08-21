package Juli24.RefactoredCalc;
/** Blueprint einer Klasse, die zwei Brüche verrechnet **/
public abstract class AbstractDualFractionCalculator
{
   protected int b1z;
   protected int b1n;
   protected int b2z;
   protected int b2n;
   protected int z1xn2;
   protected int z2xn1;
   protected int gemNenner;


   public abstract Bruch berechneBruchAusZweiBruechen(Bruch[] brueche);

   protected int berechneGroesstenGemNenner(int a, int b)
   {
      if( b == 0 )
      {
         return a;

      }

      return berechneGroesstenGemNenner(b, a % b);
   }

   protected void setzeBruchParameter(Bruch[] doppelBruchArray)
   {
      if( doppelBruchArray.length == 2 )
      {

         this.b1z = doppelBruchArray[0].getZaehler();
         this.b1n = doppelBruchArray[0].getNenner();
         this.b2z = doppelBruchArray[1].getZaehler();
         this.b2n = doppelBruchArray[1].getNenner();


      }
      else
      {
         throw new IllegalArgumentException("Das Array darf nur zwei Brüche enthalten.");
      }
   }

}
