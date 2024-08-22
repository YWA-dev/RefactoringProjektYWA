package Juli24.RefactoredCalc;

public class AdditionFractionCalculator extends AbstractDualFractionCalculator
{
   public AdditionFractionCalculator(Bruch[] doppelBruchArray)
   {
      setzeBruchParameter(doppelBruchArray);
      berechneBruchAusZweiBruechen(doppelBruchArray);
   }


   /*Implementation Addition zweier Brüche*/
   @Override
   public Bruch berechneBruchAusZweiBruechen(Bruch[] brueche)
   {
      if( brueche.length != 2 )
      {
         throw new IllegalArgumentException("Das Array darf nur zwei Brüche enthalten");
      }

      /** Berechnung Addition **/
      int z1xn2 = b1z * b2n;
      int z2xn1 = b2z * b1n;
      int kreuzProdukt = z1xn2 + z2xn1;
      int gemNenner = b1n * b2n;

      System.out.println("Addition:");
      System.out.print(b1z + "/" + b1n + " + " + b2z + "/" + b2n + " = ");
      System.out.print(z1xn2 + "/" + gemNenner + " + " + z2xn1 + "/" + gemNenner + " = ");
      System.out.print(kreuzProdukt + "/" + gemNenner);

      int gcd = berechneGroesstenGemNenner(kreuzProdukt, gemNenner);

      /** Kürzen des Bruchs **/
      if( gcd > 1 )
      {
         kreuzProdukt /= gcd;
         gemNenner /= gcd;
         System.out.println(" = " + kreuzProdukt + "/" + gemNenner);
      }
      else if( kreuzProdukt % gemNenner == 0 )
      {
         System.out.println(" = 1/1");
      }
      else
      {
         System.out.println();
      }

      Bruch ergebnisBruch = new Bruch(kreuzProdukt, gemNenner);
      return ergebnisBruch;
   }


}
