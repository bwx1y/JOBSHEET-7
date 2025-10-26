import java.util.Scanner;

public class TiketBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int HARGA_TIKET = 50_000, jumlah = 0;
        double harga_penjualan = 0;
        boolean start = true;

        while (start) {
            System.out.print("Masukkan jumlah tiket: ");
            int inputTiket = sc.nextInt();

            if (inputTiket < 0) {
                System.out.println("Jumlah tiket tidak boleh kurang dari 0");
                continue;
            }

            if (inputTiket == 0) {
                System.out.println("Jumlah tiket tidak boleh 0");
                continue;
            }

            double discount = inputTiket > 10 ? 0.15 : inputTiket > 4 ? 0.1 : 0.0;
            double subtotal = (inputTiket * HARGA_TIKET);
            double totalBayar = subtotal * (1.0 - discount);

            System.out.printf("Subtotal : %,.2f %n", subtotal);
            System.out.printf("Diskon : %.0f%% %n", (discount * 100));
            System.out.printf("Total baya : %,.2f %n", totalBayar);

            System.out.println("=".repeat(100));
            jumlah += inputTiket;
            harga_penjualan += totalBayar;

            System.out.print("Apakah kamu mau melanjutkan transaksi ? (true/false) ");
            start = sc.nextBoolean();
        }

        System.out.println("\n=== Rekapitulasi Penjualan Hari Ini ===");
        System.out.println("Total tiket terjual: " + jumlah + " tiket");
        System.out.printf("Total penjualan: Rp %,.2f%n", harga_penjualan);

        System.out.println("=== Terima kasih ===");

    }
}
