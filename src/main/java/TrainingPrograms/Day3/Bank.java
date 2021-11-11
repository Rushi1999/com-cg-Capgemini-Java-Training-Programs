package TrainingPrograms.Day3;
class hdfc{
    String ifsc="hdfc00013";
    Double balance=1253.56;

    void checkBal()
    {
        System.out.println(balance);
    }
}
public class Bank {
    public static void main(String[] args) {
        hdfc hd= new hdfc();

       hd.checkBal();
        System.out.println("HDFC IFSC CODE IS: "+hd.ifsc);
    }
}
