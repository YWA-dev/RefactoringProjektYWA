package Juli24.RefactoredCalc;

public class AdditionFractionCalculator implements DualFractionCalc {

    private int zaehler1;
    private int nenner1;
    private int zaehler2;
    private int nenner2;

    public AdditionFractionCalculator(Bruch bruch1, Bruch bruch2) {
        this.zaehler1 = zaehler1;
        this.nenner1 = nenner1;
        this.zaehler2 = zaehler2;
        this.nenner2 = nenner2;
    }

    public void ausfuehren(boolean jUnit){



    }


/*Implementation Addition zweier Brüche*/
    @Override
    public void berechneBruchAusZweiBruechen(Bruch bruch1, Bruch bruch2) {

        Bruch ergebnisBruch = new Bruch();
       int b1z = bruch1.getZaehler();
       int b1n = bruch1.getNenner();
       int b2z = bruch2.getZaehler();
       int b2n = bruch2.getNenner();
       int zaehler1xNenner2 = b1z*b2n;
       int zaehler2xNenner1 = b2z*b1n;
       int kreuzProdukt = zaehler1xNenner2 + zaehler2xNenner1;
        int gemNenner = b1n * b2n;

        System.out.println("Addition:");

        System.out.print(b1z+"/"+b1n+" "+b2z+"/"+b2n+" = "
                +zaehler1xNenner2+ "/"+ gemNenner+ " + " +zaehler2xNenner1+"/"+ gemNenner + " = "
                +kreuzProdukt+"/"+gemNenner);

    }
}
