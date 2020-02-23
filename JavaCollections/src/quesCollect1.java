import java.util.ArrayList;
import java.util.Iterator;

public class quesCollect1 {
    public static void main(String args[]) {
        ArrayList<Float> al = new ArrayList<Float>();
        al.add(10.2f);
        al.add(13.21f);
        al.add(4.6f);
        al.add(5.3f);
        al.add(2.2f);
        float sum = 0;
        System.out.println("Value added are: ");
        Iterator<Float> itr = al.iterator();
        while (itr.hasNext()) {
            float value = itr.next();
            System.out.println(value);
            sum = sum + value;
        }
        System.out.println("\nSum of elements is: " + sum);
    }
}
