package pekan2;

public class ContohChar {
	public static void main(String[] args) {
		//  Menampilkan nilai variabel char
		char huruf1 = 'A';
		char huruf2 = 'B';
		char angka = '5';
		char simbol = '#';
		
		System.out.println("Contoh Variabel Char :");
		System.out.println("Huruf pertama :" + huruf1);
		System.out.println("Huruf kedua :" + huruf2);
		System.out.println("Angka :" + angka);
		System.out.println("Simbol :" + simbol);
		
		char huruf3 = (char) (huruf1 + 1);
		System.out.println("huruf1 + 1 = " + huruf3);
		
		int kodehuruf = huruf1;
		String biner1 = String.format("%8s", Integer.toBinaryString(huruf1)).replace(' ', '0');
		System.out.println("Kode ASCII dari " + huruf1 + " = " + kodehuruf);
		System.out.println("Kode BIner dari " + huruf1 + " = " + biner1);
		
		String kata = "" + huruf1 + huruf2 + angka + simbol;
		System.out.println("Gabungan char jadi string : " + kata);
		

	}

}

