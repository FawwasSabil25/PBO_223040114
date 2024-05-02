package Pertemuan10.Tugas;

public class JenisKendaraan {
    protected String tipe;
    protected String merk;

    public JenisKendaraan(String tipe, String merk){
        this.tipe = tipe;
        this.merk = merk;
    }

    public String getTipe(){
        return tipe;
    }

    public String getMerk(){
        return merk;
    }
}
