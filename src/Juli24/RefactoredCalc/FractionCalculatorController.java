package Juli24.RefactoredCalc;
/*

Es sollte JUnit testbar sein
 public void testAddition() {
        String[] args = {"1", "3", "4", "5", "2"};
        FractionCalculator.main(args);
    }

* */

import Juli24.OriginalCalc.FractionCalculator;

public class FractionCalculatorController {
     static boolean JUnitTest = false;

    public static AdditionFractionCalculator additionCalc;

    public static SubstractionFractionCalculator substractionCalc;
    public static MultiplicationFractionCalculator multiplicationCalc;
    public static DivisionFractionCalculator divisionCalc;

    public static boolean IsJUnitTest() {
        return JUnitTest;
    }

    public static void setJUnitTest(boolean JUnitTest) {
        FractionCalculatorController.JUnitTest = JUnitTest;
    }

    public FractionCalculatorController() {

   //    this.additionCalc = new AdditionFractionCalculator();
        this.substractionCalc = new SubstractionFractionCalculator();
        this.multiplicationCalc = new MultiplicationFractionCalculator();
        this.divisionCalc = new DivisionFractionCalculator();
    }

    public static void main(String[] args) {
        FractionCalculatorController fractionCalculator = new FractionCalculatorController();
         JUnitTest = false;
        if( args.length > 0 )
        {
            JUnitTest = true;
        }





    }

  //  public void


}
