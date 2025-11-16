package pekan6_2511533006;

import java.util.Scanner;

public class TugasPerulanganWhileatauDoWhilePekan6_2511533006 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jawab;
        int percobaan = 0;
        boolean menang = false;

        do {
            int dadu1 = (int)(Math.random() * 6) + 1;
            int dadu2 = (int)(Math.random() * 6) + 1;
            int total = dadu1 + dadu2;

            percobaan++;

            System.out.println(dadu1 + " + " + dadu2 + " = " + total);

            if (total == 7) {
                System.out.println("Tebakan Anda Benar");
                System.out.println("Anda menang setelah " + percobaan + " percobaan!");
                menang = true;
                break;
            } else {
                System.out.println("Tebakan Anda Salah");
                System.out.print("Apakah mau lempar dadu (ya / tidak?) ");
                jawab = input.nextLine();

                if (jawab.equalsIgnoreCase("tidak")) {
                    System.out.println("Anda gagal menang");
                    break;
                }
            }
        } while (!menang);

        input.close();
    }

}
