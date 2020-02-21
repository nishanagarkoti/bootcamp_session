package javaAssessment2;
interface customer_operations{
    public void add(String customer_name,String customer_address,Books books);
    public void display();
    public void checkout(int date_of_issue,int date_of_return);
}
abstract class books_operations{
    public abstract void add(String book_name, String book_author, String book_publisher);
    public abstract void delete(String book_name);
    public abstract void display();
    public abstract void submit(String book_name);
}
class Books extends books_operations{
    private String book_name;
    private String book_author;
    private String book_publisher;

    @Override
    public void add(String book_name, String book_author, String book_publisher) {
    }

    @Override
    public void delete(String book_name) {
    }

    @Override
    public void display() {
    }

    @Override
    public void submit(String book_name) {
    }
}
class Customers implements customer_operations{
    private String customer_name;
    private String customer_address;
    private int date_of_issue;
    private int date_of_return;
    @Override
    public void add(String customer_name, String customer_address, Books books) {
    }
    @Override
    public void display() {

    }
    @Override
    public void checkout(int date_of_issue, int date_of_return) {
    }
}
public class question1 {
    public static void main(String[] args) {
    }
}
