import java.util.Scanner;
public class divisibility_check
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        if(num%5==0 && num%11==0){
            System.out.println("Number is divisibile by 5 and 11");
        }
        else{
            System.out.print("Number is not divisible by 5 and 11");
        }
    }
}
