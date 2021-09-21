import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,number;
        System.out.println("Enter a number =");
        number = sc.nextInt();
        for(i=2;i<=number-1;i++)
        {
            if(number%i==0)
                break;
        }
        if (i==number)
            System.out.println("Number is prime ");
        else
            System.out.println("Number is not prime ");

    }
}
