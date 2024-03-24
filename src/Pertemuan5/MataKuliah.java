package Pertemuan5;

public class MataKuliah {
    private String kode;
    private String nama;
    private int sks;
    private String indexNilai;

    public MataKuliah(String kode, String nama, String indexNilai, int sks){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.indexNilai = indexNilai;
    }

    //setter n getter
    public void setKode(String kode){
        this.kode = kode;
    }

    public String getKode(){
        return kode;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setSKS(int sks){
        this.sks = sks;
    }

    public int getSKS(){
        return sks;
    }

    public void setIndexNilai(String indexNilai){
        this.indexNilai = indexNilai;
    }

    public String getIndexNilai(){
        return indexNilai;
    }

    public double nilaiIndex(){
        switch (indexNilai.toUpperCase()) {
            case "A":
                return 4.0;
            case "B":
                return 3.0;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            case "E":
                return 0.0;
            default:
                return 0.0;
        }
    }

    public Object display() {
        return kode + " - " + nama + " - " + indexNilai + " - " + sks;
    }

}
