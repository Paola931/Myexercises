package Myexercises.Enum;

public class Main {
    public static void main(String[]args) {
        Rettangolo rettangolo = new Rettangolo(9.5, 14.6, Forma.Tipo.Rettangolare);
        Triangolo triangolo = new Triangolo(10.9, 25, Forma.Tipo.Triangolare);

        System.out.println(rettangolo);
        rettangolo.calcolaArea();
        System.out.println(triangolo);
        triangolo.calcolaArea();

    }
}