package ClassiAstratte;

public class Main {
    public static void main (String[]args){
      Rettangolo rettangolo = new Rettangolo(8,12);
      Triangolo triangolo = new Triangolo(6,9);

      rettangolo.calcolaArea();
      triangolo.calcolaArea();

    }
}
