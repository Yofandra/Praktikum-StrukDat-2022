public class tanah{
    int panjang, lebar;

    tanah(int p, int l){
        panjang = p;
        lebar = l;
    }

    int luasTanah() {
        int luas = panjang*lebar;
        return luas;
    }
}