public class BoxDemo3 {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();

        // Assign values to box1's instance variables
        box1.height = 10;
        box1.width = 15;
        box1.depth = 20;

        // Assign values to box1's instance variables
        box2.height = 2;
        box2.width = 3;
        box2.depth = 4;

        box1.volume();
        box2.volume();
    }
}
