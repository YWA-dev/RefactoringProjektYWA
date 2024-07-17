package Juli24.RefactoredCalc;

public class Bruch {

    private int zaehler = 0;
    private int nenner = 0;

    public Bruch(int zaehler, int nenner){

        this.zaehler=zaehler;
        this.nenner=nenner;

    }

    public Bruch() {
    }

    public void konsolenAusgabe(){

    }


    public int getZaehler() {
        return zaehler;
    }

    public void setZaehler(int zaehler) {
        this.zaehler = zaehler;
    }

    public int getNenner() {
        return nenner;
    }

    public void setNenner(int nenner) {
        this.nenner = nenner;
    }

//    public String ausgabe(){
//        return System.out.println();
//    }
}
