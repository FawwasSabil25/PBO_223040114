package Pertemuan4;

public class gelasMain {
    public static void main(String[] args) {
        gelas g1 = new gelas("Hitam");
        gelas g2 = new gelas("Biru");

        tukarWarnaGelas(g1,g2);
        System.out.println("warna g1: " + g1.getWarna());
        System.out.println("Warna g2: " + g2.getWarna());

        /*
         * hasil dari warna gelas yang ditampilkan sudah diproses terlebih dahulu di dalam fungsi
         * tukarWarnaGelas
         */
    }

    static void tukarWarnaGelas(gelas g1, gelas g2){
        gelas gTemp = new gelas("Temp");
        gTemp.setWarna(g1.getWarna());
        g1.setWarna(g2.getWarna());
        g2.setWarna(gTemp.getWarna());

        /*
         * dimana variable gTemp adalah variabel sementara yang digunakan untuk mentransisikan warna g1
         * agar dapat dipindahkan ke g2
         */
    }
}
