package ClassiAstratte;

public class Triangolo extends Forma {
    double base;
    double altezza;
    public Triangolo(double base, double altezza){
        this.base=base;
        this.altezza=altezza;
    }

    @Override
    void calcolaArea() {
        double area = base*altezza/2;
        System.out.println("L'area del triangolo è: "+ area);
    }
}
