package Juli24.RefactoredCalc;
/*

Es sollte JUnit testbar sein
 public void testAddition() {
        String[] args = {"1", "3", "4", "5", "2"};
        FractionCalculator.main(args);
    }

* */

import java.util.Scanner;

/**
 * Hier ist der Hauptcontroller der die verschiedenen Arten Brüche zu berechnen, zusammenführt
 **/

public class FractionCalculatorController {
    public static AdditionFractionCalculator additionCalc;
    public static SubstractionFractionCalculator substractionCalc;
    public static MultiplicationFractionCalculator multiplicationCalc;
    public static DivisionFractionCalculator divisionCalc;
    static boolean jUnitTest = false;

    Bruch[] brucharray = new Bruch[2];
    Scanner scanner = new Scanner(System.in);


    public FractionCalculatorController(boolean jUnitTest) {


        if (!jUnitTest) {
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
                    multiplicationCalc = new MultiplicationFractionCalculator();
                    break;
                case 4:
                    System.out.println("Division:");
                    divisionCalc = new DivisionFractionCalculator();
                    break;
                case 5:
                    System.out.println("Programm beenden");

                    break;

            }
        } else {
            //Junittest





        }
    }

    public static void main(String[] args) {
        if( args.length > 0 )
        {
            jUnitTest = true;
        }
        FractionCalculatorController fractionCalculator = new FractionCalculatorController(IsJUnitTest());

    }

    public static boolean IsJUnitTest() {
        return jUnitTest;
    }

    public static void setJUnitTest(boolean JUnitTest) {
        FractionCalculatorController.jUnitTest = JUnitTest;
    }

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