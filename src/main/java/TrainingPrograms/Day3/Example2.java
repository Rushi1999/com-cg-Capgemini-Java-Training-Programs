package TrainingPrograms.Day3;
import java.util.Arrays;
import  java.util.Scanner;
public class Example2 {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements ");
        n=sc.nextInt();
        String fruits[]=new String[n];
        System.out.println("Enter the String ");
        Scanner sc1=new Scanner(System.in);
        for(int i=0; i<n ;i++)
        {
            fruits[i]=sc1.nextLine();
        }
        for(int i = 0; i<n; i++)
        {
            for (int j = i+1; j<n; j++)
            {
                if(fruits[i].compareTo(fruits[j])>0)
                {

                    String temp = fruits[i];
                    fruits[i] = fruits[j];
                    fruits[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(fruits).toUpperCase());

//        Scanner sc=new Scanner(System.in);
//        int n;
//        System.out.println("Enter the number of elements ");
//        n=sc.nextInt();
//        String fruits[]=new String[n];
//        System.out.println("Enter the String ");
//        Scanner sc1=new Scanner(System.in);
//        for(int i=0; i<n ;i++)
//        {
//            fruits[i]=sc1.nextLine();
//        }
//        for(int i = 0; i< n; i++)
//        {
//            System.out.println(fruits[i].toUpperCase());
//        }
    }
}
