public class BoxDemo7 {
    // Parameterized Constructors
    public static void main(String[] args) {
        Box box1 = new Box(10,15,20);
        Box box2 = new Box(3,6,9);

        double vol;

        System.out.println("From BoxDemo7:");

        vol = box1.getVolume();
        System.out.println("Volume if box1 is "+vol);

        vol = box2.getVolume();
        System.out.println("Volume of box2 is "+ vol);


    }
}
