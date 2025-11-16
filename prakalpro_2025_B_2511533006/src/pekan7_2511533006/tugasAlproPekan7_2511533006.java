package pekan7_2511533006;
import java.util.Scanner;
import java.util.InputMismatchException;

class Akun {
    private String username;
    private String password;
    private String email;
    private int pinAngka;
    
    public Akun(String username, String password, String email, int pinAngka) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.pinAngka = pinAngka;
    }
    
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getEmail() { return email; }
    public int getPinAngka() { return pinAngka; }
    
    public boolean isPasswordValid() {
        return password != null && password.length() >= 8;
    }
    
    public boolean isEmailValid() {
        return email != null && email.contains("@") && email.contains(".");
    }
}

public class tugasAlproPekan7_2511533006 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- REGISTRASI AKUN BARU ---");
        
        // Input data Pengguna Akun
        System.out.print("Masukkan Username: ");
        String username = scanner.nextLine();
        
        System.out.print("Masukkan Password: ");
        String password = scanner.nextLine();
        
        System.out.print("Masukkan Email: ");
        String email = scanner.nextLine();
        
        // Input PIN dengan output Error
        int pinAngka = 0;
        boolean validPin = false;
        
        while (!validPin) {
            try {
                System.out.print("Masukkan PIN (6 digit): ");
                pinAngka = scanner.nextInt();
                scanner.nextLine(); // membersihkan newline character
                
                // Validasi panjang PIN
                if (String.valueOf(pinAngka).length() == 6) {
                    validPin = true;
                } else {
                    System.out.println("Error: PIN harus 6 digit! Silakan coba lagi.\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: PIN harus berupa angka! Silakan coba lagi.\n");
                scanner.nextLine(); // membersihkan input yang invalid
            }
        }
        
        Akun akun = new Akun(username, password, email, pinAngka);
        
        if (akun.isPasswordValid() && akun.isEmailValid()) {
            System.out.println("\n--- REGISTRASI BERHASIL ---");
            System.out.println("Akun untuk \"" + akun.getUsername() + "\" telah berhasil dibuat.");
            
            System.out.println("\n--- Detail Akun ---");
            System.out.println("Username (Lowercase): " + akun.getUsername().toLowerCase());
            System.out.println("Email (Uppercase): " + akun.getEmail().toUpperCase());
            System.out.println("ID Pengguna (Gabungan): " + akun.getUsername() + akun.getPinAngka());
            
            System.out.println("\n--- Uji Tipe Data (PIN Anda: " + akun.getPinAngka() + ") ---");
            System.out.println("PIN (int) + 10 = " + (akun.getPinAngka() + 10));
            System.out.println("PIN (String) + \"10\" = " + akun.getPinAngka() + "10");
        } else {
            // Registrasi gagal
            System.out.println("\n--- REGISTRASI GAGAL ---");
            
            if (!akun.isPasswordValid()) {
                System.out.println("Password Anda tidak valid (minimal 8 karakter).");
            }
            
            if (!akun.isEmailValid()) {
                System.out.println("Email Anda \"" + akun.getEmail() + "\" tidak valid (harus mengandung '@' dan '.').");
            }
            
            System.out.println("Silakan coba lagi.");
        }
        
        scanner.close();
    }
}