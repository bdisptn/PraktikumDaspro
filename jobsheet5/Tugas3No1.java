package jobsheet5;
import java.util.Scanner;

public class Tugas3No1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pesan;

        System.out.println("--- Sistem Perpustakaan Kampus ---");
        System.out.print("Apakah membawa kartu mahasiswa? (Ya/Tidak): ");
        String bawaKartu = sc.nextLine().trim();
        System.out.print("Apakah sudah registrasi online? (Ya/Tidak): ");
        String registrasi = sc.nextLine().trim();

        if (bawaKartu.equalsIgnoreCase("Ya") && registrasi.equalsIgnoreCase("Ya")) {
            pesan = "Syarat terpenuhi. Silakan masuk";
        } else {
            pesan = "Syarat tidak terpenuhi. Anda tidak boleh masuk";
        }

        System.out.println(pesan);

        sc.close();    
    }
}
