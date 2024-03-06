package Pertemuan4;

public class MataKuliahMain {
    public static void main(String[] args) {
        //create objek mata kuliah
        MataKuliah mk1 = new MataKuliah("001", "Algoritma Pemrograman 1 ", "A", 3);
        MataKuliah mk2 = new MataKuliah("002", "Algoritma Pemrograman 2", "BC", 3);
        MataKuliah mk3 = new MataKuliah("003", "Pemrograman Berorientasi Objek", "B", 3);
        /*
         * data diinputkan keadalam variabel mk
         */
        
        //tampilkan daftar matakuliah
        System.out.println("--- DAFTAR MATAKULIAH ---");
        System.out.println(mk1.display());
        System.out.println(mk2.display());
        System.out.println(mk3.display());

        System.out.println("--- NILAI IPK ---");
        MataKuliah[] matKul = {mk1, mk2, mk3};
        double IPK = MataKuliah.hitungIPK(matKul);
        System.out.println("IPK : " + IPK);

        /*
         * variabel yang berisi data dipaggil untuk di proses kedalam fungsi
         * dan hasil dipaggil serta dimasukkan ke dalam variabel baru yaitu IPK
         */
    }
}
