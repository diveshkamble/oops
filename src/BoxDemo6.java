public class BoxDemo6 {
    // Constructors
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();
        double vol;

        System.out.println("From BoxDemo6");

        vol = box1.getVolume();
        System.out.println("Volume of box1 is "+vol);

        vol = box2.getVolume();
        System.out.println("Volume of box2 is "+vol);
    }
}
