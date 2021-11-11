package TrainingPrograms.Day4;

class Employee2 {

    int eid;
    String name;
    double salary;

    public Employee2() {
        super();
        System.out.println("zero-args constructor");
    }

    public Employee2(int eid, String name) {
        super();
        this.eid = eid;
        this.name = name;
        System.out.println("2 parameterized constructor");
    }

    public Employee2(int eid, String name, double salary) {
        super();
        this.eid = eid;
        this.name = name;
        this.salary = salary;
        System.out.println("3 parameterized constructor");
    }

    @Override
    public String toString() {
        return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
    }

//	public String toString() {
//		return "Blah Blah Blah";
//	}

}
public class ConstructorDemo {

public static void main(String[] args) {
    Employee2 emp =new Employee2();
        emp.eid = 101;
        emp.name = "Jeevan";
        emp.salary = 10.5;
        System.out.println(emp.eid + " " + emp.name + " " + emp.salary);
//		System.out.println(emp.eid + " " + emp.name + " " + emp.salary);
        System.out.println(emp.toString());

        Employee2 emp2 = new Employee2();
        emp2.eid = 102;
        emp2.name = "Ajeet";
        emp2.salary = 10.6;
        System.out.println(emp2.eid + " " + emp2.name + " " + emp2.salary);
//		System.out.println(emp2.eid + " " + emp2.name + " " + emp2.salary);
        System.out.println(emp2.toString());

        Employee2 emp3 = new Employee2(103, "Sonu", 12.75);
        System.out.println(emp3.eid + " " + emp3.name + " " + emp3.salary);
//		System.out.println(emp3.eid + " " + emp3.name + " " + emp3.salary);
        System.out.println(emp3.toString());
    }
}