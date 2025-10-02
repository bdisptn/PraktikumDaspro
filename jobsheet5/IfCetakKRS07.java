package jobsheet5;
import java.util.Scanner;

public class IfCetakKRS07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        //Ternary Operator
        String pesan = (uktLunas) ? "Pembayaran UKT terverifikasi.\nSilakan cetak KRS dan minta tanda tangan DPA" : "Registrasi ditolak.\nSilakan lunasi UKT terlebih dahulu";

        //Output pesan
        System.out.println(pesan);

        //IF-ELSE Operator
        if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("Registrasi ditolak");
            System.out.println("Silakan lunasi UKT terlebih dahulu");
        }    

            sc.close(); 
    }
    
}