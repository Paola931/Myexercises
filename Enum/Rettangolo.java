package Myexercises.Enum;

public class Rettangolo extends Forma{
    double base;
    double altezza;
    private Tipo tipo;

    Rettangolo(double base, double altezza,  Tipo tipo){
        this.base=base;
        this.altezza=altezza;
        this.tipo=tipo;
    }

    @Override
    public void calcolaArea() {
        double area= base*altezza;
        System.out.println("L'area del rettangolo è: " + area);
    }

    @Override
    public String toString() {
        return "Rettangolo{" +
                "base=" + base +
                ", altezza=" + altezza +
                ",  tipo=" + tipo +
                '}';
    }
}
