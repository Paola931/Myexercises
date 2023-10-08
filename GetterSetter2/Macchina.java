package GetterSetter.GetterSetter2;

class Macchina {
 String cilindrata, targa, marca, modello;

  Macchina(String cilindrata, String targa, String marca, String modello){
     this.cilindrata=cilindrata;
     this.targa=targa;
     this.marca=marca;
     this.modello=modello;
 }

    @Override
    public String toString() {
        return "Macchina{" +
                "cilindrata='" + cilindrata + '\'' +
                ", targa='" + targa + '\'' +
                ", marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                '}';
    }

    private String getCilindrata() {
        return cilindrata;
    }
    private String getTarga() {
        return targa;
    }
    private String getMarca() {
        return marca;
    }
    private String getModello() {
        return modello;
    }
}
    /*Scrivere un programma che contenga una classe che definisce un Auto che abbia come proprietà cilindrata, targa, marca e modello.
        Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
        Nel main dichiarare un oggetto di tipo Auto.*/