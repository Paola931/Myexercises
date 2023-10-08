package GetterSetter.GetterSetter3;

public class Main3 {
    public static void main (String[]args){
        Auto auto1 = new Auto("1984 cm3","J248MBX","AlfaRomeo","Brera",5000,0.22);
        Auto auto2 = new Auto("1984 cm3","M568JZX","BMW","M6",6000,0.22);
        Auto auto3 = new Auto("1984 cm3","S347PUV","Mercedes","CLS",10000,0.22);
        Carrello carrello = new Carrello(new Auto [] {auto1,auto2,auto3});

        System.out.println("Il prezzo totale senza iva è:" + carrello.getPrezzoFinale(false));
        System.out.println("Il prezzo totale con iva inclusa è:" + carrello.getPrezzoFinale(true));
    }
}
