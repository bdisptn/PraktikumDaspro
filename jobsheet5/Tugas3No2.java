package jobsheet5;
import java.util.Scanner;

public class Tugas3No2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.println("--- Sistem Hotspot Kampus ---");
        System.out.println("Jenis Pengguna? (Dosen/Mahasiswa/lainnya): ");
        String jenisPengguna = sc.nextLine().trim();
    

        if (jenisPengguna.equalsIgnoreCase("Dosen")) {
            System.out.println("Akses WIFI diberikan (Dosen)");
        } else if (jenisPengguna.equalsIgnoreCase("Mahasiswa")) {
            System.out.println("Masukkan jumlah SKS yang diambil: ");
            int sks = sc.nextInt();
             if (sks >= 12) {
                System.out.println("Akses WIFI diberikan (Mahasiswa aktif)");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }
        } else {
            System.out.println("Akses ditolak");
        }
        
        sc.close();
    }    
}
