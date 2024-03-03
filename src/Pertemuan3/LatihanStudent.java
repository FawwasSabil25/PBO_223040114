public class LatihanStudent {
    public static void main(String[] args) {
        Student x = new Student(0);
        Student y = x;

        x.setNrp(01);
        y.setNrp(02);
        System.out.println(x.getNrp());
        Student z = new Student(0);
        z.setNrp(03);
        x = y;

        System.out.println(x.getNrp());
        System.out.println(y.getNrp());
    }
}
