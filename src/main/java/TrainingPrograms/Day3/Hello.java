package TrainingPrograms.Day3;

public class Hello {
    static  int num=3;
    public static void main(String[] args) {


        Hello h = new Hello();
        System.out.println("Start");
        hello();
        h.hi();
        //excess static var using class name as ref
        System.out.println(Hello.num);
        System.out.println("End");
    }
    //free access for static method
    static void hello(){
        System.out.println("Hello");
    }
    //restricted excess for non-static
    void hi()
    {
        System.out.println("Hi");
    }
}
