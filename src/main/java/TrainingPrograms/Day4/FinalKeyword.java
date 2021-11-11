package TrainingPrograms.Day4;
public class FinalKeyword {
    //	final static int numberOfOvers = 20;
    final static int NUMBER_OF_OVERS = 20;

    private static final int num = 10;
    private static int num2 = 20;

    public static void main(String[] args) {

        final int num3 = 30;
//		num3 = 35; // CE

        System.out.println(FinalKeyword.num);
        System.out.println(FinalKeyword.num2);
//		FinalDemo.num = 15; // CE
        FinalKeyword.num2 = 25;

        System.out.println(FinalKeyword.num);
        System.out.println(FinalKeyword.num2);
    }
}
