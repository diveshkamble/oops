public class BoxDemo8 {
    // this keyword example
    // Will be modifying the parametrized constructor to width, height and depth from w,h and d in Box Class
    public static void main(String[] args) {
        Box box1 = new Box(10,15,20);
        Box box2 = new Box(3, 6 ,9);

        double vol;

        vol = box1.getVolume();
        System.out.println("Volume of box1 is "+ vol);

        vol = box2.getVolume();
        System.out.println("Volume of box2 is "+vol);

    }
}
