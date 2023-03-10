import java.util.ArrayList;
import java.util.List;

public class Student implements MyMethods {
    private String name;
    private String lastName;
    private int age;
    private String pol;
    private int balance;

    public Student() {

    }

    public Student(String name, String lastName, int age, String pol, int balance) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.pol = pol;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Student{" +
                "\nname='" + name + '\'' +
                "\n lastName='" + lastName + '\'' +
                "\n age=" + age +
                "\n pol=" + pol +
                "\n balance=" + balance +
                '}';
    }

    @Override
    public void nameis(ArrayList<Student> students) {
        char name = 'M';
        char name2 = 'T';
        for (Student s : students
        ) {
            if (s.getName().charAt(0) == name) {
                System.out.println("Name with M :" + s.toString());
            } else if (s.getName().charAt(0) == name2) {
                System.out.println("name with T " + s.toString());

            }

        }
    }

    @Override
    public void ageAndMoney(ArrayList<Student> students) {
        for (Student s : students
        ) {
            if (s.age > 15 && s.balance > 2000) {
                System.out.println(s);
            }

        }

    }

    @Override
    public void richStudentBoy(ArrayList<Student> students) {
        Student rich = students.get(0);
        for (Student s : students
        ) {
            if (s.getBalance() > rich.getBalance()) {
                rich = s;
            }

        }
        System.out.println(rich.toString());
    }


    @Override
    public void richStudentGirl(ArrayList<Student> students) {
        Student rich = students.get(0);
        for (Student s : students) {
            if (s.getPol().equals("w")) {
                if (s.getBalance() > rich.getBalance()) {
                    rich = s;
                }
            }
        }
            System.out.println(rich.toString());
    }


    @Override
    public void alltudent(ArrayList<Student> students) {
        for (Student s : students
        ) {
            System.out.println(s.toString());

        }
    }

    @Override
    public void depositMoney(ArrayList<Student> students) {
        for (Student s : students
        ) {
            System.out.println(s.balance + 1000);

        }

    }

    @Override
    public void firstStudent(ArrayList<Student> students) {
        System.out.println(students.get(0));
        {

        }
    }

    @Override
    public void StudentHow(ArrayList<Student> students) {
        System.out.println("student stady :" + students.size());

    }

    @Override
    public void girlAndBoys(ArrayList<Student> students) {

        List<Student> girls = new ArrayList<>();
        List<Student> boys = new ArrayList<>();
        for (Student s : students) {
            if (s.getPol().equals("m")) {
                boys.add(s);

            } else if (s.getPol().equals("w")) {
                girls.add(s);


            }

        }
        System.out.println(boys);
        System.out.println(girls);
    }
}
