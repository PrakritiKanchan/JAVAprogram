import java.util.Scanner;
public class check_number {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter any number");
         int num =sc.nextInt();
         if(num>0)
         {
            System.out.println("Number is positive");
         }
         else if(num<0)
         {
            System.out.println("Number is negative");
         }
         else
         {
            System.out.println("Number is zero");
         }
}
    
    
}
