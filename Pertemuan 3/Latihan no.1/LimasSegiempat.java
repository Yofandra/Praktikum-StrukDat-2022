public class LimasSegiempat{
    double sisi, tinggi;

    LimasSegiempat (double s, double t){
        sisi = s;
        tinggi = t;
    }

    double luasPermukaan() {
        double luasAlas = sisi*sisi;
        double luasSelimut = 4*(0.5*sisi*tinggi);
        double luas = luasAlas + luasSelimut;
        return luas;
    }

    double volumeLimas() {
        double luasAlas = sisi*sisi;
        double volume = (luasAlas*tinggi)/3;
        return volume;
    }
}