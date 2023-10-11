package Polimorfismo.Polimorfismo1;

public class Triangolo extends Forma{
    double base;
    double altezza;
    public Triangolo(double base, double altezza){
        this.base=base;
        this.altezza=altezza;
    }
    @Override
    void calcolaArea() {
        double area= base*altezza/2;
        super.calcolaArea();
        System.out.print("triangolo è: " + area + "\n");
    }
}
