import java.util.Scanner;
public class weak_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Weak number");
        int num = sc.nextInt();
        if(num==1){
            System.out.println("This is MONDAY");
        }
        else if(num==2){
            System.out.println("This is TUESDAY");
        }
        else if(num==3){
            System.out.println("This is WEDNESDAY");
        }
        else if(num==4){
            System.out.println("This is THURSDAY");
        }
        else if(num==5){
            System.out.println("This is FRIDAY");
        }
        else if(num==6){
            System.out.println("This is SATURDAY");
        }
        else if(num==7){
            System.out.println("This is SUNDAY");
        }
    }
    
}
