package Pertemuan10.Tugas;

public class Kendaraan extends JenisKendaraan{
    private int jmlahRoda;
    private String warna;

    public Kendaraan(int jmlahRoda, String warna, String tipe, String merk){
        super(tipe, merk);
        setJmlahRoda(jmlahRoda);
        setWarna(warna);
    }

    public int getJmlahRoda(){
        return jmlahRoda;
    }

    public String getWarna(){
        return warna;
    }

    public void setJmlahRoda(int jmlahRoda){
        this.jmlahRoda = jmlahRoda;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }
}
