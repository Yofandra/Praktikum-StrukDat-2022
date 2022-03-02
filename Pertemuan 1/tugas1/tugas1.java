public class tugas1{
    public static void main(String[] args){

        int tarif = 4500; 
        double ani, budi, bina, cita, total;

        ani = tarif*4;
        budi = tarif*15*0.95;
        bina = tarif*6;
        cita = tarif*11*0.95;
        total = ani+budi+bina+cita;

        System.out.println("Harga per Customer: ");
        System.out.println("Ani\t: Rp " + ani);
        System.out.println("Budi\t: Rp " + budi);
        System.out.println("Bina\t: Rp " + bina);
        System.out.println("Cita\t: Rp " + cita);
        System.out.println("Total pendapatan Smile laundry: Rp " + total);


    }
}