package ClassiAstratte;

public class Rettangolo extends Forma {
    double base;
    double altezza;
    public Rettangolo(double base, double altezza){
        this.base=base;
        this.altezza=altezza;
    }

    @Override
    void calcolaArea() {
        double area = base*altezza;
        System.out.println("L'area del rettangolo è: "+ area);
    }
}
