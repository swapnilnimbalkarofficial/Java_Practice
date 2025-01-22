public class ToyotaMain {
    public static void main(String args[]) {
        Toyota t1 = new Toyota();
        t1.name = "fortuner";
        t1.model = "s4";
        t1.color = "black";
        t1.speed = 65;
        System.out.println(t1);
        t1.run();
    }
}
