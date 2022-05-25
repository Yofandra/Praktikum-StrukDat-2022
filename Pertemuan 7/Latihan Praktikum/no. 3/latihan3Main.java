public class latihan3Main {
    public static void main(String[] args) {
        int[] data = { 12, 17, 2, 1, 70, 50, 90, 17, 2, 90 };
        latihan3 x = new latihan3(data, data.length);
        int posisi;
        x.tampilarray();
        System.out.println();
        System.out.println("Setelah disorting :");
        x.selectionSort();
        x.tampilarray();
        x.mencarinilaiterbesar();
        posisi = x.FindBinarySearch(x.max, 0, x.arr.length - 1);
        System.out.println();
        x.TampilPosisi(x.max, posisi);
    }
}
