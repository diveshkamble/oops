public class TestStack {
    public static void main(String[] args) {
        Stack stck1 = new Stack();
        Stack stck2 = new Stack();

        // add some numbers to stack
        for (int i = 0; i < 10; i++)
            stck1.push(i);
        for (int i = 10; i < 20; i++)
            stck2.push(i);

        // pop some values
        System.out.println("Stack in stck1: ");
        for (int i = 0; i < 10; i++)
            System.out.println(stck1.pop());

        System.out.println("Stack in stck2: ");
        for (int i = 10; i < 20; i++)
            System.out.println(stck2.pop());
    }
}

class Stack {
    int[] stack = new int[10];
    int tos;

    Stack() {
        this.tos = -1;
    }

    void push(int item) {
        if (tos == 9) System.out.println("Stack is full");
        else stack[++tos] = item;

    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack Underflow!");
            return 0;
        } else return stack[tos--];
    }
}
