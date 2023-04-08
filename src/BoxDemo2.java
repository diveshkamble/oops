public class BoxDemo2 {
    public static void main(String[] args) {

        /*
        Box mybox1;  //declare reference to object
        mybox1 = new Box(); //dynamically allocate a box object during runtime
        mybox simply holds the memory address of the actual Box object and is similar to pointers in C++
         */

        Box mybox1 = new Box(); //Since no constructor is defined, we are using default no-constructor
        Box mybox2 = new Box();
        double vol;

        // assign value to mybox1 instance variable
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        // assign value to mybox2 instance variable
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // Compute volume of first box
        vol = mybox1.height * mybox1.width * mybox1.depth;
        System.out.println("Volume of mybox 1 is: "+vol);

        // Compute volume of first box
        vol = mybox2.height * mybox2.width * mybox2.depth;
        System.out.println("Volume of mybox 1 is: "+vol);


    }
}
