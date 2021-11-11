package TrainingPrograms.Day5.Encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {
        Employee emp= new Employee();
        System.out.println(emp.getSal());
        emp.setSal(12301.0);
        System.out.println(emp.getSal());
    }
}
