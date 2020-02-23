import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {
    double age;
    double salary;
    String name;

    public Employee(double age, double salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class quesCollect5 {
    public static void main(String args[]) {
        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(new Employee(24, 45000, "nisha"));
        al.add(new Employee(25, 55000, "akshita"));
        al.add(new Employee(22, 35000, "drishti"));
        al.add(new Employee(23, 22000, "prabhat"));

        Comparator<Employee> em = Comparator.comparing(Employee::getSalary);
        Collections.sort(al, em);
        System.out.println("Sorting By Salary\n");
        System.out.println(" AGE " + "\tSALARY" + "\t   NAME");
        for (Employee emp : al) {
            System.out.println(emp.age + "\t" + emp.salary + "\t   " + emp.name);
        }
    }
}