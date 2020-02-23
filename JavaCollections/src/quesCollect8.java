import java.util.Stack;

class SpecialStack {
    Stack<Integer> s;
    Integer minElement;

    SpecialStack() {
        s = new Stack<Integer>();
    }

    void push(Integer x) {
        if (s.isEmpty()) {
            minElement = x;
            s.push(x);
            System.out.println("Element Pushed is: " + x);
            return;
        }
        if (x < minElement) {
            s.push(2 * x - minElement);
            minElement = x;
        } else
            s.push(x);
        System.out.println("Element Pushed is: " + x);
    }

    void showMinEle() {
        System.out.println("Minimum element is: " + minElement);
    }

    void pop() {
        if (s.isEmpty()) {
            System.out.println("Stack is empty");
        }
        System.out.println("Element on top of stack removed");
        Integer t = s.pop();

        if (t < minElement) {

            System.out.println(minElement);
            minElement = 2 * minElement - t;
        } else
            System.out.println(t);
    }

};


public class quesCollect8 {
    public static void main(String args[]) {
        SpecialStack s = new SpecialStack();
        s.push(4);
        s.push(5);
        s.showMinEle();
        s.push(3);
        s.push(1);
        s.pop();
        s.showMinEle();
    }
}
