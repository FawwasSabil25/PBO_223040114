package Tugas2;

public class PembayaranDigital implements Pembayaran{
    private String email;

    public PembayaranDigital(String email){
        this.email = email;
    }

    @Override
    public boolean otentikasi(String pinInput){
        return true;
    }

    @Override
    public String encode(String pin){
        return pin;
    }
}
