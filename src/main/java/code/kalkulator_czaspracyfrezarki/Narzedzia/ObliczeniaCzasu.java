package code.kalkulator_czaspracyfrezarki.Narzedzia;

public class ObliczeniaCzasu {
    double czas;

    public double czas(int obrys, int glebokosc, double ap, double f){
        return czas = (((obrys)*(glebokosc / ap)) / f);
    }
}
