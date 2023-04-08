public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        Box yourbox = mybox;
        double vol;

        mybox.height = 5;
        mybox.width = 5;
        mybox.depth = 5;

        // Compute volume of mybox is
        vol = mybox.height * mybox.width * mybox.depth;
        System.out.println("Volume is " + vol);
        System.out.println("Height of yourbox: " + yourbox.height + " and Height of mybox: " + mybox.height);
        yourbox.height = 6;
        System.out.println("Height of yourbox: " + yourbox.height + " and Height of mybox: " + mybox.height);

    }
}

class Box {
    double height;
    double width;
    double depth;

    void volume() {
        System.out.println("Volume is " + height * width * depth);
    }

    double getVolume() {
        return height * width * depth;
    }

    void setDims(double h,double w,double d)
    {
        width = w;
        height = h;
        depth = d;
    }

    Box(){
        System.out.println("Constructing a box.");
        width = 10;
        height = 10;
        depth = 10;
    }

    Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

}
