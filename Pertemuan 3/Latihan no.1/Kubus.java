class Kubus{
    int sisi;

    Kubus (int s){
        sisi = s;
    }

    int luasPermukaan(){
        return sisi*sisi*6;

    }
    int volume(){
        return sisi*sisi*sisi;
    }
}