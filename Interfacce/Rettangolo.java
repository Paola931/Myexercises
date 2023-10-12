package Myexercises.Interfacce;

public class Rettangolo implements Forma {
    double base;
    double altezza;
    Rettangolo(double base,double altezza){
        this.base=base;
        this.altezza=altezza;
    }
    @Override
    public void calcolaArea() {
        double area = base*altezza;
        System.out.println("L'area del rettangolo è: " + area);

    }
}
