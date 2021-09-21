import java.util.Scanner;

public class Prime_2 {
    public static void main(String[] args) {
        int i, number,x=2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit number =");
        number= sc.nextInt();
        while (number!=0)
        {
            for (i=2;i<x;i++)
            {
                if(x%i==0)
                    break;}
                if (x==i) {
                    System.out.println(i);
                    number--;
                }


            x++;


        }


    }
}
