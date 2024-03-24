package Pertemuan3;

public class Latihan6 {
    public static void main(String[] args) {
        Student x = new Student(0);
        Student y = x;

        x.setNrp(01);
        y.setNrp(02);

        System.out.println(x.getNrp()); //di print pertama (2)
        Student z = new Student(0);

        z.setNrp(03);
        x = z; // karena z=3 maka x = 3

        System.out.println(x.getNrp()); //sehingga x disini itu 3
        System.out.println(y.getNrp()); //sedangkan y masih 2 krna terikat dengan x yg lama
    }
}
