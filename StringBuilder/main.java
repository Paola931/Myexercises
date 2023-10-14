package StringBuilder;

public class main {
    public static void main(String[]args){
        String testo = "ciao come stai";
        int posizione = 6;

        unicode printer = new unicode(testo,posizione);
        printer.stampaUnicode();
    }
}
