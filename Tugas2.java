import java.util.Scanner;

public class Tugas2 {
    // Method untuk menghitung luas dan keliling persegi
    public static void hitungPersegi(double sisi) {
        double luas = sisi * sisi;
        double keliling = 4 * sisi;
        System.out.println("Luas Persegi: " + luas);
        System.out.println("Keliling Persegi:" + keliling);
    }

    // Method untuk menghitung luas dan keliling persegi panjang
    public static void hitungPersegiPanjang(double panjang, double lebar) {
        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);
        System.out.println("Luas Persegi Panjang: " + luas);
        System.out.println("Keliling Persegi Panjang: " + keliling);
    }

    // Method untuk menghitung luas dan keliling lingkaran
    public static void hitungLingkaran(double jariJari) {
        double luas = Math.PI * (jariJari * jariJari);
        double keliling = 2 * Math.PI * jariJari;
        System.out.println("Luas Lingkaran: " + luas);
        System.out.println("Keliling Lingkaran: " + keliling);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih bangun datar: ");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");

        System.out.print("Masukkan pilihan Anda (1-3): ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan sisi persegi: ");
                double sisi = scanner.nextDouble();
                hitungPersegi(sisi);
                break;

            case 2:
                System.out.print("Masukkan panjang persegi panjang: ");
                double panjang = scanner.nextDouble();
                System.out.print("Masukkan lebar persegi panjang: ");
                double lebar = scanner.nextDouble();
                hitungPersegiPanjang(panjang, lebar);
                break;

            case 3:
                System.out.print("Masukkan jari-jari lingkaran: ");
                double jariJari = scanner.nextDouble();
                hitungLingkaran(jariJari);
                break;

            default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                break;
        }

        scanner.close();
    }
}