package GetterSetter.GetterSetter3;

import java.util.Arrays;

public class Carrello {
    double prezzoFinale;
    Auto[] automobili;

    public Carrello(Auto[] automobili) {
        setAutomobili(automobili);
    }

    public Auto[] getAutomobili() {
        return automobili;
    }

    public void setAutomobili(Auto[] automobili) {
        this.automobili = automobili;
    }

    public double getPrezzoFinale(boolean conIva) {
        double prezzoFinale = 0;
        for (Auto auto : automobili) {
            prezzoFinale += auto.getPrezzo(conIva);
        }
        return prezzoFinale;
    }

    @Override
    public String toString() {
        return "Carrello{" +
                "prezzoFinale=" + prezzoFinale +
                ", automobili=" + Arrays.toString(automobili) +
                '}';
    }
}
