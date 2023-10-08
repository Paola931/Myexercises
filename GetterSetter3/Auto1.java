package GetterSetter.GetterSetter3;

public class Auto {
    private final String cilindrata, targa, marca, modello;
   private double prezzo;
   private double iva;

    Auto(String cilindrata, String targa, String marca, String modello,double prezzo,double iva){
        this.cilindrata=cilindrata;
        this.targa=targa;
        this.marca=marca;
        this.modello=modello;
        this.prezzo=prezzo;
        this.iva=iva;
    }

    public String getCilindrata() {
        return cilindrata;
    }

    public String getModello() {
        return modello;
    }

    public String getMarca() {
        return marca;
    }

    public String getTarga() {
        return targa;
    }

    public double getPrezzo(boolean conIva) {
        if (conIva) {
            return prezzo + prezzo * iva;
        } else {
            return prezzo;
        }
    }
}
