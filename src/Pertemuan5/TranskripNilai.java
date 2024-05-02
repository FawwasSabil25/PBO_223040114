package Pertemuan5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TranskripNilai {
    private Date tglCetak;
    private double ipk = 0.0;
    private List<KartuHasilStudi> kartuhasilstudi;
    private Mahasiswa mahasiswa;

    public TranskripNilai(Mahasiswa mahasiswa){
        super();
        this.mahasiswa = mahasiswa;

        kartuhasilstudi = new ArrayList<KartuHasilStudi>();
        tglCetak = new Date();
    }

    public void hitungIPK(){
        double totalNilai = 0.0;
        double totalSKS = 0.0;
    
        for (KartuHasilStudi khs : kartuhasilstudi) {
            List<MataKuliah> daftarMataKuliah = khs.getDaftarMataKuliah();
            for (MataKuliah mk : daftarMataKuliah) {
                totalNilai += mk.nilaiIndex() * mk.getSKS();
                totalSKS += mk.getSKS();
            }
        }

        // Memastikan tidak dibagi dengan nol
        if (totalSKS != 0) {
            ipk = totalNilai / totalSKS;
        } else {
            // Jika totalSKS sama dengan nol, maka set nilai IPK menjadi 0.0
            ipk = 0.0;
        }
    }

    public void addKHS(KartuHasilStudi khs){
        kartuhasilstudi.add(khs);
    }

    public void display(){
        System.out.println("NRP: " + mahasiswa.getNRP() + ", Nama: " + mahasiswa.getNama());
        System.out.println("Tanggal Cetak: " + tglCetak);
        System.out.println("IPK: " + ipk);
        for (KartuHasilStudi khs : kartuhasilstudi) {
            System.out.println(khs.display());
        }
    }

    //setter n getter
    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public Date getTglCetak() {
        return tglCetak;
    }

    public double getIpk() {
        return ipk;
    }

}
