import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        String[] aslab = {"Mas Ken", "Mas Zamzam", "Mas Rafi", "Mas Umam"};
        String lagi = "Kocok lagi!";

        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║   SIAPA ASLAB HARI INI?            ║");
        System.out.println("╚════════════════════════════════════╝");
        System.out.println();
        System.out.println("Siapa aslab yang akan ngajar hari ini?");
        System.out.println();
        System.out.print("Tekan ENTER untuk gacha... ");
        input.nextLine();

        System.out.println("\n Mengundi...");
        try {
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.println(".");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int hasil = random.nextInt(4);

        System.out.println("\n HASIL GACHA ");
        System.out.println("═══════════════════════════════════");
        System.out.println("Hari ini dapat: " + aslab[hasil] + "! ");
        System.out.println("═══════════════════════════════════");

        input.close();
    }
}