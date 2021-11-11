package TrainingPrograms.Day5.Inheritance;
class parent{
    int num1;
}
class child extends parent{
    int num2;
}
public class Inheritance {
    public static void main(String[] args) {

        child ch=new child();
        ch.num2=10;
        ch.num1=20;
        System.out.println(ch.num2);
        System.out.println(ch.num1);
    }
}
