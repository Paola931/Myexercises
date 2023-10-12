package Myexercises.Enum;

public class Triangolo extends Forma {
    double base;
    double altezza;
    Tipo tipo;

    Triangolo(double base,double altezza, Tipo tipo){
        this.base=base;
        this.altezza=altezza;
        this.tipo=tipo;
    }

    @Override
    public void calcolaArea() {
        double area= base*altezza/2;
        System.out.println("L'area del triangolo è: " + area);
    }

    @Override
    public String toString() {
        return "Triangolo{" +
                "base=" + base +
                ", altezza=" + altezza +
                ", tipo=" + tipo +
                '}';
    }
}
