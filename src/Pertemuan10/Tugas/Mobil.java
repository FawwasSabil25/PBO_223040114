package Pertemuan10.Tugas;

public class Mobil extends Kendaraan{
    private String platNomor;

    public Mobil(String platNomor, int jmlahRoda, String warna, String tipe, String merk){
        super(jmlahRoda, warna, tipe, merk);
        setPlatNomor(platNomor);
    }

    public String getPlatNomor(){
        return platNomor;
    }

    public void setPlatNomor(String platNomor){
        this.platNomor = platNomor;
    }
}
