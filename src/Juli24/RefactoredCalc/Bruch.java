package Juli24.RefactoredCalc;
/** Klasse für Bruch-Generation **/
public class Bruch
{

   private int zaehler = 0;
   private int nenner = 0;

   public Bruch(int zaehler, int nenner)
   {

      this.zaehler = zaehler;
      this.nenner = nenner;

   }

   @Override
   public String toString()
   {
      return zaehler + "/" + nenner;
   }


   public int getZaehler()
   {
      return zaehler;
   }


   public int getNenner()
   {
      return nenner;
   }

}
