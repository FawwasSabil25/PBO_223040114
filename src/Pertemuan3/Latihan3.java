public class Latihan3 {
    public static void main(String[] args) {
        
        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = l1;
        Lingkaran l3 = new Lingkaran(7);

        System.out.println(l1.getJari2());
        System.out.println(l2.getJari2());
        System.out.println(l3.getJari2());

        l2 = null; //l2 tidak lagi mereprentasi ke l1

        System.out.println(l1.getJari2());
        System.out.println(l2.getJari2()); //error Cannot invoke "Lingkaran.getJari2()" because "l2" is null
        System.out.println(l3.getJari2());

    }
}
