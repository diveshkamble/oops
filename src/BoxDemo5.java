public class BoxDemo5 {
    // Adding a method that takes parameters
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();
        double vol;

        box1.setDims(10, 15, 20);
        box2.setDims(3, 6, 9);

        System.out.println("From BoxDemo5:");

        vol = box1.getVolume();
        System.out.println("Volume of box1 is " + vol);

        vol = box2.getVolume();
        System.out.println("Volume of box2 is " + vol);

    }
}
