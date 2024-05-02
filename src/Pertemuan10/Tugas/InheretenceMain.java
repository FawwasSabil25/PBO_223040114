package Pertemuan10.Tugas;

public class InheretenceMain {
    public static void main(String[] args) {
        Mobil mbl = new Mobil("B 86 GT", 4, "Biru", "ZN6", "Toyota");
        System.out.println(mbl.getTipe()+
                                "-" + mbl.getMerk()+
                                "-" + mbl.getJmlahRoda()+
                                "-" + mbl.getWarna()+
                                "-" + mbl.getPlatNomor());
    }
}
