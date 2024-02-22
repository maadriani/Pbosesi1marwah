import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class umur {
    public static void main(String[] args) {
        // Proses input
        Scanner scanner = new Scanner(System.in);
        //input Nama
        System.out.print("Masukkan Nama Anda: ");
        String nama = scanner.nextLine();
        //Input Tanggal/Bulan/Tahn
        System.out.print("Masukkan Tanggal Lahir (dd/MM/yyyy): ");
        String inputTanggalLahir = scanner.nextLine();

        /*
         * Menjalankan input dengan bantuan fungsi yang yang ada dalam java yaitu
         * dengan menggunakan fungsi DateTimeFormatter sehingga kita bisa membuat
         * kode lebih efisien tidak memerlukan banyak kode
         */
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate tanggalLahir = LocalDate.parse(inputTanggalLahir, formatter);
        LocalDate sekarang = LocalDate.now();
        Period usia = Period.between(tanggalLahir, sekarang);
        // Output
        System.out.println("Nama: " + nama);
        System.out.println("Usia Saat Ini: " + usia.getYears() + " tahun " + usia.getMonths() + " bulan " + usia.getDays() + " hari");

        scanner.close();
    }
}