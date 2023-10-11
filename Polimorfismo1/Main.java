package Polimorfismo.Polimorfismo1;

public class Main {
    public static void main(String[]args){
        Forma forma = new Forma();
        Rettangolo rettangolo = new Rettangolo(5,10);
        Triangolo triangolo = new Triangolo(7,11);

        rettangolo.calcolaArea();
        triangolo.calcolaArea();
    }
}
