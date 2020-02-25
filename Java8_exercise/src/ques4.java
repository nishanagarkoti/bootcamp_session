interface emp {
    Employees display(String name, int age, String city);
}

class Employees {
    String name;
    String city;
    int age;

    Employees(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }
}

public class ques4 {
    public static void main(String[] args) {
        Employees employee1;
        emp emp1 = Employees::new;
        employee1 = emp1.display("Nisha", 22, "Delhi");
        System.out.println(employee1);

    }

}
