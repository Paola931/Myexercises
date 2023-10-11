package Ereditarieta.Ereditarieta2;

public class Rettangolo extends Forma {
    double base;
    double altezza;
    public Rettangolo(double base, double altezza){
        this.base=base;
        this.altezza=altezza;
    }
    @Override
    void calcolaArea() {
        double area= base*altezza;
        super.calcolaArea();
        System.out.print("rettangolo è: " + area);
    }
}
