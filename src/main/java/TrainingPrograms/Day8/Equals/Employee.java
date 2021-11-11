package TrainingPrograms.Day8.Equals;

import java.util.Objects;

public class Employee {

    int eid;
    String eName;
    double salary;

    public Employee() {
        super();
    }

    public Employee(int eid, String eName, double salary) {
        super();
        this.eid = eid;
        this.eName = eName;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return eid == employee.eid && Double.compare(employee.salary, salary) == 0 && eName.equals(employee.eName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eid, eName, salary);
    }

    @Override
    public String toString() {
        return "Employee [eid=" + eid + ", eName=" + eName + ", salary=" + salary + "]";
    }

}
