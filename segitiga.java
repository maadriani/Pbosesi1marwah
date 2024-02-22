import java.util.Scanner;

public class segitiga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi pertama: ");
        double sisi1 = scanner.nextDouble();

        System.out.print("Masukkan panjang sisi kedua: ");
        double sisi2 = scanner.nextDouble();

        System.out.print("Masukkan panjang sisi ketiga: ");
        double sisi3 = scanner.nextDouble();

        double keliling = sisi1 + sisi2 + sisi3;
        double setengahKeliling = keliling / 2;

        double luas = Math.sqrt(setengahKeliling * (setengahKeliling - sisi1) * (setengahKeliling - sisi2) * (setengahKeliling - sisi3));

        System.out.println("Keliling segitiga: " + keliling);
        System.out.println("luas segitiga: "+ luas);
        
    }
 }
 

        
        
