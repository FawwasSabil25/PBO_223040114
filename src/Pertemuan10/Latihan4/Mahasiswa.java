package Pertemuan10.Latihan4;

public class Mahasiswa extends Orang{
    private String nrp;

    public Mahasiswa(String nrp, String nama, String alamat){
        super();
        setNrp(nrp);
    }

    public String getNrp(){
        return nrp;
    }

    public void setNrp(String nrp){
        this.nrp = nrp;
    }
}
