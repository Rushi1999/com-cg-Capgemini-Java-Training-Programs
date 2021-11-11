package TrainingPrograms.Day4;

class Employee1 {

    int eid;
    String name;
    double salary;

    public Employee1() {
        System.out.println("zero-args constructor");

    }

    public Employee1(int eid, String name, double salary) {
        super();
        this.eid = eid;
        this.name = name;
        this.salary = salary;
        System.out.println("parameterized constructor");
    }

}

public class Constructor1 {

    public static void main(String[] args) {

        Employee1 emp = new Employee1();
        emp.eid = 101;
        emp.name = "Jeevan";
        emp.salary = 10.5;
        System.out.println(emp.eid + " " + emp.name + " " + emp.salary);

        Employee1 emp2 = new Employee1();
        emp2.eid = 102;
        emp2.name = "Ajeet";
        emp2.salary = 10.6;
        System.out.println(emp2.eid + " " + emp2.name + " " + emp2.salary);

        Employee1 emp3 = new Employee1(103, "Sonu", 12.75);
        System.out.println(emp3.eid + " " + emp3.name + " " + emp3.salary);

    }
}
