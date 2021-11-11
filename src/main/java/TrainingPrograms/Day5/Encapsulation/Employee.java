package TrainingPrograms.Day5.Encapsulation;

public class Employee {
   private double sal=4125.00;
    private String name="Rushi";

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "sal=" + sal +
                ", name='" + name + '\'' +
                '}';
    }
}