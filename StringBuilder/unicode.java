package StringBuilder;

public class unicode {
    String testo = "ciao come stai";
    int posizione = 6;

    public unicode(String testo,int posizione){
        this.testo=testo;
        this.posizione=posizione;
    }

    public void stampaUnicode() {
        StringBuilder resultBuilder = new StringBuilder();

        if (posizione >= 0 && posizione < testo.length()) {
            char c = testo.charAt(posizione);
            resultBuilder.append("Il carattere in Unicode all'indice ")
                    .append(posizione)
                    .append(" è: ")
                    .append(String.format("\\u%04x", (int) c));
        } else {
            resultBuilder.append("Errore: indice non valido.");
        }

        String result = resultBuilder.toString();
        System.out.println(result);
    }
}

