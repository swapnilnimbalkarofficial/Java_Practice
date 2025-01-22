public class BikeMain {
    public static void main(String args[]) {
        Bike b1 = new Bike();
        b1.num = 6265;
        b1.name = "fzs";
        b1.type = "sports";
        System.out.println(b1);
        b1.fast();
    }
}
