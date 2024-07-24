package Juli24.RefactoredCalc;

public class SubstractionFractionCalculator extends AbstractDualFractionCalculator {
    /** DONE **/
    public SubstractionFractionCalculator(Bruch[] doppelBruchArray) {
        setzeBruchParameter(doppelBruchArray);
        berechneBruchAusZweiBruechen(doppelBruchArray);
    }

    public void ausfuehren(boolean jUnit) {

    }

    /* Implementation Subtraktion zweier Brüche */
    @Override
    public Bruch berechneBruchAusZweiBruechen(Bruch[] brueche) {
        if (brueche.length != 2) {
            throw new IllegalArgumentException("Das Array darf nur zwei Brüche enthalten");
        }

        System.out.println("Subtraktion:");
        System.out.print(b1z + "/" + b1n + " - " + b2z + "/" + b2n + " = ");
        System.out.print(z1xn2 + "/" + gemNenner + " - " + z2xn1 + "/" + gemNenner + " = ");

        int subtraktionsProdukt = z1xn2 - z2xn1;
        System.out.print(subtraktionsProdukt + "/" + gemNenner);

        int gcd = berechneGroesstenGemNenner(subtraktionsProdukt, gemNenner);
        if (gcd > 1) {
            subtraktionsProdukt /= gcd;
            gemNenner /= gcd;
            System.out.println(" = " + subtraktionsProdukt + "/" + gemNenner);
        } else if (subtraktionsProdukt % gemNenner == 0) {
            System.out.println(" = " + (subtraktionsProdukt / gemNenner) + "/1");
        } else {
            System.out.println();
        }

        Bruch ergebnisBruch = new Bruch(subtraktionsProdukt, gemNenner);
        return ergebnisBruch;
    }
}
