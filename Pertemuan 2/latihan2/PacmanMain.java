import java.util.Scanner;

public class PacmanMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pacman a = new Pacman();

        System.out.print("Masukkan lebar arena : ");
        a.width = sc.nextInt();
        System.out.print("Masukkan panjang arena : ");
        a.height = sc.nextInt();

        for(;;){
            System.out.print("\nAction : \n1.Move Left\n2.Move Right\n3.Move Up\n4.Move Down\n5.Exit\nPilihan anda = ");
            int input = sc.nextInt();
            if (input == 1) {
                a.moveLeft();
                a.printPosition();
            } else if (input == 2) {
                a.moveRight();
                a.printPosition();
            } else if (input == 3) {
                a.moveUp();
                a.printPosition();
            } else if (input == 4) {
                a.moveDown();
                a.printPosition();
            } else {
                System.out.println("\nGame Over\n");
                break;
            }
        }

    }
}