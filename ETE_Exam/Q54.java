package ETE_Exam;


public class Q54 {
    private int[] array;
    private int top1;
    private int top2;

    public Q54(int size) {
        array = new int[size];
        top1 = -1;
        top2 = size;
    }

    public void push1(int value) {
        if (top1 < top2 - 1) {
            array[++top1] = value;
        } else {
            System.out.println("Stack 1 overflow");
        }
    }

    public void push2(int value) {
        if (top1 < top2 - 1) {
            array[--top2] = value;
        } else {
            System.out.println("Stack 2 overflow");
        }
    }

    public int pop1() {
        if (top1 >= 0) {
            return array[top1--];
        } else {
            System.out.println("Stack 1 underflow");
            return -1;
        }
    }

    public int pop2() {
        if (top2 < array.length) {
            return array[top2++];
        } else {
            System.out.println("Stack 2 underflow");
            return -1;
        }
    }

    public static void main(String[] args) {
        Q54 ts = new Q54(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        System.out.println("Popped element from stack1 is " + ts.pop1());
        ts.push2(40);
        System.out.println("Popped element from stack2 is " + ts.pop2());
    }
}
