package Pertemuan3;

public class Latihan7 {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = l1;

        System.out.println(l1.getJari2()); //5
        System.out.println(l2.getJari2()); //5

        ubahJari2(l2); //value l2 diubah dengan fungsi ubahNrp

        System.out.println(l1.getJari2()); //4 (krna l1 terikat sama l2 = 4)
        System.out.println(l2.getJari2()); //4
    }

    public static void ubahJari2(Lingkaran obj){
        obj.setJari2(4); //l2 menjadi 4
    }
}
