package Tugas;

public class Main {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga(3, 2, 1, 1, 2);

        System.out.println("## Luas Segitiga ##");
        System.out.println("Luas Segitiga : " + segitiga.hitungLuas() + "\n");

        System.out.println("## Keliling Segitiga ##");
        System.out.println("Keliling Segitiga : " + segitiga.hitungKeliling());
    }
}