public class App {
    public static void main(String[] args) throws Exception {
        Canis can=new Canis("Europa", "Veige", "Labrador", false);
        Primates pr=new Primates("Africa", "Black", "Gorilla", true);
        System.out.println(can.getName());
        System.out.println(pr.getName());

    }
}
