package Tugas2;

public class Main {
    public static void main(String[] args) {
        PembayaranDigital pembayaranDigital = new PembayaranDigital("ex@ex.com");

        System.out.println("Otentikasi: " + pembayaranDigital.otentikasi("456"));
        System.out.println("Encoded PIN: " + pembayaranDigital.encode("456"));
    }
}

