package Pertemuan5;

import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
   private String semester;
    private double ips;
    private List<MataKuliah> daftarMataKuliah;

    public KartuHasilStudi(String semester){
        this.semester = semester;
        this.daftarMataKuliah = new ArrayList<>();
    }

    public void addMataKuliah(MataKuliah matakuliah){
        daftarMataKuliah.add(matakuliah);
    }

    public String display(){
        StringBuilder sb = new StringBuilder();
        for(MataKuliah mk : daftarMataKuliah){
            sb.append(mk.display());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void hitungIPS(){
        double totalSKS = 0;
        double totalNilai = 0;

        for(MataKuliah mataKuliah : daftarMataKuliah){
            totalSKS += mataKuliah.getSKS();
            totalNilai += mataKuliah.getSKS() * mataKuliah.nilaiIndex();
        }
        this.ips = totalSKS > 0 ? totalNilai / totalSKS : 0; // Menambahkan pengecekan untuk pembagian dengan 0
    }

    // Setter & Getter
    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void setIPS(double ips){
        this.ips = ips;
    }

    public double getIPS() {
        return ips;
    }

    public List<MataKuliah> getDaftarMataKuliah() {
        return daftarMataKuliah;
    }
}
