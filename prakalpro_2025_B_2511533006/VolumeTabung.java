package pekan3;

import java.util.Scanner;

public class VolumeTabung {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double r, t, volume;

        System.out.print("Masukkan jari-jari tabung: ");
        r = input.nextDouble();

        System.out.print("Masukkan tinggi tabung: ");
        t = input.nextDouble();

        volume = 3.14 * r * r * t;

        System.out.println("Volume tabung = " + volume);

        input.close();
    }
}
