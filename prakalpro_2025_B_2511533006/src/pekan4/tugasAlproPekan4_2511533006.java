package pekan4;

import java.util.Scanner;

public class tugasAlproPekan4_2511533006 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double berat, biayaPerKg, total;
        String tujuan;

        System.out.println("=== Program Biaya Pengiriman Paket ===");
        System.out.print("Masukkan tujuan pengiriman: ");
        tujuan = input.nextLine();
        System.out.print("Masukkan berat paket (kg): ");
        berat = input.nextDouble();
        input.close();

        if (tujuan.equalsIgnoreCase("Jakarta")) {
            biayaPerKg = 10000;
        } else if (tujuan.equalsIgnoreCase("Bandung")) {
            biayaPerKg = 12000;
        } else if (tujuan.equalsIgnoreCase("Padang")) {
            biayaPerKg = 15000;
        } else if (tujuan.equalsIgnoreCase("Palembang")) {
            biayaPerKg = 18000;
        } else {
            biayaPerKg = 20000;
        }

        total = berat * biayaPerKg;

        System.out.println("\nTujuan: " + tujuan);
        System.out.println("Berat Paket: " + berat + " kg");
        System.out.println("Biaya per kg: Rp " + biayaPerKg);
        System.out.println("Total biaya pengiriman: Rp " + total);
    }
}
