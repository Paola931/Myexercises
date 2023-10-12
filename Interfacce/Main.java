package Myexercises.Interfacce;

public class Main {
    public static void main(String []args){
        Rettangolo rettangolo = new Rettangolo(5.3,12.9);
        Triangolo triangolo = new Triangolo(7.7,18.2);

        triangolo.calcolaArea();
        rettangolo.calcolaArea();
    }
}
