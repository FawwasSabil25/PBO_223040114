package Tugas2;

public abstract class NomorPembayaran implements Pembayaran{
    public String kodePembayaran;

    public NomorPembayaran(String kodePembayaran){
        this.kodePembayaran = kodePembayaran;
    }

    public String getkodePembayran(){
        return kodePembayaran;
    }
}
