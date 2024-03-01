public class Latihan1 {
    public static void main(String[] args) {

        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = l1;
     
        System.out.println(l1.getJari2());
        System.out.println(l2.getJari2());
     
        l2.setJari2(10);
        /*
         * l2 = l1 sama saja dengan l1 = l2
         * sehingga ketika l2 di isi dengan 10
         * l1 jg terikat mengoverwrite menjadi 10
         */
     
        System.out.println(l1.getJari2());
        System.out.println(l2.getJari2());
     
     }
}