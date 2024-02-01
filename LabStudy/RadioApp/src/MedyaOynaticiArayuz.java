import java.util.Scanner;

public class MedyaOynaticiArayuz implements Arayuzler {
    private MediaPlayer mediaPlayer;

    public MedyaOynaticiArayuz() {
        mediaPlayer = MediaPlayer.getInstance();
    }

    public void MedyaOynatArayuz(Kanal kanal, KanalListesi kanalListesi) {
        while (true) {
            System.out.println("1. Play");
            System.out.println("2. Stop");
            System.out.println("3. KanalDegis");
            System.out.println("4. Cikis Yap");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Select an option: ");
            int option = scanner.nextInt();

            if (option == 1) {
                mediaPlayer.play(kanal);
            } else if (option == 2) {
                mediaPlayer.stop(kanal);
            } else if (option == 3) {
                kanalListesi.kanalSec(this);
            } else if (option == 4) {
                break;
            } else {
                System.out.println("Invalid option");
            }
        }
    }
}
