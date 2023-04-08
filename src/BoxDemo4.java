public class BoxDemo4 {
    // Returning a Value
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();
        double vol;


        box1.height = 10;
        box1.width = 15;
        box1.depth = 20;

        box2.height = 3;
        box2.width = 6;
        box2.depth = 9;

        vol = box1.getVolume();
        System.out.println("Volume of box1 is " + vol);

        vol = box2.getVolume();
        System.out.println("Volume of box2 is "+ vol);
    }
}
