import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

class Student6 {
    Double score;
    String name;
    Double age;

    public Student6(Double score, String name, Double age) {
        this.score = score;
        this.name = name;
        this.age = age;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    static class StudentsSorting implements Comparator<Student6> {

        public int compare(Student6 stud1, Student6 stud2) {
            int ScoreCompare = stud1.getScore().compareTo(stud2.getScore());
            int NameCompare = stud1.getName().compareTo(stud2.getName());
            if (ScoreCompare == 0) {
                    if (NameCompare == 0) {
                    return ScoreCompare;
                    }
                    else{
                        return NameCompare;
                }
            } else {
                return ScoreCompare;
            }
        }
    }

    public static void main(String[] args) {

        List<Student6> al = new ArrayList<>();

        Student6 obj1 = new Student6(45.0, "Arya", 23.0);
        Student6 obj2 = new Student6(45.0, "Deep", 24.0);
        Student6 obj3 = new Student6(66.0, "Aman", 22.0);
        Student6 obj4 = new Student6(67.0, "Mary", 22.0);
        Student6 obj5 = new Student6(85.0, "Loki", 24.0);

        al.add(obj1);
        al.add(obj2);
        al.add(obj3);
        al.add(obj4);
        al.add(obj5);

        Collections.sort(al, new StudentsSorting());
        System.out.println("Sorted By Score And Name\n");
        System.out.println("Score " + "\tName" + "\t   Age");
        for (Student6 student : al) {
            System.out.println(student.score + "\t" + student.name + "\t   " + student.age);
        }
    }
}
