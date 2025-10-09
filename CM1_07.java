import java.util.Scanner;

public class CM1_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //INPUT DATA MAHASISWA
        System.out.println("============== INPUT DATA MAHASISWA ==============");
        System.out.print("Nama\t: ");
        String nama = sc.nextLine();
        System.out.print("NIM\t: ");
        String nim = sc.nextLine();

        //INPUT NILAI MATKUL 1
        System.out.println("\n--- Mata Kuliah 1: Algoritma dan Pemograman ---");
        System.out.print("Nilai UTS\t: ");
        double uts1 = sc.nextInt();
        System.out.print("Nilai UAS\t: ");
        double uas1 = sc.nextInt();
        System.out.print("Nilai Tugas\t: ");
        double tugas1 = sc.nextInt();

        //INPUT NILAI MATKUL 2
        System.out.println("\n--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS\t: ");
        double uts2 = sc.nextInt();
        System.out.print("Nilai UAS\t: ");
        double uas2 = sc.nextInt();
        System.out.print("Nilai Tugas\t: ");
        double tugas2 = sc.nextInt();

        //Mencari nilai akhir 1 & 2
        double nilaiAkhir1, nilaiAkhir2;
        nilaiAkhir1 = (0.3*uts1)+(0.4*uas1)+(0.3*tugas1);
        nilaiAkhir2 = (0.3*uts2)+(0.4*uas2)+(0.3*tugas2);
        
        //Konversi nilai akhir 1 ke nilai huruf
        String nilaiHuruf1;
        if (80 < nilaiAkhir1 && nilaiAkhir1 <= 100) {
                nilaiHuruf1 = "A";
        } else if (73 < nilaiAkhir1 && nilaiAkhir1 <= 80) {
                nilaiHuruf1 = "B+";
        } else if (65 < nilaiAkhir1 && nilaiAkhir1<= 73) {
                nilaiHuruf1 = "B";
        } else if (60 < nilaiAkhir1 && nilaiAkhir1 <= 65) {
                nilaiHuruf1 = "C+";
        } else if (50 < nilaiAkhir1 && nilaiAkhir1 <= 60) {
                nilaiHuruf1 = "C";
        } else if (39 < nilaiAkhir1 && nilaiAkhir1 <= 50) {
                nilaiHuruf1 = "D";
        } else {
                nilaiHuruf1 = "E";
        }

        //Konversi nilai akhir 2 ke nilai huruf
        String nilaiHuruf2;
        if (80 < nilaiAkhir2 && nilaiAkhir2 <= 100) {
                nilaiHuruf2 = "A";
        } else if (73 < nilaiAkhir2 && nilaiAkhir2 <= 80) {
                nilaiHuruf2 = "B+";
        } else if (65 < nilaiAkhir2 && nilaiAkhir2 <= 73) {
                nilaiHuruf2 = "B";
        } else if (60 < nilaiAkhir2 && nilaiAkhir2 <= 65) {
                nilaiHuruf2 = "C+";
        } else if (50 < nilaiAkhir2 && nilaiAkhir2 <= 60) {
                nilaiHuruf2 = "C";
        } else if (39 < nilaiAkhir2 && nilaiAkhir2 <= 50) {
                nilaiHuruf2 = "D";
        } else {
                nilaiHuruf2 = "E";
        }

        //Status kelulusan matkul
        String status;
        if (nilaiAkhir1 >= 60) {
            status = "LULUS";
        } else {
            status = "TIDAK LULUS";
        }

        //Rata-rata & Status Kelulusan semester
        double rata2;   
        String statusSmtr;
        rata2 = (nilaiAkhir1 + nilaiAkhir2)/2;
        if (status == "LULUS" && status == "LULUS") {
            statusSmtr = "LULUS";
            if (rata2 >= 70) {
                statusSmtr = "LULUS";
            } else {
                statusSmtr = "TIDAK LULUS";
            }
        } else {
            statusSmtr = "TIDAK LULUS";
        }


        //Output Penilaian Akademik
        System.out.println("\n================== HASIL PENILAIAN AKADEMIK ==================");
        System.out.println("Nama\t: " + nama);
        System.out.println("NIM\t: " + nim);
        
        System.out.println("\nMata Kuliah\t\tUTS\tUAS\tTugas\tNilai Akhir\tNIlai Huruf\tStatus");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("Algoritma Pemograman\t%.0f\t%.0f\t%.0f\t%.0f\t\t%s\t\t%s\n", uts1, uas1, tugas1, nilaiAkhir1, nilaiHuruf1, status);
        System.out.printf("Struktur Data\t\t%.0f\t%.0f\t%.0f\t%.0f\t\t%s\t\t%s\n", uts2, uas2, tugas2, nilaiAkhir2, nilaiHuruf2, status);
        System.out.println("\nRata-rata Nilai Akhir\t: "+ rata2);
        System.out.println("Status Semester\t: " + statusSmtr);
    
    }
}
