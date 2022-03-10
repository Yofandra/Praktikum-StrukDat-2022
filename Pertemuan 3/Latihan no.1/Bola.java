public class Bola{
    double jari;

    Bola(double r) {
        jari = r;
    }

    double luasPermukaan() {
        double luas = 4*Math.PI*jari*jari;
        return luas;
    }

    double volume() {
        double volume = (4*Math.PI*jari*jari*jari) /3;
        return volume;
    }
}