import java.util.Scanner;

public class Sum_of_digits{
    public static void main(String[] args){
        int num,sum=0;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();
        while(num!=0){
            int rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("Sum of Digits: "+sum);
    }
}