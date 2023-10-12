package Myexercises.Interfacce;

public class Triangolo implements Forma{
    double base;
    double altezza;
    Triangolo(double base,double altezza){
        this.base=base;
        this.altezza=altezza;
    }
    @Override
    public void calcolaArea() {
        double area = base*altezza/2;
        System.out.println("L'area del triangolo è: " + area);

    }
}
