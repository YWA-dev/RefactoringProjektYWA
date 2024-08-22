package Juli24.RefactoredCalc;

import java.util.Scanner;
/** Main Controller Klasse**/

public class FractionCalculatorController {
   public static AdditionFractionCalculator additionCalc;
   public static SubstractionFractionCalculator substractionCalc;
   public static MultiplicationFractionCalculator multiplicationCalc;
   public static DivisionFractionCalculator divisionCalc;
   static boolean jUnitTest = false;
   static String[] args;


   public FractionCalculatorController(boolean jUnitTest, String[] args) {
      FractionCalculatorController.jUnitTest = jUnitTest;
      FractionCalculatorController.args = args;

      if (!jUnitTest) {
         /** Normale Ausführung per Usereingabe **/
         runNormal();
      } else {
         /** Junit Test Ausführung, nur per Argumente **/
         runJUnitTest();
      }
   }

   private void runNormal() {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Hauptmenu \n" +
                         "1. Addition \n" +
                         "2. Subtraktion \n" +
                         "3. Multiplikation \n" +
                         "4. Division \n" +
                         "5. Programm beenden \n" +
                         "Wähle eine Option:");

      int option = scanner.nextInt();

      switch (option) {
         case 1:
            System.out.println("Addition:");
            additionCalc = new AdditionFractionCalculator(bruchAbfrage());
            break;
         case 2:
            System.out.println("Subtraktion:");
            substractionCalc = new SubstractionFractionCalculator(bruchAbfrage());
            break;
         case 3:
            System.out.println("Multiplikation:");
            multiplicationCalc = new MultiplicationFractionCalculator(bruchAbfrage());
            break;
         case 4:
            System.out.println("Division:");
            divisionCalc = new DivisionFractionCalculator(bruchAbfrage());
            break;
         case 5:
            System.out.println("Programm beendet.");
            break;
         default:
            System.out.println("Ungültige Option.");
      }
   }

   private void runJUnitTest() {
      if (args.length != 5) {
         throw new IllegalArgumentException("Für JUnit-Tests werden 5 Argumente benötigt.");
      }

/** Die mitgelieferten Argumente werden ausgewertet, anstelle der User Eingabe **/
      int option = Integer.parseInt(args[0]);
      int zaehler1 = Integer.parseInt(args[1]);
      int nenner1 = Integer.parseInt(args[2]);
      int zaehler2 = Integer.parseInt(args[3]);
      int nenner2 = Integer.parseInt(args[4]);

      Bruch bruch1 = new Bruch(zaehler1, nenner1);
      Bruch bruch2 = new Bruch(zaehler2, nenner2);
      Bruch[] brueche = {bruch1, bruch2};

      switch (option) {
         case 1:
            System.out.println("Addition:");
            additionCalc = new AdditionFractionCalculator(brueche);
            break;
         case 2:
            System.out.println("Subtraktion:");
            substractionCalc = new SubstractionFractionCalculator(brueche);
            break;
         case 3:
            System.out.println("Multiplikation:");
            multiplicationCalc = new MultiplicationFractionCalculator(brueche);
            break;
         case 4:
            System.out.println("Division:");
            divisionCalc = new DivisionFractionCalculator(brueche);
            break;
         case 5:
            System.out.println("Programm beendet.");
            break;
         default:
            System.out.println("Ungültige Option.");
      }
   }

   public static void main(String[] args) {
      boolean jUnit = args.length > 0;
      new FractionCalculatorController(jUnit, args);
   }

   /** Methode zur Abfrage der Brüche **/
   public Bruch[] bruchAbfrage() {
      Scanner scanner = new Scanner(System.in);

      // Erster Bruch
      System.out.print("Gib den Zähler des ersten Bruchs ein: ");
      int zaehler1 = scanner.nextInt();
      System.out.print("Gib den Nenner des ersten Bruchs ein: ");
      int nenner1 = scanner.nextInt();
      Bruch bruch1 = new Bruch(zaehler1, nenner1);

      // Zweiter Bruch
      System.out.print("Gib den Zähler des zweiten Bruchs ein: ");
      int zaehler2 = scanner.nextInt();
      System.out.print("Gib den Nenner des zweiten Bruchs ein: ");
      int nenner2 = scanner.nextInt();
      Bruch bruch2 = new Bruch(zaehler2, nenner2);

      return new Bruch[]{bruch1, bruch2};
   }
}
