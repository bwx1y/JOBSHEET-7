import java.util.Scanner;

public class TempatParkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0, jenis = 0;

        do {
            System.out.println("Masukan jenis kendaraan : \n1. Mobil \n2. Motor \n0. Keluar");
            System.out.print("Pilihan: ");

            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukan Durasi: ");
                int durasi = sc.nextInt();

                if (durasi > 5) total += 12_500;
                else if (jenis == 1) total += durasi * 3_000;
                else total += durasi * 2_000;
            }
        } while (jenis != 0);

        System.out.printf("Total pembayaran : Rp.%,d %n", total);
        System.out.println("Terimakasih telah menggunakan aplikasi ini");
    }
}
